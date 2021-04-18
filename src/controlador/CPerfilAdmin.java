/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Image;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Categoria;
import model.MAdmin;
import model.MCategoria;
import model.MPelicula;
import model.MSerie;
import model.Pelicula;
import model.Serie;
import model.Video;
import vista.vistaInformacion;
import vista.vistaPanelPelicula;
import vista.vistaPanelRegistro;
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
    private MCategoria mCat;

    public CPerfilAdmin() {
    }

    public CPerfilAdmin(MAdmin mAdmin, vistaPrincipal vista) {
        this.mAdmin = mAdmin;
        this.vista = vista;
        
        mSerie = new MSerie();
        mPeli = new MPelicula();
        mCat = new MCategoria();
        vp = new vistaPerfil();
    }
    
    public void initControl() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        addEvents();
    }
    
    private void addEvents(){
        validarcampo();
//        listar("");
        categorias();
        vista.getBtnPerfil().addActionListener(l->perfil());
        vp.getBtnAgregar().addActionListener(l->agregar());
        vp.getBtnAgregarPeliculas().addActionListener(l->agregarPeliculas());
        vp.getBtnAgregarSeries().addActionListener(l->agregarSeries());
        vp.getBtnAgregarFotoPelicula().addActionListener(l->cargarImagen(vp.getLblFotoPelicula()));
        vp.getBtnAgregarFotoSerie().addActionListener(l->cargarImagen(vp.getLblFotoSerie()));
//        vista.getBtnBuscar().addActionListener(l->listar(vista.getTextBuscar().getText()));
        vp.getBtnEditar().addActionListener(l -> editarPerfil());
    }
    
    private void editarPerfil() {
        CEditarPerfil cEditar = new CEditarPerfil(vp, mAdmin);
        cEditar.initControl();
    }
    
    private void agregar(){
        vp.getjDialogAgregar().setLocationRelativeTo(vp);
        vp.getjDialogAgregar().setVisible(true);
        vp.getjDialogAgregar().setSize(438,160);
    }
    
    private void agregarPeliculas(){
        vp.getjDialogAgregarPeliculas().setLocationRelativeTo(vp);
        vp.getjDialogAgregarPeliculas().setVisible(true);
        vp.getjDialogAgregarPeliculas().setSize(635, 359);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarPelicula().addActionListener(l->vp.getjDialogAgregarPeliculas().dispose());
        vp.getComboCategoriaPelicula().removeAllItems();
        
        List<Categoria> listaC=mCat.listar();
        listaC.stream().forEach(c ->{
           vp.getComboCategoriaPelicula().addItem(c.getNombre());
       });
        
        vp.getBtnAgregarPelicula().addActionListener(l->nuevaPelicula());
        
    }
    private void agregarSeries(){
        vp.getjDialogAgregarSeries().setLocationRelativeTo(vp);
        vp.getjDialogAgregarSeries().setVisible(true);
        vp.getjDialogAgregarSeries().setSize(635,648);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarSerie().addActionListener(l->vp.getjDialogAgregarSeries().dispose());
        vp.getComboCategoriaSerie().removeAllItems();
        
        List<Categoria> listaC=mCat.listar();
        listaC.stream().forEach(c ->{
           vp.getComboCategoriaSerie().addItem(c.getNombre());
       });
    }
    
    private void agregarCategorias(){
        vp.getjDialogAgregarCategorias().setLocationRelativeTo(vp);
        vp.getjDialogAgregarCategorias().setVisible(true);
        vp.getjDialogAgregarCategorias().setSize(449,307);
        vp.getjDialogAgregar().dispose();
        vp.getBtnCancelarCategoria().addActionListener(l->vp.getjDialogAgregarCategorias().dispose());
        
        vp.getBtnAgregarCategoría().addActionListener(l->nuevaCategoria());
    }
    
    private void perfil(){
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
        
        Image img=mAdmin.getFoto();
        Image newimg = CUtils.redimensionarImagen(img, vp.getLblFoto());
        ImageIcon icon = (newimg != null) ? new ImageIcon(newimg) : null;

        
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
    
    private void listar(String text) {
        vistaPanelPelicula vistap = new vistaPanelPelicula();
        vista.getPanelPeliculas().removeAll();
        vista.getPanelSeries().removeAll();

        List<Pelicula> listaP = mPeli.listar(text, 0);
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
   private void validarcampo(){
       Validaciones val=new Validaciones();
       val.LimitarCaracteres(vista.getTextBuscar(), 30);
   }
   private void reportes(){
       
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
   
   private void validaciones(){
       Validaciones val=new Validaciones();
       
       val.ValidarLetras(vp.getTextNombre());
       val.ValidarLetras(vp.getTextDescripcionCapitulo());
       val.ValidarLetras(vp.getTextDescripcionCategoria());
       val.ValidarLetras(vp.getTextDescripcionPelicula());
       val.ValidarLetras(vp.getTextDescripcionSerie());
   }
   
   private void nuevaCategoria(){
       if(vp.getTextTituloCategoria().getText().isBlank()||vp.getTextDescripcionCategoria().getText().isBlank()){
           JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
       }else{
           MCategoria nc=new MCategoria("0",vp.getTextTituloCategoria().getText(),vp.getTextDescripcionCategoria().getText());
           if(nc.crear()){
               JOptionPane.showMessageDialog(vista, "Categoria creada correctamente");
           }else{
               JOptionPane.showMessageDialog(vista, "Error al crear la categoría");
           }
       }
       
   }
   
   private void nuevaPelicula(){
       if(vp.getTextTituloPelicula().getText().isBlank()||vp.getTextDescripcionPelicula().getText().isBlank()){
           JOptionPane.showMessageDialog(vista, "Existen campos vacíos");
       }else{
       List<Categoria> listaC=mCat.categoriaId(vp.getComboCategoriaPelicula().getSelectedItem().toString());
       Categoria cat=listaC.get(0);
       
       Video vid=new Video();
       
       String titulo=vp.getTextTituloPelicula().getText();
       String descripcion=vp.getTextDescripcionPelicula().getText();
       ImageIcon ic=(ImageIcon)vp.getLblFotoPelicula().getIcon();
       
       MPelicula np=new MPelicula("1",titulo,descripcion,ic.getImage(),cat,vid);
       if(np.crear()){
           JOptionPane.showMessageDialog(vista, "Pelicula creada correctamente");
       }else{
           JOptionPane.showMessageDialog(vista, "Error al crear la pelicula");
       }
       
       }
       
   }
   
}
