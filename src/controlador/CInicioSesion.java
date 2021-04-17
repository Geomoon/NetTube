/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.MAdmin;
import model.MPelicula;
import model.MSerie;
import model.MUsuario;
import model.Usuario;
import vista.vistaInicio;
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
    private vistaInicio vInicio;

    public CInicioSesion(MAdmin admin, MUsuario usuario, vistaPanelInicioSesion vista, vistaInicio vInicio) {
        this.mAdmin = admin;
        this.mUsuario = usuario;
        this.vista = vista;
        this.vInicio = vInicio;
        panelLayout = vInicio.getPanelContenido();
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
        String password = String.valueOf(vista.getTextContrasena().getPassword());

        if (usuario == null) {
            JOptionPane.showMessageDialog(vista, "Al parecer aún no tienes una cuenta :(", "Usuario no encontrado", JOptionPane.QUESTION_MESSAGE, null);
        } else if (usuario.getPassword().equals(password)) {
            if (usuario instanceof MAdmin) {
                System.out.println("admin");
                CPerfilAdmin cPerfilAdmin = new CPerfilAdmin((MAdmin) usuario, new vistaPrincipal());   //inicia la ventana principal
                cPerfilAdmin.initControl();
            }
            if (usuario instanceof MUsuario) {
                System.out.println("usuario");
                CPerfilUser cPerfilUser = new CPerfilUser(
                        (MUsuario) usuario,
                        new vistaPrincipal(),
                        new vistaPerfil(),
                        new MSerie(),
                        new MPelicula()
                );
                cPerfilUser.initControl();
            }
            vInicio.dispose();
        } else {
            JOptionPane.showMessageDialog(vista, "Contraseña incorrecta", "Mensaje", JOptionPane.QUESTION_MESSAGE, null);
        }

    }

    private Usuario verificarDatos() {
        String email = vista.getTextUsuario().getText();

        MUsuario usuarioBD = MUsuario.obtenerPorEmail(email);
        if (usuarioBD != null) {
            System.out.println("usuario_passwd");
            return usuarioBD;
        }

        MAdmin adminBD = MAdmin.obtenerPorEmail(email);
        if (adminBD != null) {
            System.out.println("admin_passwd");
            return adminBD;
        }
        return null;
    }

    private void abrirRegistro() {
        ((CardLayout) panelLayout.getLayout()).show(panelLayout, "cardRegistro");
    }

    public void validarcampos() {
        Validaciones val = new Validaciones();

        val.LimitarCaracteres(vista.getTextUsuario(), 50);
        val.LimitarCaracteres(vista.getTextContrasena(), 32);
    }

}
