/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.MAdmin;
import model.MUsuario;
import model.Usuario;
import vista.vistaPerfil;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author LUNA
 */
public class CEditarPerfil {

    private vistaPerfil vp;

    private JDialog dialog;
    private Usuario usuario;

    public CEditarPerfil(vistaPerfil vp, Usuario usuario) {
        this.vp = vp;
        this.dialog = vp.getjDialogEditarPerfil();
        this.usuario = usuario;
    }

    public void initControl() {
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);

        addEvents();
        cargarDatos();
    }

    private void addEvents() {
        ValidarDatos();
        vp.getBtnRegistrarse().addActionListener(l -> actualizar());
        vp.getBtnCancelar().addActionListener(l -> cerrar());
        vp.getBtnExaminar().addActionListener(l -> cargarFoto());
    }

    private void actualizar() {
        Usuario usuario = obtenerDatos();
        if (usuario instanceof MAdmin) {
            ((MAdmin) usuario).editar();
            System.out.println("admin");
            cerrar();
        }
        if (usuario instanceof MUsuario) {
            ((MUsuario) usuario).editar();
            System.out.println("user");
            cerrar();
        }
    }

    private void cargarDatos() {
        vp.getTextCorreo().setText(usuario.getEmail());
        vp.getTextNombre().setText(usuario.getNombre());
        vp.getjDateNacimiento().setDate(usuario.getFechaNac());

        if (usuario.getFoto() != null) {
            vp.getLblFoto().setIcon(new ImageIcon(usuario.getFoto()));
        }

        if (usuario instanceof MAdmin) {
            vp.getRadbtnAdmin().setSelected(true);
        } else {
            vp.getRadbtnCliente().setSelected(true);
        }
    }

    private Usuario obtenerDatos() {
        Usuario usuario;

        String nombre = vp.getTextNombre().getText();
        String correo = vp.getTextCorreo().getText();
        String password = String.copyValueOf(vp.getTextContrasena().getPassword());
        Date fecha = vp.getjDateNacimiento().getDate();
        Image image;
        ImageIcon icon = (ImageIcon) vp.getLblFoto().getIcon();
        image = (icon != null) ? icon.getImage() : null;

        if (Validaciones.validarNombre(nombre)) {
            if (Validaciones.validarCorreo(correo)) {
                if (vp.getTextContrasena().getText().isBlank()) {
                    vp.getLblpassseguro().setText("***Ingrese una contraseña segura***");
                } else {
                    if (fecha != null) {
                        if (vp.getRadbtnAdmin().isSelected()) {
                            usuario = new MAdmin();
                        } else {
                            usuario = new MUsuario();
                        }
                        usuario.setId(this.usuario.getId());
                        usuario.setNombre(nombre);
                        usuario.setPassword(password);
                        usuario.setEmail(correo);
                        usuario.setFechaNac(fecha);
                        usuario.setFoto(image);
                        return usuario;
                    } else {
                        JOptionPane.showMessageDialog(vp, "Ingrese su fecha de nacimiento");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(vp, "Ingrese un correo válido");
            }
        } else {
            JOptionPane.showMessageDialog(vp, "Ingrese un nombre correcto");
        }
        return null;
    }

    private void cargarFoto() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("JPG, PNG", "jpg", "png"));
        int opcion = jfc.showOpenDialog(vp);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                vp.getLblFoto().setIcon(
                        new ImageIcon(
                                CUtils.redimensionarImagen(ImageIO.read(jfc.getSelectedFile()), vp.getLblFoto())
                        ));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void cerrar() {
        dialog.dispose();
    }

    private void ValidarDatos() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vp.getTextNombre(), 50);
        val.LimitarCaracteres(vp.getTextCorreo(), 50);
        val.LimitarCaracteres(vp.getTextContrasena(), 32);
        val.ValidarLetras(vp.getTextNombre());
    }
}
