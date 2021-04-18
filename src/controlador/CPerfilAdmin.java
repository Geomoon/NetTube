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
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Categoria;
import model.MAdmin;
import model.MCategoria;
import model.MPelicula;
import model.MSerie;
import model.Pelicula;
import model.Serie;
import vista.vistaInformacion;
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

    private vistaReproductorVideo vRep;

    private MenuBusqueda menu;
    private CReproductor cRep;

    public CPerfilAdmin() {
    }

    public CPerfilAdmin(MAdmin mAdmin, vistaPrincipal vista) {
        this.mAdmin = mAdmin;
        this.vista = vista;

        mSerie = new MSerie();
        mPeli = new MPelicula();
        mCat = new MCategoria();
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
        validarcampo();
        listar("");
        categorias();
        vista.getBtnPerfil().addActionListener(l -> perfil());
        vp.getBtnAgregar().addActionListener(l -> vp.getjDialogAgregar().setVisible(true));
        vp.getBtnAgregarPeliculas().addActionListener(l -> agregarPeliculas());
        vp.getBtnAgregarSeries().addActionListener(l -> agregarSeries());
        vp.getBtnAgregarFotoPelicula().addActionListener(l -> cargarImagen(vp.getLblFotoPelicula()));
        vp.getBtnAgregarFotoSerie().addActionListener(l -> cargarImagen(vp.getLblFotoSerie()));
        vista.getBtnBuscar().addActionListener(l -> listar(vista.getTextBuscar().getText()));
        vp.getBtnEditar().addActionListener(l -> editarPerfil());
    }

    private void editarPerfil() {
        CEditarPerfil cEditar = new CEditarPerfil(vp, mAdmin);
        cEditar.initControl();
    }

    private void agregarPeliculas() {
        vp.getjDialogAgregarPeliculas().setLocationRelativeTo(vp);
        vp.getjDialogAgregarPeliculas().setVisible(true);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarPelicula().addActionListener(l -> vp.getjDialogAgregarPeliculas().dispose());
        vp.getComboCategoriaPelicula().removeAllItems();

        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getComboCategoriaPelicula().addItem(c.getNombre());
        });

    }

    private void agregarSeries() {
        vp.getjDialogAgregarSeries().setLocationRelativeTo(vp);
        vp.getjDialogAgregarSeries().setVisible(true);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarSerie().addActionListener(l -> vp.getjDialogAgregarSeries().dispose());
        vp.getComboCategoriaSerie().removeAllItems();

        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            vp.getComboCategoriaSerie().addItem(c.getNombre());
        });
    }

    private void agregarCategorias() {
        vp.getjDialogAgregarCategorias().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCategorias().setVisible(true);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarCategoria().addActionListener(l -> vp.getjDialogAgregarCategorias().dispose());
    }

    private void perfil() {
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);

        Image img = mAdmin.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = (newimg != null) ? new ImageIcon(newimg) : null;

        vp.getBtnReportes().setEnabled(true);
        vp.getBtnReportes().setVisible(true);
        vp.getBtnAgregar().setEnabled(true);
        vp.getBtnAgregar().setVisible(true);
        vp.getBtnAdmincontenido().setEnabled(true);
        vp.getBtnAdmincontenido().setVisible(true);

        vp.getLblFavoritos().setVisible(false);
        vp.getLblFoto().setIcon(icon);
        vp.getLblCorreo().setText(mAdmin.getEmail());
        vp.getLblNombre().setText(mAdmin.getNombre());
        vp.getLblNacimiento().setText(mAdmin.getFechaNac().toString());
        vista.dispose();

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

        Image img = peli.getImagen();
        Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
        ImageIcon icon = null;
        if (newimg != null) {
            icon = new ImageIcon(newimg);
            vistap.getLbFoto().setIcon(icon);
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
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        lb.getWidth(),
                        lb.getHeight(),
                        Image.SCALE_DEFAULT
                );

                Icon ic = new ImageIcon(icono);
                lb.setIcon(ic);
                lb.updateUI();
            } catch (IOException e) {
            }
        }
    }

    private void validarcampo() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vista.getTextBuscar(), 30);
    }

    private void reportes() {

    }

    private void informacionSerie(Serie serie) {
        vistaInformacion vi = new vistaInformacion();

        CInformacion cInformacion = new CInformacion(vi, vista, serie);
        cInformacion.setCRep(cRep);

        cInformacion.initControl();
        cRep.setSerie(serie);
    }

    private void informacionPelicula(Pelicula peli) {
        vistaInformacion vi = new vistaInformacion();

        CInformacion cInformacion = new CInformacion(vi, vista, peli);
        cInformacion.setCRep(cRep);
        cInformacion.initControl();

        cRep.setPelicula(peli);
    }

    private void categorias() {
        List<Categoria> listaC = mCat.listar();
        listaC.stream().forEach(c -> {
            JButton btn = new JButton(c.getNombre());
            vista.getBarCategorias().add(btn);
            btn.addActionListener(l -> listar(c.getId()));
        });
    }

}
