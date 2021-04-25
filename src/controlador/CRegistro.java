package controlador;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.MAdmin;
import model.MUsuario;
import model.Usuario;
import vista.vistaInicio;
import vista.vistaPanelRegistro;

/**
 *
 * @author LUNA
 */
public class CRegistro {

    private MAdmin mAdmin;
    private MUsuario mUsuario;
    private vistaPanelRegistro vista;

    private JPanel panelLayout;
    private vistaInicio vInicio;

    private File file;

    public CRegistro() {
    }

    public CRegistro(MAdmin mAdmin, MUsuario mUsuario, vistaPanelRegistro vista, vistaInicio vInicio) {
        this.mAdmin = mAdmin;
        this.mUsuario = mUsuario;
        this.vista = vista;
        this.vInicio = vInicio;
        panelLayout = vInicio.getPanelContenido();
    }

    public void initControl() {
        addEvents();
    }
    
    public void initControlAdmin() {
        addEventsAdmin();
    }

    private void addEvents() {
        ValidarDatos();
        vista.getBtnCancelar().addActionListener(l -> cancelar());
        vista.getBtnRegistrarse().addActionListener(l -> registrar());
        vista.getBtnExaminar().addActionListener(l -> cargarFoto());
    }
    
    private void addEventsAdmin() {
        ValidarDatos();
        vista.getBtnCancelar().addActionListener(l -> vInicio.dispose());
        vista.getBtnRegistrarse().addActionListener(l -> registrarAdmin());
        vista.getBtnExaminar().addActionListener(l -> cargarFoto());
    }

    private void registrar() {
        Usuario usuario = obtenerDatos();
        if (usuario instanceof MAdmin) {
            ((MAdmin) usuario).crear();
            System.out.println("admin");
            cancelar(); //cierra la ventana
        }
        if (usuario instanceof MUsuario) {
            ((MUsuario) usuario).crear();
            System.out.println("user");
            cancelar();
        }

    }
    
    private void registrarAdmin() {
        Usuario usuario = obtenerDatos();
        if (usuario instanceof MAdmin) {
            ((MAdmin) usuario).crear();
            System.out.println("admin");
            vInicio.dispose();
        }
        if (usuario instanceof MUsuario) {
            ((MUsuario) usuario).crear();
            System.out.println("user");
            vInicio.dispose();
        }

    }

    private Usuario obtenerDatos() {
        Usuario usuario;

        String nombre = vista.getTextNombre().getText();
        String correo = vista.getTextCorreo().getText();
        String password = String.copyValueOf(vista.getTextContrasena().getPassword());
        Date fecha = vista.getjDateNacimiento().getDate();
        File f = (this.file == null) ? null : this.file;
        Image image;
        ImageIcon icon = (ImageIcon) vista.getLblFoto().getIcon();
        image = (icon != null) ? icon.getImage() : null;

        if (Validaciones.validarNombre(nombre)) {
            if (Validaciones.validarCorreo(correo)) {
                if (MAdmin.obtenerPorEmail(correo) == null && MUsuario.obtenerPorEmail(correo) == null) {
                    if (vista.getTextContrasena().getText().isBlank()) {
                        vista.getLblpassseguro().setText("***Ingrese una contraseña segura***");
                    } else {
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
                            usuario.setFile(f);
                            return usuario;
                        } else {
                            JOptionPane.showMessageDialog(vista, "Ingrese su fecha de nacimiento");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Este correo ya está registrado");
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
                file = jfc.getSelectedFile();
                vista.getLblFoto().setIcon(
                        new ImageIcon(
                                CUtils.redimensionarImagen(ImageIO.read(file), vista.getLblFoto())
                        ));
            } catch (IOException ex) {
                Logger.getLogger(CRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cancelar() {
        ((CardLayout) panelLayout.getLayout()).show(panelLayout, "cardSesion");
    }

    public void ValidarDatos() {
        Validaciones val = new Validaciones();
        val.LimitarCaracteres(vista.getTextNombre(), 50);
        val.LimitarCaracteres(vista.getTextCorreo(), 50);
        val.LimitarCaracteres(vista.getTextContrasena(), 32);
        val.ValidarLetrasTilde(vista.getTextNombre());
    }
    
    public void registroUsuarios(){
        vista.getRadbtnAdmin().setVisible(false);
        vista.getRadbtnCliente().setSelected(true);
        vista.getRadbtnCliente().setVisible(false);
        vista.getLblTipoUsuario().setVisible(false);
    }
    
    public void registroAdmin(){
        vista.getRadbtnAdmin().setVisible(true);
        vista.getRadbtnCliente().setVisible(true);
        vista.getLblTipoUsuario().setVisible(true);
    }
}
