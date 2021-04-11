/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import model.Admin;
import model.MAdmin;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.Usuario;
import model.UsuarioApp;
import vista.vistaIniciosesion;
import vista.vistaPerfil;
import vista.vistaPrincipal;
import vista.vistaRegistro;

/**
 *
 * @author LUNA
 */
public class CInicioSesion {

    private MAdmin mAdmin;
    private MUsuario mUsuario;
    private vistaIniciosesion vista;

    public CInicioSesion() {
    }

    public CInicioSesion(MAdmin admin, MUsuario usuario, vistaIniciosesion vista) {
        this.mAdmin = admin;
        this.mUsuario = usuario;
        this.vista = vista;
    }

    public void initControl() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }

    private void addEvents() {
        vista.getBtnIniciosesion().addActionListener(l -> iniciarSesion());
        vista.getBtnRegistrarse().addActionListener(l -> abrirRegistro());
    }

    private void iniciarSesion() {
        Usuario usuario = verificarDatos();
        if (usuario instanceof MAdmin) {
            System.out.println("admin");
            CPerfilAdmin cPerfilAdmin = new CPerfilAdmin(new MAdmin(), new vistaPrincipal());   //inicia la ventana principal
            cPerfilAdmin.initControl();
        }
        if (usuario instanceof MUsuario) {
            System.out.println("usuario");
            CPerfilUser cPerfilUser = new CPerfilUser(
                    new MUsuario(),
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
                System.out.println("fdsaf");
                return usuarioBD;
            }
        }

        Admin adminBD = (Admin) MAdmin.obtenerPorEmail(email);
        if (adminBD != null) {
            if (adminBD.getPassword().equals(password)) {
                System.out.println("admin");
                return adminBD;
            }
        }
        return null;
    }

    private void abrirRegistro() {
        CRegistro cRegistro = new CRegistro(
                new MAdmin(),
                new MUsuario(),
                new vistaRegistro()
        );
        cRegistro.initControl();
    }
}
