/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import model.Categoria;
import model.MCategoria;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.Pelicula;
import model.Serie;
import vista.vistaInformacion;
import vista.vistaPanelPelicula;
import vista.vistaPerfil;
import vista.vistaPrincipal;
import vista.vistaReproductorVideo;

/**
 *
 * @author User
 */
public class CPerfilUser {

    private MUsuario mUser;
    private vistaPrincipal vista;
    private vistaPerfil vp;
    private MSerie mSerie;
    private MPelicula mPeli;
    private MCategoria mCat;

    private vistaReproductorVideo vRep;
    private CReproductor cRep;

    private MenuBusqueda menu;

    public CPerfilUser() {
    }

    public CPerfilUser(MUsuario mUser, vistaPrincipal vista, vistaPerfil vp, MSerie mSerie, MPelicula mPeli) {
        this.mUser = mUser;
        this.vista = vista;
        this.vp = vp;
        this.mSerie = mSerie;
        this.mPeli = mPeli;
        mCat = new MCategoria();
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
        validarcampostxt();
        listar("");
        categorias();
        vista.getBtnPerfil().addActionListener(l -> perfil());
        vista.getBtnBuscar().addActionListener(l -> listar(vista.getTextBuscar().getText()));
        vp.getBtnEditar().addActionListener(l -> editarPerfil());
    }

    private void editarPerfil() {
        CEditarPerfil cEditar = new CEditarPerfil(vp, mUser);
        cEditar.initControl();
    }

    private void perfil() {
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);

        Image img = mUser.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = (newimg != null) ? new ImageIcon(newimg) : null;

        vp.getTgbtnCategorias().setEnabled(false);
        vp.getTgbtnCategorias().setVisible(false);
        vp.getBtnAgregar().setEnabled(false);
        vp.getBtnAgregar().setVisible(false);
        vp.getTgbtnPeliculas().setEnabled(false);
        vp.getTgbtnPeliculas().setVisible(false);
        vp.getTgbtnSeries().setEnabled(false);
        vp.getTgbtnSeries().setVisible(false);
        vp.getTgbtnReportes().setEnabled(false);
        vp.getTgbtnReportes().setVisible(false);

        vp.getLblFavoritos().setVisible(true);
        vp.getLblFoto().setIcon(icon);
        vp.getLblCorreo().setText(mUser.getEmail());
        vp.getLblNombre().setText(mUser.getNombre());
        vp.getLblNacimiento().setText(mUser.getFechaNac().toString());
        vista.dispose();

    }

    private void listar(String aguja) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();
        vista.getPanelPeliculas().removeAll();
        vista.getPanelSeries().removeAll();

        List<Pelicula> listaP = mPeli.listar(aguja, 0);
        listaP.stream().forEach(p -> {
            vista.getPanelPeliculas().add(panelPelicula(p));
        });

        List<Serie> listaS = mSerie.listar(aguja, 0);
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

    private void validarcampostxt() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vista.getTextBuscar(), 100);
        val.LimitarCaracteres(vp.getTextTituloPelicula(), 100);
        val.LimitarCaracteres(vp.getTextTituloSerie(), 100);
        val.LimitarCaracteres(vp.getTextTituloCapitulo(), 100);
        val.LimitarCaracteres(vp.getTextDescripcionCapitulo(), 500);
        val.LimitarCaracteres(vp.getTextDescripcionPelicula(), 500);
        val.LimitarCaracteres(vp.getTextDescripcionSerie(), 500);
        
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
