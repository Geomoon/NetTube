/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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

    public CPerfilUser() {
    }

    public CPerfilUser(MUsuario mUser, vistaPrincipal vista, vistaPerfil vp, MSerie mSerie, MPelicula mPeli) {
        this.mUser = mUser;
        this.vista = vista;
        this.vp = vp;
        this.mSerie = mSerie;
        this.mPeli = mPeli;
    }

    public void initControl() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }

    private void addEvents() {
        validarcampostxt();
        listar("");
        categorias();
        vista.getBtnPerfil().addActionListener(l -> perfil());
        vista.getBtnBuscar().addActionListener(l->listar(vista.getTextBuscar().getText()));
    }

    private void perfil() {
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);

        Image img = mUser.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = new ImageIcon(newimg);

        vp.getBtnReportes().setEnabled(false);
        vp.getBtnReportes().setVisible(false);
        vp.getBtnAgregar().setEnabled(false);
        vp.getBtnAgregar().setVisible(false);
        vp.getBtnAdmincontenido().setEnabled(false);
        vp.getBtnAdmincontenido().setVisible(false);

        vp.getLblFavoritos().setVisible(false);
        vp.getLblFoto().setIcon(icon);
        vp.getLblCorreo().setText(mUser.getEmail());
        vp.getLblNombre().setText(mUser.getNombre());
        vp.getLblNacimiento().setText(mUser.getFechaNac().toString());
        vista.dispose();

    }

    private void listar(String aguja) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();

        List<Pelicula> listaP = mPeli.listar();
        listaP.stream().forEach(p -> {
            Image img = p.getImagen();
            Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
            ImageIcon icon = new ImageIcon(newimg);
            vista.getPanelPeliculas().add(panelPelicula(icon, p.getTitulo(),p.getId(),p.getDescripcion()));
        });

        List<Serie> listaS = mSerie.listar();
        listaS.stream().forEach(s -> {
            Image img = s.getImagen();
            Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
            ImageIcon icon = new ImageIcon(newimg);
            vista.getPanelSeries().add(panelPelicula(icon, s.getTitulo(),s.getId(),s.getDescripcion()));
        });
    }

    private vistaPanelPelicula panelPelicula(ImageIcon foto, String titulo,String id,String desc) {

        vistaPanelPelicula vistap = new vistaPanelPelicula();
        vistap.getLbFoto().setIcon(foto);
        vistap.getLbTitulo().setText(titulo);
        MouseListener ml=new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                informacion(foto,titulo,desc,id);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        vistap.getLbFoto().addMouseListener(ml);

        return vistap;
    }
    public void validarcampostxt(){
       Validaciones val=new Validaciones();
       val.LimitarCaracteres(vista.getTextBuscar(), 30);
       val.LimitarCaracteres(vp.getTextTituloPelicula(), 30);
       val.LimitarCaracteres(vp.getTextTituloSerie(), 30);
       val.LimitarCaracteres(vp.getTextTituloCapitulo(), 30);
       val.LimitarCaracteres(vp.getTextDescripcionCapitulo(), 100);
       val.LimitarCaracteres(vp.getTextDescripcionPelicula(), 100);
       val.LimitarCaracteres(vp.getTextDescripcionSerie(), 100);
    }
    
    private void informacion(ImageIcon foto, String titulo,String id,String desc){
        vistaInformacion vi=new vistaInformacion();
        vi.setVisible(true);
        vi.getLbFoto().setIcon(foto);
        vi.getTextInformacion().setText(desc);
        vi.getLblTitulo().setText(titulo);
        
    }
    
    private void categorias(){
       List<Categoria> listaC=mCat.listar();
       listaC.stream().forEach(c ->{
           JButton btn=new JButton(c.getNombre());
           vista.getBarCategorias().add(btn);
           btn.addActionListener(l->listar(c.getId()));
       });
   }
}
