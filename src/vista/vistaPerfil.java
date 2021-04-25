/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author User
 */
public class vistaPerfil extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrincipal
     */
    public vistaPerfil() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAgregarSeries = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnCancelarSerie = new javax.swing.JButton();
        lblTituloAgregarSeries = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnAgregarFotoSerie = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCategoriaSerie = new javax.swing.JComboBox<>();
        lblFotoSerie = new javax.swing.JLabel();
        textTituloSerie = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        textDescripcionSerie = new javax.swing.JTextField();
        btnAgregarSerie = new javax.swing.JButton();
        jDialogAgregarPeliculas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        btnCancelarPelicula = new javax.swing.JButton();
        lblTituloPeliculas = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregarFotoPelicula = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboCategoriaPelicula = new javax.swing.JComboBox<>();
        lblFotoPelicula = new javax.swing.JLabel();
        textTituloPelicula = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        textDescripcionPelicula = new javax.swing.JTextField();
        btnAgregarPelicula = new javax.swing.JButton();
        btnAgregarVideoPeliculas = new javax.swing.JButton();
        lblVideoPeliculas = new javax.swing.JLabel();
        jDialogAgregarCategorias = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        btnCancelarCategoria = new javax.swing.JButton();
        lblTituloCategorias = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textTituloCategoria = new javax.swing.JTextField();
        textDescripcionCategoria = new javax.swing.JTextField();
        btnAgregarCategoría = new javax.swing.JButton();
        jDialogEditarPerfil = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textContrasena = new javax.swing.JPasswordField();
        textCorreo = new javax.swing.JTextField();
        jDateNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        radbtnCliente = new javax.swing.JRadioButton();
        radbtnAdmin = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();
        lblFoto1 = new javax.swing.JLabel();
        lblpassseguro = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDialogAgregarCapitulos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        btnCancelarCapitulo = new javax.swing.JButton();
        lblTituloCapitulos = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        textTituloCapitulo = new javax.swing.JTextField();
        textDescripcionCapitulo = new javax.swing.JTextField();
        btnAgregarCapitulo = new javax.swing.JButton();
        btnAgregarVideoCapitulos = new javax.swing.JButton();
        lblVideoCapitulos = new javax.swing.JLabel();
        jDialogEditarSeries = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnCancelarSerieEdit = new javax.swing.JButton();
        lblTituloEditarSeries = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        btnAgregarFotoSerieEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        comboCategoriaSerieEdit = new javax.swing.JComboBox<>();
        lblFotoSerieEdit = new javax.swing.JLabel();
        textTituloSerieEdit = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        textDescripcionSerieEdit = new javax.swing.JTextField();
        btnEditarSerie = new javax.swing.JButton();
        panelCapitulos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnNuevoCapitulo = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        btnPrincipal = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblFavoritos = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPerfil = new javax.swing.JPanel();
        btnPelicula = new javax.swing.JButton();
        btnSeries = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnRegistroUsuarios = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarSerie.setText("CANCELAR");

        lblTituloAgregarSeries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloAgregarSeries.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAgregarSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        lblTituloAgregarSeries.setText("AGREGAR SERIES");

        btnAgregarFotoSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarFotoSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarFotoSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFotoSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarFotoSerie.setText("PORTADA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel5.setText("TITULO:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel6.setText("DESCRIPCIÓN:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/categoria.png"))); // NOI18N
        jLabel7.setText("CATEGORÍA:");

        comboCategoriaSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFotoSerie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textTituloSerie.setBackground(new java.awt.Color(63, 25, 56));
        textTituloSerie.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloSerie.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textDescripcionSerie.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionSerie.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarSerie.setText("AGREGAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lblTituloAgregarSeries)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textDescripcionSerie)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCategoriaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTituloSerie))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblFotoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregarFotoSerie)))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCancelarSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSerie)
                        .addGap(137, 137, 137))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAgregarSeries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboCategoriaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDescripcionSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator4)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblFotoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregarFotoSerie))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarSerie)
                    .addComponent(btnCancelarSerie))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jDialogAgregarSeriesLayout = new javax.swing.GroupLayout(jDialogAgregarSeries.getContentPane());
        jDialogAgregarSeries.getContentPane().setLayout(jDialogAgregarSeriesLayout);
        jDialogAgregarSeriesLayout.setHorizontalGroup(
            jDialogAgregarSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogAgregarSeriesLayout.setVerticalGroup(
            jDialogAgregarSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarPelicula.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarPelicula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarPelicula.setText("CANCELAR");

        lblTituloPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        lblTituloPeliculas.setText("AGREGAR PELICULAS");

        btnAgregarFotoPelicula.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarFotoPelicula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarFotoPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFotoPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarFotoPelicula.setText("PORTADA");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel12.setText("TITULO:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel13.setText("DESCRIPCIÓN:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/categoria.png"))); // NOI18N
        jLabel14.setText("CATEGORÍA:");

        comboCategoriaPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFotoPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textTituloPelicula.setBackground(new java.awt.Color(63, 25, 56));
        textTituloPelicula.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloPelicula.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textDescripcionPelicula.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionPelicula.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarPelicula.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarPelicula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarPelicula.setText("AGREGAR");

        btnAgregarVideoPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarVideoPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarVideoPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVideoPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarVideoPeliculas.setText("AGREGAR VIDEO");

        lblVideoPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVideoPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        lblVideoPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVideoPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/boton-de-play.png"))); // NOI18N
        lblVideoPeliculas.setText("SIN VIDEO....");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloPeliculas)
                .addGap(221, 221, 221))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textDescripcionPelicula)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboCategoriaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textTituloPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblFotoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btnAgregarFotoPelicula))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblVideoPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarVideoPeliculas)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btnCancelarPelicula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarPelicula)
                                .addGap(62, 62, 62)))
                        .addGap(56, 56, 56))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPeliculas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(textTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboCategoriaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDescripcionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator6)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblFotoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregarFotoPelicula))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVideoPeliculas)
                    .addComponent(lblVideoPeliculas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPelicula)
                    .addComponent(btnAgregarPelicula))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogAgregarPeliculasLayout = new javax.swing.GroupLayout(jDialogAgregarPeliculas.getContentPane());
        jDialogAgregarPeliculas.getContentPane().setLayout(jDialogAgregarPeliculasLayout);
        jDialogAgregarPeliculasLayout.setHorizontalGroup(
            jDialogAgregarPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogAgregarPeliculasLayout.setVerticalGroup(
            jDialogAgregarPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarCategoria.setText("CANCELAR");

        lblTituloCategorias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        lblTituloCategorias.setText("AGREGAR CATEGORÍAS");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel16.setText("TITULO:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel17.setText("DESCRIPCIÓN:");

        textTituloCategoria.setBackground(new java.awt.Color(63, 25, 56));
        textTituloCategoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloCategoria.setForeground(new java.awt.Color(255, 255, 255));

        textDescripcionCategoria.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionCategoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarCategoría.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCategoría.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCategoría.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCategoría.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarCategoría.setText("AGREGAR CATEGORÍA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnCancelarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btnAgregarCategoría))
                            .addComponent(textDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(48, 48, 48)
                                    .addComponent(textTituloCategoria))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloCategorias)
                .addGap(120, 120, 120))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textTituloCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCategoria)
                    .addComponent(btnAgregarCategoría))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jDialogAgregarCategoriasLayout = new javax.swing.GroupLayout(jDialogAgregarCategorias.getContentPane());
        jDialogAgregarCategorias.getContentPane().setLayout(jDialogAgregarCategoriasLayout);
        jDialogAgregarCategoriasLayout.setHorizontalGroup(
            jDialogAgregarCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogAgregarCategoriasLayout.setVerticalGroup(
            jDialogAgregarCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogEditarPerfil.setTitle("Editar información");
        jDialogEditarPerfil.setMaximumSize(new java.awt.Dimension(612, 445));
        jDialogEditarPerfil.setMinimumSize(new java.awt.Dimension(612, 445));
        jDialogEditarPerfil.setPreferredSize(new java.awt.Dimension(612, 445));
        jDialogEditarPerfil.setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" NetTube");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 58));

        textNombre.setBackground(new java.awt.Color(63, 25, 56));
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 189, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CORREO");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CONTRASEÑA");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        textContrasena.setBackground(new java.awt.Color(63, 25, 56));
        textContrasena.setForeground(new java.awt.Color(255, 255, 255));
        textContrasena.setMinimumSize(new java.awt.Dimension(15, 24));
        textContrasena.setPreferredSize(new java.awt.Dimension(15, 24));
        jPanel2.add(textContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 188, -1));

        textCorreo.setEditable(false);
        textCorreo.setBackground(new java.awt.Color(63, 25, 56));
        textCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 189, -1));

        jDateNacimiento.setBackground(new java.awt.Color(63, 25, 56));
        jDateNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jDateNacimiento.setMaxSelectableDate(new java.util.Date(1609480877000L));
        jDateNacimiento.setMinSelectableDate(new java.util.Date(-1262281483000L));
        jPanel2.add(jDateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("FECHA DE NACIMIENTO");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TIPO DE USUARIO");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        radbtnCliente.setBackground(new java.awt.Color(38, 11, 32));
        buttonGroup1.add(radbtnCliente);
        radbtnCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radbtnCliente.setForeground(new java.awt.Color(255, 255, 255));
        radbtnCliente.setSelected(true);
        radbtnCliente.setText("CLIENTE");
        radbtnCliente.setEnabled(false);
        jPanel2.add(radbtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        radbtnAdmin.setBackground(new java.awt.Color(38, 11, 32));
        buttonGroup1.add(radbtnAdmin);
        radbtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        radbtnAdmin.setText("ADMIN");
        radbtnAdmin.setEnabled(false);
        jPanel2.add(radbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 44));

        btnRegistrarse.setBackground(new java.awt.Color(34, 12, 51));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/usuario (1).png"))); // NOI18N
        btnRegistrarse.setText("GUARDAR");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 44));

        btnExaminar.setBackground(new java.awt.Color(34, 12, 51));
        btnExaminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExaminar.setForeground(new java.awt.Color(255, 255, 255));
        btnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnExaminar.setText("Examinar...");
        btnExaminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 125, -1));

        lblFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblFoto1.setMaximumSize(new java.awt.Dimension(100, 100));
        lblFoto1.setMinimumSize(new java.awt.Dimension(100, 100));
        lblFoto1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.add(lblFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 125, 124));

        lblpassseguro.setForeground(new java.awt.Color(204, 0, 51));
        jPanel2.add(lblpassseguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 20));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fondo-login1.png"))); // NOI18N
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 612, 428));

        javax.swing.GroupLayout jDialogEditarPerfilLayout = new javax.swing.GroupLayout(jDialogEditarPerfil.getContentPane());
        jDialogEditarPerfil.getContentPane().setLayout(jDialogEditarPerfilLayout);
        jDialogEditarPerfilLayout.setHorizontalGroup(
            jDialogEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogEditarPerfilLayout.setVerticalGroup(
            jDialogEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        jDialogEditarPerfil.getAccessibleContext().setAccessibleDescription("");

        jPanel7.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarCapitulo.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarCapitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCapitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarCapitulo.setText("CANCELAR");

        lblTituloCapitulos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCapitulos.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCapitulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        lblTituloCapitulos.setText("AGREGAR CAPÍTULOS");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel29.setText("TITULO:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel30.setText("DESCRIPCIÓN DEL CAPÍTULO:");

        textTituloCapitulo.setBackground(new java.awt.Color(63, 25, 56));
        textTituloCapitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloCapitulo.setForeground(new java.awt.Color(255, 255, 255));

        textDescripcionCapitulo.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionCapitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarCapitulo.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCapitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarCapitulo.setText("AGREGAR");

        btnAgregarVideoCapitulos.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarVideoCapitulos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarVideoCapitulos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVideoCapitulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarVideoCapitulos.setText("AGREGAR VIDEO");

        lblVideoCapitulos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVideoCapitulos.setForeground(new java.awt.Color(255, 255, 255));
        lblVideoCapitulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVideoCapitulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/boton-de-play.png"))); // NOI18N
        lblVideoCapitulos.setText("SIN VIDEO....");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnCancelarCapitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCapitulo)
                .addGap(131, 131, 131))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblTituloCapitulos))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator8)
                                .addComponent(textDescripcionCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(textTituloCapitulo))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(lblVideoCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(btnAgregarVideoCapitulos))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCapitulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(textTituloCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVideoCapitulos)
                    .addComponent(lblVideoCapitulos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(textDescripcionCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCapitulo)
                    .addComponent(btnAgregarCapitulo))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jDialogAgregarCapitulosLayout = new javax.swing.GroupLayout(jDialogAgregarCapitulos.getContentPane());
        jDialogAgregarCapitulos.getContentPane().setLayout(jDialogAgregarCapitulosLayout);
        jDialogAgregarCapitulosLayout.setHorizontalGroup(
            jDialogAgregarCapitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogAgregarCapitulosLayout.setVerticalGroup(
            jDialogAgregarCapitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarSerieEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarSerieEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarSerieEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarSerieEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarSerieEdit.setText("CANCELAR");

        lblTituloEditarSeries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloEditarSeries.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEditarSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        lblTituloEditarSeries.setText("EDITAR SERIES");

        btnAgregarFotoSerieEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarFotoSerieEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarFotoSerieEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFotoSerieEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarFotoSerieEdit.setText("PORTADA");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel9.setText("TITULO:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel10.setText("DESCRIPCIÓN:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/categoria.png"))); // NOI18N
        jLabel25.setText("CATEGORÍA:");

        comboCategoriaSerieEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFotoSerieEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textTituloSerieEdit.setBackground(new java.awt.Color(63, 25, 56));
        textTituloSerieEdit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloSerieEdit.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator10.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textDescripcionSerieEdit.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionSerieEdit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnEditarSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnEditarSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnEditarSerie.setText("GUARDAR");

        panelCapitulos.setBackground(new java.awt.Color(38, 11, 32));
        panelCapitulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCapitulos.setRequestFocusEnabled(false);
        panelCapitulos.setLayout(new javax.swing.BoxLayout(panelCapitulos, javax.swing.BoxLayout.Y_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel11.setText("CAPITULOS");

        btnNuevoCapitulo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoCapitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCapitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnNuevoCapitulo.setText("NUEVO CAPÍTULO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textDescripcionSerieEdit)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCategoriaSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTituloSerieEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregarFotoSerieEdit))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblFotoSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnCancelarSerieEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarSerie)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                                .addComponent(btnNuevoCapitulo))
                            .addComponent(jSeparator9)
                            .addComponent(panelCapitulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloEditarSeries)
                .addGap(252, 252, 252))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloEditarSeries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textTituloSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(comboCategoriaSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDescripcionSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator10)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(lblFotoSerieEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregarFotoSerieEdit))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnNuevoCapitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCapitulos, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarSerie)
                    .addComponent(btnCancelarSerieEdit))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jDialogEditarSeriesLayout = new javax.swing.GroupLayout(jDialogEditarSeries.getContentPane());
        jDialogEditarSeries.getContentPane().setLayout(jDialogEditarSeriesLayout);
        jDialogEditarSeriesLayout.setHorizontalGroup(
            jDialogEditarSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogEditarSeriesLayout.setVerticalGroup(
            jDialogEditarSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 11, 32));

        jPanel1.setBackground(new java.awt.Color(38, 11, 32));

        jToolBar2.setBackground(new java.awt.Color(15, 0, 12));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setBorderPainted(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/nt-microsoft-windows.png"))); // NOI18N
        jLabel3.setText("NetTube");

        btnPrincipal.setBackground(new java.awt.Color(34, 12, 51));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/hogar (1).png"))); // NOI18N
        btnPrincipal.setText("PRINCIPAL");

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblFoto.setMaximumSize(new java.awt.Dimension(150, 170));
        lblFoto.setMinimumSize(new java.awt.Dimension(150, 170));
        lblFoto.setPreferredSize(new java.awt.Dimension(150, 170));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("CORREO");

        lblNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNacimiento.setText("NACIMIENTO");

        btnEditar.setBackground(new java.awt.Color(34, 12, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/editar (1).png"))); // NOI18N
        btnEditar.setText("EDITAR");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblFavoritos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFavoritos.setForeground(new java.awt.Color(255, 255, 255));
        lblFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/clasificacion.png"))); // NOI18N
        lblFavoritos.setText("FAVORITOS");

        btnAgregar.setBackground(new java.awt.Color(34, 12, 51));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");

        panelPerfil.setBackground(new java.awt.Color(38, 11, 32));
        panelPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPerfil.setPreferredSize(new java.awt.Dimension(630, 304));
        panelPerfil.setLayout(new javax.swing.BoxLayout(panelPerfil, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelPerfil);

        btnPelicula.setBackground(new java.awt.Color(34, 12, 51));
        btnPelicula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPelicula.setForeground(new java.awt.Color(255, 255, 255));
        btnPelicula.setText("PELICULAS");

        btnSeries.setBackground(new java.awt.Color(34, 12, 51));
        btnSeries.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSeries.setForeground(new java.awt.Color(255, 255, 255));
        btnSeries.setText("SERIES");

        btnCategorias.setBackground(new java.awt.Color(34, 12, 51));
        btnCategorias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorias.setText("CATEGORÍAS");

        btnReportes.setBackground(new java.awt.Color(34, 12, 51));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("REPORTES");

        btnRegistroUsuarios.setBackground(new java.awt.Color(34, 12, 51));
        btnRegistroUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/iniciar-sesion.png"))); // NOI18N
        btnRegistroUsuarios.setText("REGISTRAR USUARIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnEditar)))
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFavoritos)
                        .addGap(53, 53, 53)
                        .addComponent(btnPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCategorias)
                        .addGap(18, 18, 18)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistroUsuarios)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrincipal)
                    .addComponent(btnRegistroUsuarios))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lblCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(lblNacimiento)
                        .addGap(32, 32, 32)
                        .addComponent(btnEditar)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPelicula)
                                    .addComponent(btnSeries)
                                    .addComponent(btnCategorias)
                                    .addComponent(btnReportes))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCategorias() {
        return btnCategorias;
    }

    public void setBtnCategorias(JButton btnCategorias) {
        this.btnCategorias = btnCategorias;
    }

    public JButton getBtnPelicula() {
        return btnPelicula;
    }

    public void setBtnPelicula(JButton btnPelicula) {
        this.btnPelicula = btnPelicula;
    }

    public JButton getBtnReportes() {
        return btnReportes;
    }

    public void setBtnReportes(JButton btnReportes) {
        this.btnReportes = btnReportes;
    }

    public JButton getBtnSeries() {
        return btnSeries;
    }

    public void setBtnSeries(JButton btnSeries) {
        this.btnSeries = btnSeries;
    }

    public JButton getBtnRegistroUsuarios() {
        return btnRegistroUsuarios;
    }

    public void setBtnRegistroUsuarios(JButton btnRegistroUsuarios) {
        this.btnRegistroUsuarios = btnRegistroUsuarios;
    }

    
    public JButton getBtnAgregarCategoría() {
        return btnAgregarCategoría;
    }

    public void setBtnAgregarCategoría(JButton btnAgregarCategoría) {
        this.btnAgregarCategoría = btnAgregarCategoría;
    }

    public JButton getBtnCancelarCategoria() {
        return btnCancelarCategoria;
    }

    public void setBtnCancelarCategoria(JButton btnCancelarCategoria) {
        this.btnCancelarCategoria = btnCancelarCategoria;
    }

    public JDialog getjDialogAgregarCategorias() {
        return jDialogAgregarCategorias;
    }

    public void setjDialogAgregarCategorias(JDialog jDialogAgregarCategorias) {
        this.jDialogAgregarCategorias = jDialogAgregarCategorias;
    }

    public JTextField getTextDescripcionCategoria() {
        return textDescripcionCategoria;
    }

    public void setTextDescripcionCategoria(JTextField textDescripcionCategoria) {
        this.textDescripcionCategoria = textDescripcionCategoria;
    }

    public JTextField getTextTituloCategoria() {
        return textTituloCategoria;
    }

    public void setTextTituloCategoria(JTextField textTituloCategoria) {
        this.textTituloCategoria = textTituloCategoria;
    }

    public JLabel getLblFavoritos() {
        return lblFavoritos;
    }

    public void setLblFavoritos(JLabel lblFavoritos) {
        this.lblFavoritos = lblFavoritos;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnAgregarFotoPelicula() {
        return btnAgregarFotoPelicula;
    }

    public void setBtnAgregarFotoPelicula(JButton btnAgregarFotoPelicula) {
        this.btnAgregarFotoPelicula = btnAgregarFotoPelicula;
    }

    public JButton getBtnAgregarFotoSerie() {
        return btnAgregarFotoSerie;
    }

    public void setBtnAgregarFotoSerie(JButton btnAgregarFotoSerie) {
        this.btnAgregarFotoSerie = btnAgregarFotoSerie;
    }

    public JButton getBtnAgregarPelicula() {
        return btnAgregarPelicula;
    }

    public void setBtnAgregarPelicula(JButton btnAgregarPelicula) {
        this.btnAgregarPelicula = btnAgregarPelicula;
    }

    public JButton getBtnAgregarSerie() {
        return btnAgregarSerie;
    }

    public void setBtnAgregarSerie(JButton btnAgregarSerie) {
        this.btnAgregarSerie = btnAgregarSerie;
    }

    public JButton getBtnCancelarPelicula() {
        return btnCancelarPelicula;
    }

    public void setBtnCancelarPelicula(JButton btnCancelarPelicula) {
        this.btnCancelarPelicula = btnCancelarPelicula;
    }

    public JButton getBtnCancelarSerie() {
        return btnCancelarSerie;
    }

    public void setBtnCancelarSerie(JButton btnCancelarSerie) {
        this.btnCancelarSerie = btnCancelarSerie;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnPrincipal() {
        return btnPrincipal;
    }

    public void setBtnPrincipal(JButton btnPrincipal) {
        this.btnPrincipal = btnPrincipal;
    }

    public JComboBox<String> getComboCategoriaPelicula() {
        return comboCategoriaPelicula;
    }

    public void setComboCategoriaPelicula(JComboBox<String> comboCategoriaPelicula) {
        this.comboCategoriaPelicula = comboCategoriaPelicula;
    }

    public JComboBox<String> getComboCategoriaSerie() {
        return comboCategoriaSerie;
    }

    public void setComboCategoriaSerie(JComboBox<String> comboCategoriaSerie) {
        this.comboCategoriaSerie = comboCategoriaSerie;
    }

    public JDialog getjDialogAgregarPeliculas() {
        return jDialogAgregarPeliculas;
    }

    public void setjDialogAgregarPeliculas(JDialog jDialogAgregarPeliculas) {
        this.jDialogAgregarPeliculas = jDialogAgregarPeliculas;
    }

    public JDialog getjDialogAgregarSeries() {
        return jDialogAgregarSeries;
    }

    public void setjDialogAgregarSeries(JDialog jDialogAgregarSeries) {
        this.jDialogAgregarSeries = jDialogAgregarSeries;
    }

    public JLabel getLblCorreo() {
        return lblCorreo;
    }

    public void setLblCorreo(JLabel lblCorreo) {
        this.lblCorreo = lblCorreo;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getLblNacimiento() {
        return lblNacimiento;
    }

    public void setLblNacimiento(JLabel lblNacimiento) {
        this.lblNacimiento = lblNacimiento;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JPanel getPanelPerfil() {
        return panelPerfil;
    }

    public void setPanelPerfil(JPanel panelPerfil) {
        this.panelPerfil = panelPerfil;
    }


    public JTextField getTextDescripcionPelicula() {
        return textDescripcionPelicula;
    }

    public void setTextDescripcionPelicula(JTextField textDescripcionPelicula) {
        this.textDescripcionPelicula = textDescripcionPelicula;
    }

    public JTextField getTextDescripcionSerie() {
        return textDescripcionSerie;
    }

    public void setTextDescripcionSerie(JTextField textDescripcionSerie) {
        this.textDescripcionSerie = textDescripcionSerie;
    }

    public JLabel getLblFotoPelicula() {
        return lblFotoPelicula;
    }

    public void setLblFotoPelicula(JLabel textFotoPelicula) {
        this.lblFotoPelicula = textFotoPelicula;
    }

    public JLabel getLblFotoSerie() {
        return lblFotoSerie;
    }

    public void setLblFotoSerie(JLabel textFotoSerie) {
        this.lblFotoSerie = textFotoSerie;
    }

    public JTextField getTextTituloPelicula() {
        return textTituloPelicula;
    }

    public void setTextTituloPelicula(JTextField textTituloPelicula) {
        this.textTituloPelicula = textTituloPelicula;
    }

    public JTextField getTextTituloSerie() {
        return textTituloSerie;
    }

    public void setTextTituloSerie(JTextField textTituloSerie) {
        this.textTituloSerie = textTituloSerie;
    }

    public JDialog getjDialogEditarPerfil() {
        return jDialogEditarPerfil;
    }

    public void setjDialogEditarPerfil(JDialog jDialogEditarPerfil) {
        this.jDialogEditarPerfil = jDialogEditarPerfil;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnExaminar() {
        return btnExaminar;
    }

    public void setBtnExaminar(JButton btnExaminar) {
        this.btnExaminar = btnExaminar;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public JDateChooser getjDateNacimiento() {
        return jDateNacimiento;
    }

    public void setjDateNacimiento(JDateChooser jDateNacimiento) {
        this.jDateNacimiento = jDateNacimiento;
    }

    public JLabel getLblFoto1() {
        return lblFoto1;
    }

    public void setLblFoto1(JLabel lblFoto1) {
        this.lblFoto1 = lblFoto1;
    }

    public JRadioButton getRadbtnAdmin() {
        return radbtnAdmin;
    }

    public void setRadbtnAdmin(JRadioButton radbtnAdmin) {
        this.radbtnAdmin = radbtnAdmin;
    }

    public JRadioButton getRadbtnCliente() {
        return radbtnCliente;
    }

    public void setRadbtnCliente(JRadioButton radbtnCliente) {
        this.radbtnCliente = radbtnCliente;
    }

    public JTextField getTextCorreo() {
        return textCorreo;
    }

    public void setTextCorreo(JTextField textCorreo) {
        this.textCorreo = textCorreo;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public void setTextNombre(JTextField textNombre) {
        this.textNombre = textNombre;
    }

    public JLabel getLblpassseguro() {
        return lblpassseguro;
    }

    public void setLblpassseguro(JLabel lblpassseguro) {
        this.lblpassseguro = lblpassseguro;
    }

    public JPasswordField getTextContrasena() {
        return textContrasena;
    }

    public void setTextContrasena(JPasswordField textContrasena) {
        this.textContrasena = textContrasena;
    }

    public JButton getBtnAgregarCapitulo() {
        return btnAgregarCapitulo;
    }

    public void setBtnAgregarCapitulo(JButton btnAgregarCapitulo) {
        this.btnAgregarCapitulo = btnAgregarCapitulo;
    }

    public JButton getBtnAgregarVideo() {
        return btnAgregarVideoCapitulos;
    }

    public void setBtnAgregarVideo(JButton btnAgregarVideo) {
        this.btnAgregarVideoCapitulos = btnAgregarVideo;
    }

    public JButton getBtnCancelarCapitulo() {
        return btnCancelarCapitulo;
    }

    public void setBtnCancelarCapitulo(JButton btnCancelarCapitulo) {
        this.btnCancelarCapitulo = btnCancelarCapitulo;
    }

    public JDialog getjDialogAgregarCapitulos() {
        return jDialogAgregarCapitulos;
    }

    public void setjDialogAgregarCapitulos(JDialog jDialogAgregarCapitulos) {
        this.jDialogAgregarCapitulos = jDialogAgregarCapitulos;
    }

    public JTextField getTextDescripcionCapitulo() {
        return textDescripcionCapitulo;
    }

    public void setTextDescripcionCapitulo(JTextField textDescripcionCapitulo) {
        this.textDescripcionCapitulo = textDescripcionCapitulo;
    }

    public JTextField getTextTituloCapitulo() {
        return textTituloCapitulo;
    }

    public void setTextTituloCapitulo(JTextField textTituloCapitulo) {
        this.textTituloCapitulo = textTituloCapitulo;
    }

    public JButton getBtnAgregarVideoCapitulos() {
        return btnAgregarVideoCapitulos;
    }

    public void setBtnAgregarVideoCapitulos(JButton btnAgregarVideoCapitulos) {
        this.btnAgregarVideoCapitulos = btnAgregarVideoCapitulos;
    }

    public JButton getBtnAgregarVideoPeliculas() {
        return btnAgregarVideoPeliculas;
    }

    public void setBtnAgregarVideoPeliculas(JButton btnAgregarVideoPeliculas) {
        this.btnAgregarVideoPeliculas = btnAgregarVideoPeliculas;
    }

    public JLabel getLblVideoCapitulos() {
        return lblVideoCapitulos;
    }

    public void setLblVideoCapitulos(JLabel lblVideoCapitulos) {
        this.lblVideoCapitulos = lblVideoCapitulos;
    }

    public JLabel getLblVideoPeliculas() {
        return lblVideoPeliculas;
    }

    public void setLblVideoPeliculas(JLabel lblVideoPeliculas) {
        this.lblVideoPeliculas = lblVideoPeliculas;
    }

    public JButton getBtnAgregarFotoSerieEdit() {
        return btnAgregarFotoSerieEdit;
    }

    public void setBtnAgregarFotoSerieEdit(JButton btnAgregarFotoSerieEdit) {
        this.btnAgregarFotoSerieEdit = btnAgregarFotoSerieEdit;
    }

    public JButton getBtnCancelarSerieEdit() {
        return btnCancelarSerieEdit;
    }

    public void setBtnCancelarSerieEdit(JButton btnCancelarSerieEdit) {
        this.btnCancelarSerieEdit = btnCancelarSerieEdit;
    }

    public JButton getBtnEditarSerie() {
        return btnEditarSerie;
    }

    public void setBtnEditarSerie(JButton btnEditarSerie) {
        this.btnEditarSerie = btnEditarSerie;
    }

    public JButton getBtnNuevoCapitulo() {
        return btnNuevoCapitulo;
    }

    public void setBtnNuevoCapitulo(JButton btnNuevoCapitulo) {
        this.btnNuevoCapitulo = btnNuevoCapitulo;
    }

    public JComboBox<String> getComboCategoriaSerieEdit() {
        return comboCategoriaSerieEdit;
    }

    public void setComboCategoriaSerieEdit(JComboBox<String> comboCategoriaSerieEdit) {
        this.comboCategoriaSerieEdit = comboCategoriaSerieEdit;
    }

    public JDialog getjDialogEditarSeries() {
        return jDialogEditarSeries;
    }

    public void setjDialogEditarSeries(JDialog jDialogEditarSeries) {
        this.jDialogEditarSeries = jDialogEditarSeries;
    }

    public JLabel getLblAgregarCapitulos() {
        return lblTituloCapitulos;
    }

    public void setLblAgregarCapitulos(JLabel lblAgregarCapitulos) {
        this.lblTituloCapitulos = lblAgregarCapitulos;
    }

    public JLabel getLblAgregarCategorias() {
        return lblTituloCategorias;
    }

    public void setLblAgregarCategorias(JLabel lblAgregarCategorias) {
        this.lblTituloCategorias = lblAgregarCategorias;
    }

    public JLabel getLblAgregarPeliculas() {
        return lblTituloPeliculas;
    }

    public void setLblAgregarPeliculas(JLabel lblAgregarPeliculas) {
        this.lblTituloPeliculas = lblAgregarPeliculas;
    }

    public JLabel getLblFotoSerieEdit() {
        return lblFotoSerieEdit;
    }

    public void setLblFotoSerieEdit(JLabel lblFotoSerieEdit) {
        this.lblFotoSerieEdit = lblFotoSerieEdit;
    }

    public JPanel getPanelCapitulos() {
        return panelCapitulos;
    }

    public void setPanelCapitulos(JPanel panelCapitulos) {
        this.panelCapitulos = panelCapitulos;
    }

    public JTextField getTextDescripcionSerieEdit() {
        return textDescripcionSerieEdit;
    }

    public void setTextDescripcionSerieEdit(JTextField textDescripcionSerieEdit) {
        this.textDescripcionSerieEdit = textDescripcionSerieEdit;
    }

    public JTextField getTextTituloSerieEdit() {
        return textTituloSerieEdit;
    }

    public void setTextTituloSerieEdit(JTextField textTituloSerieEdit) {
        this.textTituloSerieEdit = textTituloSerieEdit;
    }

    public JLabel getLblTituloAgregarSeries() {
        return lblTituloAgregarSeries;
    }

    public void setLblTituloAgregarSeries(JLabel lblTituloAgregarSeries) {
        this.lblTituloAgregarSeries = lblTituloAgregarSeries;
    }

    public JLabel getLblTituloCapitulos() {
        return lblTituloCapitulos;
    }

    public void setLblTituloCapitulos(JLabel lblTituloCapitulos) {
        this.lblTituloCapitulos = lblTituloCapitulos;
    }

    public JLabel getLblTituloCategorias() {
        return lblTituloCategorias;
    }

    public void setLblTituloCategorias(JLabel lblTituloCategorias) {
        this.lblTituloCategorias = lblTituloCategorias;
    }

    public JLabel getLblTituloEditarSeries() {
        return lblTituloEditarSeries;
    }

    public void setLblTituloEditarSeries(JLabel lblTituloEditarSeries) {
        this.lblTituloEditarSeries = lblTituloEditarSeries;
    }

    public JLabel getLblTituloPeliculas() {
        return lblTituloPeliculas;
    }

    public void setLblTituloPeliculas(JLabel lblTituloPeliculas) {
        this.lblTituloPeliculas = lblTituloPeliculas;
    }
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCapitulo;
    private javax.swing.JButton btnAgregarCategoría;
    private javax.swing.JButton btnAgregarFotoPelicula;
    private javax.swing.JButton btnAgregarFotoSerie;
    private javax.swing.JButton btnAgregarFotoSerieEdit;
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JButton btnAgregarSerie;
    private javax.swing.JButton btnAgregarVideoCapitulos;
    private javax.swing.JButton btnAgregarVideoPeliculas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarCapitulo;
    private javax.swing.JButton btnCancelarCategoria;
    private javax.swing.JButton btnCancelarPelicula;
    private javax.swing.JButton btnCancelarSerie;
    private javax.swing.JButton btnCancelarSerieEdit;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarSerie;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnNuevoCapitulo;
    private javax.swing.JButton btnPelicula;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRegistroUsuarios;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSeries;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboCategoriaPelicula;
    private javax.swing.JComboBox<String> comboCategoriaSerie;
    private javax.swing.JComboBox<String> comboCategoriaSerieEdit;
    private com.toedter.calendar.JDateChooser jDateNacimiento;
    private javax.swing.JDialog jDialogAgregarCapitulos;
    private javax.swing.JDialog jDialogAgregarCategorias;
    private javax.swing.JDialog jDialogAgregarPeliculas;
    private javax.swing.JDialog jDialogAgregarSeries;
    private javax.swing.JDialog jDialogEditarPerfil;
    private javax.swing.JDialog jDialogEditarSeries;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFavoritos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFotoPelicula;
    private javax.swing.JLabel lblFotoSerie;
    private javax.swing.JLabel lblFotoSerieEdit;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTituloAgregarSeries;
    private javax.swing.JLabel lblTituloCapitulos;
    private javax.swing.JLabel lblTituloCategorias;
    private javax.swing.JLabel lblTituloEditarSeries;
    private javax.swing.JLabel lblTituloPeliculas;
    private javax.swing.JLabel lblVideoCapitulos;
    private javax.swing.JLabel lblVideoPeliculas;
    private javax.swing.JLabel lblpassseguro;
    private javax.swing.JPanel panelCapitulos;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JRadioButton radbtnAdmin;
    private javax.swing.JRadioButton radbtnCliente;
    private javax.swing.JPasswordField textContrasena;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDescripcionCapitulo;
    private javax.swing.JTextField textDescripcionCategoria;
    private javax.swing.JTextField textDescripcionPelicula;
    private javax.swing.JTextField textDescripcionSerie;
    private javax.swing.JTextField textDescripcionSerieEdit;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTituloCapitulo;
    private javax.swing.JTextField textTituloCategoria;
    private javax.swing.JTextField textTituloPelicula;
    private javax.swing.JTextField textTituloSerie;
    private javax.swing.JTextField textTituloSerieEdit;
    // End of variables declaration//GEN-END:variables
}
