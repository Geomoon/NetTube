/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.Pelicula;
import model.Serie;
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

    public CPerfilUser() {
    }

    public CPerfilUser(MUsuario mUser, vistaPrincipal vista, vistaPerfil vp, MSerie mSerie, MPelicula mPeli) {
        this.mUser = mUser;
        this.vista = vista;
        this.vp = vp;
        this.mSerie = mSerie;
        this.mPeli = mPeli;
    }
    
    public void initControl(){
        
    }
    
    private void addEvents(){
        listar();
        vista.getBtnPerfil().addActionListener(l->perfil());
    }
    
    private void perfil(){
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
        
        Image img=mUser.getFoto();
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
}
