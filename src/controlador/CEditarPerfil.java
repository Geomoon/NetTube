/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.io.File;
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

    private File file;
    private CPerfilAdmin cPerfilAdmin;
    private CPerfilUser cPerfilUser;

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
        vp.getBtnCancelar().addActionListener(l -> cerrar(null));
        vp.getBtnExaminar().addActionListener(l -> cargarFoto());
    }

    private void actualizar() {
        Usuario usuario = obtenerDatos();
        if (usuario instanceof MAdmin) {
            ((MAdmin) usuario).editar();
            System.out.println("admin");
            MAdmin m = MAdmin.obtenerPorEmail(usuario.getEmail());
            cerrar(m);
        }
        if (usuario instanceof MUsuario) {
            ((MUsuario) usuario).editar();
            System.out.println("user");
            MUsuario m = MUsuario.obtenerPorEmail(usuario.getEmail());
            cerrar(m);
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
        File f = (file == null) ? null : file;
        Image image;
        ImageIcon icon = (ImageIcon) vp.getLblFoto1().getIcon();
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
                        usuario.setFile(file);
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
                file = jfc.getSelectedFile();
                vp.getLblFoto1().setIcon(
                        new ImageIcon(
                                CUtils.redimensionarImagen(ImageIO.read(file), vp.getLblFoto1())
                        ));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void cerrar(Usuario usuario) {
        dialog.dispose();
        if (usuario == null) {
            return;
        }
        if (usuario instanceof MAdmin) {
            notifyCPerfil((MAdmin) usuario);
        }
        if (usuario instanceof MUsuario) {
            notifyCPerfilUser((MUsuario) usuario);
        }
    }

    private void ValidarDatos() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vp.getTextNombre(), 50);
        val.LimitarCaracteres(vp.getTextCorreo(), 50);
        val.LimitarCaracteres(vp.getTextContrasena(), 32);
        val.ValidarLetrasTilde(vp.getTextNombre());
    }

    protected void setPerfilAdmin(CPerfilAdmin cPerfil) {
        this.cPerfilAdmin = cPerfil;
    }

    private void notifyCPerfil(MAdmin usuario) {
        cPerfilAdmin.setmAdmin(usuario);
        cPerfilAdmin.perfil();
    }

    protected void setPerfilUser(CPerfilUser cPerfil) {
        this.cPerfilUser = cPerfil;
    }

    private void notifyCPerfilUser(MUsuario usuario) {
        cPerfilUser.setmUser((MUsuario) usuario);
        cPerfilUser.perfil();
    }
}
