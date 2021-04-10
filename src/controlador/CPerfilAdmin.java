/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.awt.Label;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.MAdmin;
import model.MPelicula;
import model.MSerie;
import model.Pelicula;
import model.Serie;
import vista.vistaPanelPelicula;
import vista.vistaPerfil;
import vista.vistaPrincipal;

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

    public CPerfilAdmin() {
    }

    public CPerfilAdmin(MAdmin mAdmin, vistaPrincipal vista) {
        this.mAdmin = mAdmin;
        this.vista = vista;
    }
    
    public void initControl() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }
    
    private void addEvents(){
        listar();
        vista.getBtnPerfil().addActionListener(l->perfil());
        vp.getBtnAgregar().addActionListener(l->vp.getjDialogAgregar().setVisible(true));
        vp.getBtnAgregarPeliculas().addActionListener(l->agregarPeliculas());
        vp.getBtnAgregarSeries().addActionListener(l->agregarSeries());
        vp.getBtnAgregarFotoPelicula().addActionListener(l->cargarImagen(vp.getLblFotoPelicula()));
        vp.getBtnAgregarFotoSerie().addActionListener(l->cargarImagen(vp.getLblFotoSerie()));
        
    }
    
    private void agregarPeliculas(){
        vp.getjDialogAgregarPeliculas().setLocationRelativeTo(vp);
        vp.getjDialogAgregarPeliculas().setVisible(true);
        vp.getjDialogAgregar().dispose();
    }
    private void agregarSeries(){
        vp.getjDialogAgregarSeries().setLocationRelativeTo(vp);
        vp.getjDialogAgregarSeries().setVisible(true);
        vp.getjDialogAgregar().dispose();
    }
    
    private void perfil(){
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
        
        Image img=mAdmin.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = new ImageIcon(newimg);
        
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
    
    private void listar(){
        vistaPanelPelicula vistap=new vistaPanelPelicula();
        
        List<Pelicula> listaP=mPeli.listar();        
        listaP.stream().forEach(p->{
        Image img=p.getImagen();
        Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
        ImageIcon icon = new ImageIcon(newimg);
        vista.getPanelPeliculas().add(panelPelicula(icon,p.getTitulo()));
        });
        
        List<Serie> listaS=mSerie.listar();        
        listaS.stream().forEach(s->{
        Image img=s.getImagen();
        Image newimg = CUtils.redimensionarImagen(img, vistap.getLbFoto());
        ImageIcon icon = new ImageIcon(newimg);
        vista.getPanelSeries().add(panelPelicula(icon,s.getTitulo()));
        });
    }
    
    private vistaPanelPelicula panelPelicula(ImageIcon foto,String titulo){
       
        vistaPanelPelicula vistap=new vistaPanelPelicula();
        vistap.getLbFoto().setIcon(foto);
        vistap.getLbTitulo().setText(titulo);
        
        return vistap;
    }
    
    private void cargarImagen(JLabel lb){
       JFileChooser jfc=new JFileChooser();
       jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
       FileNameExtensionFilter filtroImg = new FileNameExtensionFilter("JPG y PNG", "jpg","png");
       jfc.setFileFilter(filtroImg);
       int estado=jfc.showOpenDialog(null);
       if(estado==JFileChooser.APPROVE_OPTION){
           try {
               Image icono=ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        lb.getWidth(),
                       lb.getHeight(),
                       Image.SCALE_DEFAULT
               );
               
               Icon ic=new ImageIcon(icono);
               lb.setIcon(ic);
               lb.updateUI();
           } catch (IOException e) {
           }
       }
   }
    
   private void reportes(){
       
   }
}
