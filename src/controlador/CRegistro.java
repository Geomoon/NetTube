package controlador;

import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.MAdmin;
import model.MUsuario;
import model.Usuario;
import vista.vistaRegistro;

/**
 *
 * @author LUNA
 */
public class CRegistro {

    private MAdmin mAdmin;
    private MUsuario mUsuario;
    private vistaRegistro vista;

    public CRegistro() {
    }

    public CRegistro(MAdmin mAdmin, MUsuario mUsuario, vistaRegistro vista) {
        this.mAdmin = mAdmin;
        this.mUsuario = mUsuario;
        this.vista = vista;
    }

    public void initControl() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }

    private void addEvents() {
        vista.getBtnCancelar().addActionListener(l -> cancelar());
        vista.getBtnRegistrarse().addActionListener(l -> registrar());
        vista.getBtnExaminar().addActionListener(l -> cargarFoto());
    }

    private void registrar() {
        Usuario usuario = obtenerDatos();
        if (usuario instanceof MAdmin) {
            ((MAdmin) usuario).crear();
            cancelar(); //cierra la ventana
        }
        if (usuario instanceof MUsuario) {
            ((MUsuario) usuario).crear();
            cancelar();
        }
    }

    private Usuario obtenerDatos() {
        Usuario usuario;

        String nombre = vista.getTextNombre().getText();
        String correo = vista.getTextCorreo().getText();
        String password = String.copyValueOf(vista.getTextContrasena().getPassword());
        Date fecha = vista.getjDateNacimiento().getDate();
        Image image;
        ImageIcon icon = (ImageIcon) vista.getLblFoto().getIcon();
        image = (icon != null) ? icon.getImage() : null;

        if (Validaciones.validarNombre(nombre)) {
            if (Validaciones.validarCorreo(correo)) {
                if (fecha != null) {
                    if (vista.getRadbtnAdmin().isSelected()) {
                        usuario = new MAdmin();
                    } else {
                        usuario = new MUsuario();
                    }
                    usuario.setNombre(nombre);
                    usuario.setPassword(password);
                    usuario.setEmail(correo);
                    usuario.setFechaNac(fecha);
                    usuario.setFoto(image);
                    return usuario;
                } else {
                    JOptionPane.showMessageDialog(vista, "Ingrese su fecha de nacimiento");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Ingrese un correo válido");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un nombre correcto");
        }
        return null;
    }

    private void cargarFoto() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("JPG, PNG", "jpg", "png"));
        int opcion = jfc.showOpenDialog(vista);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                vista.getLblFoto().setIcon(
                        new ImageIcon(
                                CUtils.redimensionarImagen(ImageIO.read(jfc.getSelectedFile()), vista.getLblFoto())
                        ));
            } catch (IOException ex) {
                Logger.getLogger(CRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cancelar() {
        vista.dispose();
    }

    public vistaRegistro getVista() {
        return vista;
    }

    public void setVista(vistaRegistro vista) {
        this.vista = vista;
    }

}