/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Admin;
import model.MAdmin;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.Usuario;
import model.UsuarioApp;
import vista.vistaPanelInicioSesion;
import vista.vistaPerfil;
import vista.vistaPrincipal;

/**
 *
 * @author LUNA
 */
public class CInicioSesion {

    private vistaPanelInicioSesion vista;
    private MAdmin mAdmin;
    private MUsuario mUsuario;

    private JPanel panelLayout;
    
    public CInicioSesion(MAdmin admin, MUsuario usuario, vistaPanelInicioSesion vista, JPanel panelLayout) {
        this.mAdmin = admin;
        this.mUsuario = usuario;
        this.vista = vista;
        this.panelLayout = panelLayout;
    }

    public void initControl() {
        addEvents();
    }
    
    private void addEvents() {
        validarcampos();
        vista.getBtnIniciosesion().addActionListener(l -> iniciarSesion());
        vista.getBtnRegistrarse().addActionListener(l -> abrirRegistro());
    }

    private void iniciarSesion() {
        Usuario usuario = verificarDatos();
        if (usuario instanceof Admin) {
            System.out.println("admin");
            CPerfilAdmin cPerfilAdmin = new CPerfilAdmin(mAdmin, new vistaPrincipal());   //inicia la ventana principal
            cPerfilAdmin.initControl();
        }
        if (usuario instanceof MUsuario) {
            System.out.println("usuario");
            CPerfilUser cPerfilUser = new CPerfilUser(
                    mUsuario,
                    new vistaPrincipal(),
                    new vistaPerfil(),
                    new MSerie(),
                    new MPelicula()
            );
            cPerfilUser.initControl();
        }
        if (usuario == null) {
            JOptionPane.showMessageDialog(vista, "Al parecer aún no tienes una cuenta :(", "?", JOptionPane.QUESTION_MESSAGE, null);
        }
    }

    private Usuario verificarDatos() {
        String email = vista.getTextUsuario().getText();
        String password = String.valueOf(vista.getTextContrasena().getPassword());

        UsuarioApp usuarioBD = (UsuarioApp) MUsuario.obtenerPorEmail(email);
        if (usuarioBD != null) {
            if (usuarioBD.getPassword().equals(password)) {
                System.out.println("usuario_passwd");
                return usuarioBD;
            }
        }

        Admin adminBD = (Admin) MAdmin.obtenerPorEmail(email);
        if (adminBD != null) {
            if (adminBD.getPassword().equals(password)) {
                System.out.println("admin_passwd");
                return adminBD;
            }
        }
        return null;
    }

    private void abrirRegistro() {
        ((CardLayout) panelLayout.getLayout()).show(panelLayout, "cardRegistro");
    }
    
        public void validarcampos(){
        Validaciones val=new Validaciones();
        
        val.LimitarCaracteres(vista.getTextUsuario(), 50);
        val.LimitarCaracteres(vista.getTextContrasena(), 32);
        
    }

}
