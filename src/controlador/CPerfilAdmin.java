/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Capitulo;
import model.Categoria;
import model.Contenido;
import model.MAdmin;
import model.MCapitulo;
import model.MCategoria;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.MVideo;
import model.Pelicula;
import model.Serie;
import model.Video;
import vista.panelAdminSeriePeli;
import vista.vistaInformacion;
import vista.vistaInformacionSeries;
import vista.vistaInicio;
import vista.vistaPanelInicioSesion;
import vista.vistaPanelPelicula;
import vista.vistaPanelRegistro;
import vista.vistaPerfil;
import vista.vistaPrincipal;
import vista.vistaReproductorVideo;

/**
 *
 * @author User
 */
public class CPerfilAdmin {

    private MAdmin mAdmin;
    private vistaPrincipal vista;
    private vistaPerfil vp;
    private MSerie mSerie;
    private MPelicula mPeli;
    private MCategoria mCat;
    private MCapitulo mCap;

    private vistaReproductorVideo vRep;

    private MenuBusqueda menu;
    private CReproductor cRep;

    private Categoria nc;
    private Serie ns;
    private Pelicula np;
    private Capitulo ncap;

    private File file; //necesario para guardar en la base de datos
    private File video;

    public CPerfilAdmin() {
    }

    public CPerfilAdmin(MAdmin mAdmin, vistaPrincipal vista) {
        this.mAdmin = mAdmin;
        this.vista = vista;

        mSerie = new MSerie();
        mPeli = new MPelicula();
        mCat = new MCategoria();
        mCap = new MCapitulo();
        vp = new vistaPerfil();
        vRep = new vistaReproductorVideo();

        menu = new MenuBusqueda(vista.getTextBuscar(), mPeli, mSerie, vista); //para sugerencias de búsqueda

    }

    public void initControl() {
        cRep = new CReproductor(vRep);

        vista.setvRep(vRep);

        CardLayout layout = (CardLayout) vista.getPanelCard().getLayout();

        vista.getPanelCard().add(vRep, "cardRep");

        layout.show(vista.getPanelCard(), "cardPrincipal");

        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }

    private void addEvents() {
        validacionesCamposLetras();
        limitacionCampostxt();
        listar("");
        categorias();
        vista.getBtnPerfil().addActionListener(l -> perfil());
        vp.getBtnPrincipal().addActionListener(l -> principal());

        vp.getBtnAgregarFotoPelicula().addActionListener(l -> cargarImagen(vp.getLblFotoPelicula()));
        vp.getBtnAgregarFotoSerie().addActionListener(l -> cargarImagen(vp.getLblFotoSerie()));
        vista.getBtnBuscar().addActionListener(l -> listar(vista.getTextBuscar().getText()));
        vp.getBtnEditar().addActionListener(l -> editarPerfil());

        vp.getBtnCategorias().addActionListener(l -> btnCategorias());
        vp.getBtnSeries().addActionListener(l -> btnSeries());
        vp.getBtnPelicula().addActionListener(l -> btnPeliculas());
        vp.getBtnReportes().addActionListener(l -> btnReportes());
        vp.getBtnAgregar().addActionListener(l -> estadoBotones(vp.getLblFavoritos().getText()));
        vp.getBtnAgregarCategoría().addActionListener(l -> metodosCategorias(vp.getLblTituloCategorias().getText(), nc));
        vp.getBtnAgregarSerie().addActionListener(l -> metodosSeries(vp.getLblTituloAgregarSeries().getText(), ns));
        vp.getBtnEditarSerie().addActionListener(l -> metodosSeries(vp.getLblTituloEditarSeries().getText(), ns));
        vp.getBtnAgregarPelicula().addActionListener(l -> metodosPeliculas(vp.getLblTituloPeliculas().getText(), np));
        vp.getBtnAgregarCapitulo().addActionListener(l -> metodosCapitulos(vp.getLblTituloCapitulos().getText(), ns, ncap));
        vp.getBtnAgregarVideoPeliculas().addActionListener(l -> elegirVideo());
        vp.getBtnAgregarVideoCapitulos().addActionListener(l -> elegirVideo());
        vp.getBtnRegistroUsuarios().addActionListener(l -> registroUsuarios());
    }

    private Categoria recibirCategoria(Categoria c) {
        nc = c;
        return nc;
    }

    private Serie recibirSerie(Serie s) {
        ns = s;
        return ns;
    }

    private Pelicula recibirPelicula(Pelicula p) {
        np = p;
        return np;
    }

    private Capitulo recibirCapitulo(Capitulo c) {
        ncap = c;
        return ncap;
    }

    private void btnCategorias() {
        vp.getLblFavoritos().setText("CATEGORIAS");
        vp.getPanelPerfil().removeAll();
        vp.getPanelPerfil().updateUI();
        vp.getBtnAgregar().setEnabled(true);
        listaCategorias();
    }

    private void btnSeries() {
        vp.getLblFavoritos().setText("SERIES");
        vp.getPanelPerfil().removeAll();
        vp.getPanelPerfil().updateUI();
        vp.getBtnAgregar().setEnabled(true);
        listaSeries();
    }

    private void btnPeliculas() {
        vp.getLblFavoritos().setText("PELICULAS");
        vp.getPanelPerfil().removeAll();
        vp.getPanelPerfil().updateUI();
        vp.getBtnAgregar().setEnabled(true);
        listaPeliculas();
    }

    private void btnReportes() {
        vp.getLblFavoritos().setText("REPORTES");
        vp.getPanelPerfil().removeAll();
        vp.getPanelPerfil().updateUI();
        vp.getBtnAgregar().setEnabled(false);

    }

    private void editarPerfil() {
        CEditarPerfil cEditar = new CEditarPerfil(vp, mAdmin);
        cEditar.setPerfilAdmin(this);
        cEditar.initControl();
    }

    private void metodosCapitulos(String titulo, Serie s, Capitulo c) {
        if (titulo.equalsIgnoreCase("agregar capitulos")) {

            nuevoCapitulo(s);

        }
        if (titulo.equalsIgnoreCase("editar capitulos")) {
            editarCapitulo(c);
        }
    }

    private void metodosPeliculas(String titulo, Pelicula p) {
        if (titulo.equalsIgnoreCase("AGREGAR PELICULAS")) {
            nuevaPelicula();
            listaPeliculas();
        }
        if (titulo.equalsIgnoreCase("EDITAR PELICULAS")) {
            editarPelicula(p);
            listaPeliculas();
        }
        file = null;
    }

    private void metodosCategorias(String titulo, Categoria c) {
        if (titulo.equalsIgnoreCase("AGREGAR CATEGORIAS")) {
            nuevaCategoria();
            listaCategorias();
        }
        if (titulo.equalsIgnoreCase("EDITAR CATEGORIAS")) {
            editarCategoria(c);
            System.out.println("categoria editada" + c.getId());
            listaCategorias();
        }
    }

    private void metodosSeries(String titulo, Serie s) {
        if (titulo.equalsIgnoreCase("AGREGAR SERIES")) {
            nuevaSerie();
            listaSeries();
        }
        if (titulo.equalsIgnoreCase("EDITAR SERIES")) {
            editarSerie(s);
        }
        file = null;
    }

    private void agregarCapitulos(Serie s) {
        limpiarCapitulos();
        vp.getjDialogAgregarCapitulos().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCapitulos().setVisible(true);
        vp.getjDialogAgregarCapitulos().setSize(571, 355);

        vp.getBtnAgregarVideoCapitulos().setEnabled(true);

        vp.getLblTituloCapitulos().setText("AGREGAR CAPITULOS");
        vp.getBtnAgregarCapitulo().setText("AGREGAR");

        Capitulo c = new Capitulo();
        recibirSerie(s);

        vp.getBtnCancelarCapitulo().addActionListener(l -> vp.getjDialogAgregarCapitulos().dispose());
    }

    private void agregarPeliculas() {
        limpiarPeliculas();
        vp.getjDialogAgregarPeliculas().setLocationRelativeTo(vp);
        vp.getjDialogAgregarPeliculas().setVisible(true);
        vp.getjDialogAgregarPeliculas().setSize(635, 398);

        vp.getLblTituloPeliculas().setText("AGREGAR PELICULAS");

        vp.getBtnCancelarPelicula().addActionListener(l -> vp.getjDialogAgregarPeliculas().dispose());
        vp.getComboCategoriaPelicula().removeAllItems();

        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getComboCategoriaPelicula().addItem(c.getNombre());
        });
        Pelicula p = new Pelicula();
        vp.getBtnAgregarPelicula().setText("AGREGAR");

    }

    private void agregarSeries() {
        limpiarSeries();
        vp.getjDialogAgregarSeries().setLocationRelativeTo(vp);
        vp.getjDialogAgregarSeries().setVisible(true);
        vp.getjDialogAgregarSeries().setSize(635, 365);
        vp.getBtnCancelarSerie().addActionListener(l -> vp.getjDialogAgregarSeries().dispose());
        vp.getComboCategoriaSerie().removeAllItems();

        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getComboCategoriaSerie().addItem(c.getNombre());
        });
        Serie s = new Serie();
        vp.getLblTituloAgregarSeries().setText("AGREGAR SERIES");
        vp.getBtnAgregarSerie().setText("AGREGAR");

    }

    private void agregarCategorias() {
        limpiarCategorias();
        vp.getjDialogAgregarCategorias().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCategorias().setVisible(true);
        vp.getjDialogAgregarCategorias().setSize(449, 307);
        vp.getBtnCancelarCategoria().addActionListener(l -> vp.getjDialogAgregarCategorias().dispose());

        Categoria c = new Categoria();

        vp.getLblTituloCategorias().setText("AGREGAR CATEGORIAS");
        vp.getBtnAgregarCategoría().setText("AGREGAR");

    }

    private void principal() {
        categorias();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vp.dispose();
    }

    protected void perfil() {
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);

        Image img = mAdmin.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = (newimg != null) ? new ImageIcon(newimg) : null;

        vp.getBtnCategorias().setEnabled(true);
        vp.getBtnCategorias().setVisible(true);
        vp.getBtnAgregar().setEnabled(true);
        vp.getBtnAgregar().setVisible(true);
        vp.getBtnPelicula().setEnabled(true);
        vp.getBtnPelicula().setVisible(true);
        vp.getBtnSeries().setEnabled(true);
        vp.getBtnSeries().setVisible(true);
        vp.getBtnReportes().setEnabled(true);
        vp.getBtnReportes().setVisible(true);
        vp.getBtnRegistroUsuarios().setEnabled(true);
        vp.getBtnRegistroUsuarios().setVisible(true);

        vp.getLblFavoritos().setVisible(false);
        vp.getLblFoto().setIcon(icon);
        vp.getLblCorreo().setText(mAdmin.getEmail());
        vp.getLblNombre().setText(mAdmin.getNombre());
        vp.getLblNacimiento().setText(mAdmin.getFechaNac().toString());
        vista.setVisible(false);

    }

    private void listar(String text) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();
        vista.getPanelPeliculas().removeAll();
        vista.getPanelSeries().removeAll();

        List<Pelicula> listaP = mPeli.listar(text, 0);
        listaP.stream().forEach(p -> {
            vista.getPanelPeliculas().add(panelPelicula(p));
        });

        List<Serie> listaS = mSerie.listar(text, 0);
        listaS.stream().forEach(s -> {
            vista.getPanelSeries().add(panelSerie(s));
        });

        vista.getPanelPeliculas().updateUI();
        vista.getPanelSeries().updateUI();
    }

    private vistaPanelPelicula panelSerie(Serie serie) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();

        vistap.getLbFoto().setSize(109, 129);

        Image img = serie.getImagen();
        Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
        ImageIcon icon = null;
        if (newimg != null) {
            icon = new ImageIcon(newimg);
            vistap.getLbFoto().setIcon(icon);
        }

        vistap.getLbTitulo().setText(serie.getTitulo());
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                informacionSerie(serie);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        vistap.getLbFoto().addMouseListener(ml);

        return vistap;
    }

    private vistaPanelPelicula panelPelicula(Pelicula peli) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();

        vistap.getLbFoto().setSize(109, 129);

        Image img = peli.getImagen();
        if (img != null) {
            Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
            ImageIcon icon = null;
            if (newimg != null) {
                icon = new ImageIcon(newimg);
                vistap.getLbFoto().setIcon(icon);
            }
        }

        vistap.getLbTitulo().setText(peli.getTitulo());
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                informacionPelicula(peli);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        vistap.getLbFoto().addMouseListener(ml);

        return vistap;
    }

    private void cargarImagen(JLabel lb) {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtroImg = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        jfc.setFileFilter(filtroImg);
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                file = jfc.getSelectedFile();
                System.out.println(file.getName());
                Image icono = ImageIO.read(file).getScaledInstance(
                        lb.getWidth(),
                        lb.getHeight(),
                        Image.SCALE_DEFAULT
                );

                Icon ic = new ImageIcon(icono);
                lb.setIcon(ic);
                lb.updateUI();
            } catch (IOException e) {
                file = null;
            }
        }
    }

    private void reportes() {

    }

    private void informacionSerie(Serie serie) {
        vistaInformacionSeries vi = new vistaInformacionSeries();

        CInformacion cInformacion = new CInformacion(vi, vista, serie);
        cInformacion.setCRep(cRep);
        cInformacion.initControl();

    }

    private void informacionPelicula(Pelicula peli) {
        vistaInformacion vi = new vistaInformacion();

        CInformacion cInformacion = new CInformacion(vi, vista, peli);
        cInformacion.setCRep(cRep);
        cInformacion.initControl();

    }

    private void categorias() {
        vista.getBarCategorias().removeAll();
        JButton btnp = new JButton("TODO");
        btnp.addActionListener(l -> listar(""));
        vista.getBarCategorias().add(btnp);
        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            JButton btn = new JButton(c.getNombre());
            vista.getBarCategorias().add(btn);
            btn.addActionListener(l -> listar(c.getId()));
        });
    }

    private void validacionesCamposLetras() {
        Validaciones val = new Validaciones();

        val.ValidarLetrasNumerosTildes(vp.getTextTituloSerie());
        val.ValidarLetrasNumerosTildes(vp.getTextTituloCapitulo());
        val.ValidarLetrasNumerosTildes(vp.getTextTituloCategoria());
        val.ValidarLetrasNumerosTildes(vp.getTextTituloPelicula());
        val.ValidarcamposDescripcionContenido(vp.getTextDescripcionCapitulo());
        val.ValidarcamposDescripcionContenido(vp.getTextDescripcionCategoria());
        val.ValidarcamposDescripcionContenido(vp.getTextDescripcionPelicula());
        val.ValidarcamposDescripcionContenido(vp.getTextDescripcionSerie());
    }

    private void limitacionCampostxt() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vista.getTextBuscar(), 100);
        val.LimitarCaracteres(vp.getTextTituloPelicula(), 100);
        val.LimitarCaracteres(vp.getTextTituloSerie(), 100);
        val.LimitarCaracteres(vp.getTextTituloCapitulo(), 100);
        val.LimitarCaracteres(vp.getTextTituloCategoria(), 100);
        val.LimitarCaracteres(vp.getTextDescripcionCapitulo(), 500);
        val.LimitarCaracteres(vp.getTextDescripcionCategoria(), 500);
        val.LimitarCaracteres(vp.getTextDescripcionPelicula(), 500);
        val.LimitarCaracteres(vp.getTextDescripcionSerie(), 500);
    }

    private void nuevaCategoria() {
        if (vp.getTextTituloCategoria().getText().isBlank() || vp.getTextDescripcionCategoria().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            MCategoria nc = new MCategoria("0", vp.getTextTituloCategoria().getText(), vp.getTextDescripcionCategoria().getText());
            if (nc.crear()) {
                JOptionPane.showMessageDialog(vista, "Categoria creada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al crear la categoría");
            }
        }

    }

    private void nuevaPelicula() {
        if (vp.getTextTituloPelicula().getText().isBlank() || vp.getTextDescripcionPelicula().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            List<Categoria> listaC = mCat.categoriaId(vp.getComboCategoriaPelicula().getSelectedItem().toString());
            Categoria cat = listaC.get(0);

            String titulo = vp.getTextTituloPelicula().getText();
            String descripcion = vp.getTextDescripcionPelicula().getText();
            ImageIcon ic = (ImageIcon) vp.getLblFotoPelicula().getIcon();

            Video vid = nuevoVideo(Pelicula.DIR + titulo);

            MPelicula np = new MPelicula("1", titulo, descripcion, ic.getImage(), cat, vid);
            np.setFile(file);
            if (np.crear()) {
                JOptionPane.showMessageDialog(vista, "Pelicula creada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al crear la pelicula");
            }

        }

    }

    private void nuevaSerie() {
        if (vp.getTextTituloSerie().getText().isBlank() || vp.getTextDescripcionSerie().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            List<Categoria> listaC = mCat.categoriaId(vp.getComboCategoriaSerie().getSelectedItem().toString());
            Categoria cat = listaC.get(0);

            List<Capitulo> listaCap = new ArrayList<>();

            String titulo = vp.getTextTituloSerie().getText();
            String descripcion = vp.getTextDescripcionSerie().getText();
            ImageIcon ic = (ImageIcon) vp.getLblFotoSerie().getIcon();

            MSerie ns = new MSerie("1", titulo, descripcion, ic.getImage(), cat, listaCap);
            ns.setFile(file);
            if (ns.crear()) {
                JOptionPane.showMessageDialog(vista, "Serie creada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al crear la serie");
            }

        }

    }

    private void nuevoCapitulo(Serie s) {
        if (vp.getTextTituloCapitulo().getText().isBlank() || vp.getTextDescripcionCapitulo().getText().isBlank() || vp.getLblVideoCapitulos().getText().equalsIgnoreCase("sin video....")) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            String titulo = vp.getTextTituloCapitulo().getText();
            String descripcion = vp.getTextDescripcionCapitulo().getText();

            Video vid = nuevoVideo(Serie.DIR + titulo);

            MCapitulo nc = new MCapitulo("", titulo, descripcion, vid, s);
            listaCapitulos(s);
            if (nc.crear()) {
                JOptionPane.showMessageDialog(vista, "Capítulo creado correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al crear el capítulo");
            }
        }
    }

    private void estadoBotones(String titulo) {
        if (titulo.equalsIgnoreCase("CATEGORIAS")) {
            agregarCategorias();
            listaCategorias();
        }
        if (titulo.equalsIgnoreCase("PELICULAS")) {
            agregarPeliculas();
            listaPeliculas();
            System.out.println("if");
        }
        if (titulo.equalsIgnoreCase("SERIES")) {
            agregarSeries();
            listaSeries();
        }
        if (titulo.equalsIgnoreCase("REPORTES")) {

        }

    }

    private void listaPeliculas() {
        vp.getPanelPerfil().removeAll();
        List<Pelicula> listaP = mPeli.listar("", 0);
        listaP.stream().forEach(p -> {
            vp.getPanelPerfil().add(panelAdminPeli(p));
            System.out.println("f");
        });
        vp.getPanelPerfil().updateUI();
    }

    private void listaSeries() {
        vp.getPanelPerfil().removeAll();
        List<Serie> listaS = mSerie.listar("", 0);
        listaS.stream().forEach(s -> {
            vp.getPanelPerfil().add(panelAdminSerie(s));
        });
        vp.getPanelPerfil().updateUI();
    }

    private void listaCategorias() {
        vp.getPanelPerfil().removeAll();
        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getPanelPerfil().add(panelAdminCategoria(c));
        });
        vp.getPanelPerfil().updateUI();
    }

    private void listaCapitulos(Serie s) {
        vp.getPanelCapitulos().removeAll();
        List<Capitulo> listaC = mCap.buscarCapitulosSerie(s.getId());
        listaC.stream().forEach(c -> {
            vp.getPanelCapitulos().add(panelAdminCapitulos(c));
        });
        vp.getPanelCapitulos().updateUI();
    }

    private panelAdminSeriePeli panelAdminPeli(Pelicula p) {
        panelAdminSeriePeli np = new panelAdminSeriePeli();
        MPelicula mp = new MPelicula(p.getId(), p.getTitulo(), p.getDescripcion(), p.getImagen(), p.getCategoria(), p.getVideo());
        np.getTextId().setText(p.getId());
        np.getTextTitulo().setText(p.getTitulo());
        np.getBtnEliminar().addActionListener(l -> mp.eliminar());
        np.getBtnInfo().addActionListener(l -> infoPelicula(p));

        return np;
    }

    private panelAdminSeriePeli panelAdminSerie(Serie s) {
        panelAdminSeriePeli np = new panelAdminSeriePeli();
        MSerie ms = new MSerie(s.getId(), s.getTitulo(), s.getDescripcion(), s.getImagen(), s.getCategoria(), s.getCapitulos());
        np.getTextId().setText(s.getId());
        np.getTextTitulo().setText(s.getTitulo());
        np.getBtnEliminar().addActionListener(l -> ms.eliminar());
        np.getBtnInfo().addActionListener(l -> infoSerie(s));

        return np;
    }

    private panelAdminSeriePeli panelAdminCategoria(Categoria c) {
        panelAdminSeriePeli np = new panelAdminSeriePeli();
        np.getTextId().setText(c.getId());
        np.getTextTitulo().setText(c.getNombre());
        np.getBtnEliminar().addActionListener(l -> eliminarCategoria(c));
        np.getBtnInfo().addActionListener(l -> infoCateogoria(c));
        System.out.println(c.getId());

        return np;
    }

    private void eliminarCategoria(Categoria c) {
        MCategoria mc = new MCategoria(c.getId(), c.getNombre(), c.getDescripcion());
        mc.eliminar();
        listaCategorias();
    }

    private panelAdminSeriePeli panelAdminCapitulos(Capitulo c) {
        panelAdminSeriePeli np = new panelAdminSeriePeli();
        MCapitulo mc = new MCapitulo();
        mc.setId(c.getId());
        mc.setTitulo(c.getTitulo());
        mc.setDescripcion(c.getDescripcion());
        mc.setVideo(c.getVideo());
        mc.setSerie(c.getSerie());

        np.getTextId().setText(c.getId());
        np.getTextTitulo().setText(c.getTitulo());
        np.getBtnEliminar().addActionListener(l -> mc.eliminar());
        np.getBtnInfo().addActionListener(l -> infoCapitulo(c));

        return np;
    }

    private void infoCapitulo(Capitulo c) {
        ncap = c;
        vp.getjDialogAgregarCapitulos().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCapitulos().setVisible(true);
        vp.getjDialogAgregarCapitulos().setSize(571, 305);

        vp.getTextTituloCapitulo().setText(c.getTitulo());
        vp.getTextDescripcionCapitulo().setText(c.getDescripcion());

        vp.getBtnAgregarVideoCapitulos().setEnabled(false);
        vp.getLblVideoCapitulos().setText("No se puede editar el video");
        vp.getLblTituloCapitulos().setText("EDITAR CAPITULOS");
        vp.getBtnAgregarCapitulo().setText("GUARDAR");

        recibirCapitulo(c);

    }

    private void editarCapitulo(Capitulo c) {
        if (vp.getTextTituloCapitulo().getText().isBlank() || vp.getTextDescripcionCapitulo().getText().isBlank() || vp.getLblVideoCapitulos().getText().equalsIgnoreCase("sin video....")) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            String titulo = vp.getTextTituloCapitulo().getText();
            String descripcion = vp.getTextDescripcionCapitulo().getText();

            MCapitulo nc = new MCapitulo(c.getId(), titulo, descripcion, c.getVideo(), c.getSerie());
            if (nc.editar()) {
                JOptionPane.showMessageDialog(vista, "Capítulo editado correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al editar el capítulo");
            }
        }
    }

    private void infoSerie(Serie s) {
        limpiarSerieEdit();
        vp.getjDialogEditarSeries().setLocationRelativeTo(vp);
        vp.getjDialogEditarSeries().setVisible(true);
        vp.getjDialogEditarSeries().setSize(679, 613);
        vp.getBtnCancelarSerieEdit().addActionListener(l -> vp.getjDialogEditarSeries().dispose());
        vp.getComboCategoriaSerieEdit().removeAllItems();
        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getComboCategoriaSerieEdit().addItem(c.getNombre());
        });

        listaCapitulos(s);

        vp.getTextTituloSerieEdit().setText(s.getTitulo());
        vp.getTextDescripcionSerieEdit().setText(s.getDescripcion());
        if (s.getImagen() != null) {
            vp.getLblFotoSerieEdit().setIcon(new ImageIcon(s.getImagen()));
        }

        for (int i = 0; i < vp.getComboCategoriaSerieEdit().getItemCount(); i++) {
            if (vp.getComboCategoriaSerieEdit().getItemAt(i).equalsIgnoreCase(s.getCategoria().getNombre())) {
                vp.getComboCategoriaSerieEdit().setSelectedIndex(i);
            }
        }

        vp.getBtnNuevoCapitulo().addActionListener(l -> agregarCapitulos(s));
        vp.getLblTituloEditarSeries().setText("EDITAR SERIES");
        vp.getBtnEditarSerie().setText("GUARDAR");
        recibirSerie(s);
    }

    private void editarSerie(Serie s) {
        if (vp.getTextTituloSerieEdit().getText().isBlank() || vp.getTextDescripcionSerieEdit().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            List<Categoria> listaC = mCat.categoriaId(vp.getComboCategoriaSerieEdit().getSelectedItem().toString());
            Categoria cat = listaC.get(0);
            System.out.println(cat.getNombre());

            String titulo = vp.getTextTituloSerieEdit().getText();
            String descripcion = vp.getTextDescripcionSerieEdit().getText();
            ImageIcon ic = (ImageIcon) vp.getLblFotoSerieEdit().getIcon();
            MSerie ns = new MSerie();

            ns = new MSerie(s.getId(), titulo, descripcion, ic.getImage(), cat, s.getCapitulos());

            if (ns.editar()) {
                JOptionPane.showMessageDialog(vista, "Serie editada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al editar la serie");
            }

        }
    }

    private void infoCateogoria(Categoria c) {
        System.out.println("Info categoria" + c.getId());
        vp.getjDialogAgregarCategorias().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCategorias().setVisible(true);
        vp.getjDialogAgregarCategorias().setSize(449, 307);
        vp.getBtnCancelarCategoria().addActionListener(l -> vp.getjDialogAgregarCategorias().dispose());

        vp.getTextTituloCategoria().setText(c.getNombre());
        vp.getTextDescripcionCategoria().setText(c.getDescripcion());

        vp.getLblTituloCategorias().setText("EDITAR CATEGORIAS");
        vp.getBtnAgregarCategoría().setText("GUARDAR");

        recibirCategoria(c);

    }

    private void editarCategoria(Categoria c) {
        if (vp.getTextTituloCategoria().getText().isBlank() || vp.getTextDescripcionCategoria().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            MCategoria nc = new MCategoria(c.getId(), vp.getTextTituloCategoria().getText(), vp.getTextDescripcionCategoria().getText());
            if (nc.editar()) {
                JOptionPane.showMessageDialog(vista, "Categoria editada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al editar la categoría");
            }
        }
    }

    private void infoPelicula(Pelicula p) {

        agregarPeliculas();
        vp.getTextTituloPelicula().setText(p.getTitulo());
        vp.getTextDescripcionPelicula().setText(p.getDescripcion());
        vp.getLblFotoPelicula().setIcon(new ImageIcon(p.getImagen()));

        for (int i = 0; i < vp.getComboCategoriaPelicula().getItemCount(); i++) {
            if (vp.getComboCategoriaPelicula().getItemAt(i).equalsIgnoreCase(p.getCategoria().getNombre())) {
                vp.getComboCategoriaPelicula().setSelectedIndex(i);
            }
        }
        vp.getLblTituloPeliculas().setText("EDITAR PELICULAS");
        vp.getBtnAgregarPelicula().setText("GUARDAR");

        recibirPelicula(p);
    }

    private void editarPelicula(Pelicula p) {
        if (vp.getTextTituloPelicula().getText().isBlank() || vp.getTextDescripcionPelicula().getText().isBlank()) {
            JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
        } else {
            List<Categoria> listaC = mCat.categoriaId(vp.getComboCategoriaPelicula().getSelectedItem().toString());
            Categoria cat = listaC.get(0);

            Video vid = new Video();

            String titulo = vp.getTextTituloPelicula().getText();
            String descripcion = vp.getTextDescripcionPelicula().getText();
            ImageIcon ic = (ImageIcon) vp.getLblFotoPelicula().getIcon();

            MPelicula np = new MPelicula(p.getId(), titulo, descripcion, ic.getImage(), cat, vid);
            if (np.editar()) {
                JOptionPane.showMessageDialog(vista, "Pelicula editada correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al editar la pelicula");
            }

        }
    }

    private void limpiarPeliculas() {

        vp.getTextTituloPelicula().setText("");
        vp.getTextDescripcionPelicula().setText("");
        vp.getLblFotoPelicula().setIcon(null);
        vp.getLblVideoPeliculas().setText("SIN VIDEO....");
    }

    private void limpiarSeries() {
        vp.getTextTituloSerie().setText("");
        vp.getTextDescripcionSerie().setText("");
        vp.getLblFotoSerie().setIcon(null);
    }

    private void limpiarCategorias() {
        vp.getTextTituloCategoria().setText("");
        vp.getTextDescripcionCategoria().setText("");
    }

    private void limpiarCapitulos() {
        vp.getLblVideoCapitulos().setText("SIN VIDEO....");
        vp.getTextTituloCapitulo().setText("");
        vp.getTextDescripcionCapitulo().setText("");
    }

    private void limpiarSerieEdit() {
        vp.getTextTituloSerieEdit().setText("");
        vp.getTextDescripcionSerieEdit().setText("");
        vp.getLblFotoSerieEdit().setIcon(null);
        vp.getPanelCapitulos().removeAll();
    }

    public MAdmin getmAdmin() {
        return mAdmin;
    }

    public void setmAdmin(MAdmin mAdmin) {
        this.mAdmin = mAdmin;
    }

    private void elegirVideo() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtroImg = new FileNameExtensionFilter("MP4", "mp4");
        jfc.setFileFilter(filtroImg);
        int estado = jfc.showOpenDialog(null);

        video = null;

        if (estado == JFileChooser.APPROVE_OPTION) {
            video = jfc.getSelectedFile();

            if (vp.getLblTituloCapitulos().getText().equalsIgnoreCase("agregar capitulos")) {
                vp.getLblVideoCapitulos().setText(video.getName());
            } else {
                vp.getLblVideoPeliculas().setText(video.getName());
            }

        }
    }

    private Video nuevoVideo(String dir) {
        Video v = null;

        File f = video;
        String direccion = dir + "/";
        System.out.println(direccion);

        MVideo mVideo = new MVideo();
        mVideo.setDir(direccion + f.getName());
        Mensaje m = new Mensaje();
        m.run();
        if (EnvioPOST.sendVideo(f, direccion.substring(1))) {
            JOptionPane.showMessageDialog(vRep, "El video se ha subido al servidor");
            if (mVideo.crear()) {
                JOptionPane.showMessageDialog(vRep, "Video registrado en la base de datos");
                v = mVideo.buscar(dir);
            }
        }
        m.interrupt();

        return v;
    }

    private void registroUsuarios() {
        CInicio inicio = new CInicio(
                new vistaInicio(),
                new MAdmin(),
                new MUsuario(),
                new vistaPanelRegistro(),
                new vistaPanelInicioSesion()
        );

        inicio.initControlAdmin();
    }

    private class Mensaje extends Thread {

        Mensaje() {
        }

        @Override
        public void run() {
        }
    }

}
