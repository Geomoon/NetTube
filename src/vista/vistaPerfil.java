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

        jDialogAgregar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarSeries = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregarPeliculas = new javax.swing.JButton();
        btnAgregarCategorias = new javax.swing.JButton();
        jDialogAgregarSeries = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnCancelarSerie = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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
        panelCapitulosAgregados = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textTituloCapitulo = new javax.swing.JTextField();
        textDescripcionCapitulo = new javax.swing.JTextField();
        btnAgregarCapitulo = new javax.swing.JButton();
        btnAgregarSerie = new javax.swing.JButton();
        jDialogAgregarPeliculas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        btnCancelarPelicula = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
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
        jDialogAgregarCategorias = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        btnCancelarCategoria = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel23 = new javax.swing.JLabel();
        lblpassseguro = new javax.swing.JLabel();
        jDialogAgregarCapitulos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        btnCancelarSerie1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btnAgregarFotoSerie1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboCategoriaSerie1 = new javax.swing.JComboBox<>();
        lblFotoSerie1 = new javax.swing.JLabel();
        textTituloSerie1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        textDescripcionSerie1 = new javax.swing.JTextField();
        panelCapitulosAgregados1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        textTituloCapitulo1 = new javax.swing.JTextField();
        textDescripcionCapitulo1 = new javax.swing.JTextField();
        btnAgregarCapitulo1 = new javax.swing.JButton();
        btnAgregarSerie1 = new javax.swing.JButton();
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
        btnReportes = new javax.swing.JButton();
        btnAdmincontenido = new javax.swing.JButton();
        lblFavoritos = new javax.swing.JLabel();
        panelPerfil = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(38, 11, 32));

        btnAgregarSeries.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSeries.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarSeries.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSeries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        btnAgregarSeries.setText("SERIES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        jLabel2.setText("AGREGAR");

        btnAgregarPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        btnAgregarPeliculas.setText("PELICULAS");

        btnAgregarCategorias.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCategorias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCategorias.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        btnAgregarCategorias.setText("CATEGORÍA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnAgregarPeliculas)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCategorias)))
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarSeries)
                    .addComponent(btnAgregarPeliculas)
                    .addComponent(btnAgregarCategorias))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogAgregarLayout = new javax.swing.GroupLayout(jDialogAgregar.getContentPane());
        jDialogAgregar.getContentPane().setLayout(jDialogAgregarLayout);
        jDialogAgregarLayout.setHorizontalGroup(
            jDialogAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogAgregarLayout.setVerticalGroup(
            jDialogAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarSerie.setText("CANCELAR");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        jLabel4.setText("AGREGAR SERIES");

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

        panelCapitulosAgregados.setBackground(new java.awt.Color(38, 11, 32));
        panelCapitulosAgregados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelCapitulosAgregadosLayout = new javax.swing.GroupLayout(panelCapitulosAgregados);
        panelCapitulosAgregados.setLayout(panelCapitulosAgregadosLayout);
        panelCapitulosAgregadosLayout.setHorizontalGroup(
            panelCapitulosAgregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCapitulosAgregadosLayout.setVerticalGroup(
            panelCapitulosAgregadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/capitulo.png"))); // NOI18N
        jLabel8.setText("CAPÍTULOS");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel9.setText("TITULO:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel10.setText("DESCRIPCIÓN DEL CAPÍTULO:");

        textTituloCapitulo.setBackground(new java.awt.Color(63, 25, 56));
        textTituloCapitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloCapitulo.setForeground(new java.awt.Color(255, 255, 255));

        textDescripcionCapitulo.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionCapitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarCapitulo.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCapitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCapitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarCapitulo.setText("AGREGAR CAPÍTULO");

        btnAgregarSerie.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSerie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarSerie.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarSerie.setText("AGREGAR SERIE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel4)
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
                                .addGap(31, 31, 31)
                                .addComponent(btnAgregarCapitulo))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregarFotoSerie)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(textTituloCapitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(295, 295, 295))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDescripcionCapitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                            .addComponent(panelCapitulosAgregados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSerie)
                        .addGap(59, 59, 59))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textTituloCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCapitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDescripcionCapitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCapitulosAgregados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarSerie)
                    .addComponent(btnAgregarSerie))
                .addContainerGap())
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        jLabel11.setText("AGREGAR PELICULAS");

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
        btnAgregarPelicula.setText("AGREGAR PELICULA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnCancelarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarPelicula))
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
                                        .addComponent(btnAgregarFotoPelicula)))))
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(221, 221, 221))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        jLabel15.setText("AGREGAR CATEGORÍAS");

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
                .addComponent(jLabel15)
                .addGap(120, 120, 120))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
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
        radbtnCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radbtnCliente.setForeground(new java.awt.Color(255, 255, 255));
        radbtnCliente.setSelected(true);
        radbtnCliente.setText("CLIENTE");
        radbtnCliente.setEnabled(false);
        jPanel2.add(radbtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        radbtnAdmin.setBackground(new java.awt.Color(38, 11, 32));
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

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fondo-login1.png"))); // NOI18N
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 612, 428));

        lblpassseguro.setForeground(new java.awt.Color(102, 0, 0));
        jPanel2.add(lblpassseguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 20));

        javax.swing.GroupLayout jDialogEditarPerfilLayout = new javax.swing.GroupLayout(jDialogEditarPerfil.getContentPane());
        jDialogEditarPerfil.getContentPane().setLayout(jDialogEditarPerfilLayout);
        jDialogEditarPerfilLayout.setHorizontalGroup(
            jDialogEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogEditarPerfilLayout.setVerticalGroup(
            jDialogEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        jDialogEditarPerfil.getAccessibleContext().setAccessibleDescription("");

        jPanel7.setBackground(new java.awt.Color(38, 11, 32));

        btnCancelarSerie1.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarSerie1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarSerie1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarSerie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/error.png"))); // NOI18N
        btnCancelarSerie1.setText("CANCELAR");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/youtube.png"))); // NOI18N
        jLabel24.setText("AGREGAR SERIES");

        btnAgregarFotoSerie1.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarFotoSerie1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarFotoSerie1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFotoSerie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/portada.png"))); // NOI18N
        btnAgregarFotoSerie1.setText("PORTADA");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel25.setText("TITULO:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel26.setText("DESCRIPCIÓN:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/categoria.png"))); // NOI18N
        jLabel27.setText("CATEGORÍA:");

        comboCategoriaSerie1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFotoSerie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        textTituloSerie1.setBackground(new java.awt.Color(63, 25, 56));
        textTituloSerie1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloSerie1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textDescripcionSerie1.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionSerie1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        panelCapitulosAgregados1.setBackground(new java.awt.Color(38, 11, 32));
        panelCapitulosAgregados1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelCapitulosAgregados1Layout = new javax.swing.GroupLayout(panelCapitulosAgregados1);
        panelCapitulosAgregados1.setLayout(panelCapitulosAgregados1Layout);
        panelCapitulosAgregados1Layout.setHorizontalGroup(
            panelCapitulosAgregados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCapitulosAgregados1Layout.setVerticalGroup(
            panelCapitulosAgregados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/capitulo.png"))); // NOI18N
        jLabel28.setText("CAPÍTULOS");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        jLabel29.setText("TITULO:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/descripcion.png"))); // NOI18N
        jLabel30.setText("DESCRIPCIÓN DEL CAPÍTULO:");

        textTituloCapitulo1.setBackground(new java.awt.Color(63, 25, 56));
        textTituloCapitulo1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        textTituloCapitulo1.setForeground(new java.awt.Color(255, 255, 255));

        textDescripcionCapitulo1.setBackground(new java.awt.Color(63, 25, 56));
        textDescripcionCapitulo1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnAgregarCapitulo1.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCapitulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarCapitulo1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCapitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarCapitulo1.setText("AGREGAR CAPÍTULO");

        btnAgregarSerie1.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSerie1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarSerie1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSerie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregarSerie1.setText("AGREGAR SERIE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textDescripcionSerie1)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCategoriaSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTituloSerie1))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblFotoSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnAgregarCapitulo1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnAgregarFotoSerie1)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(textTituloCapitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addComponent(jLabel28))
                        .addGap(295, 295, 295))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDescripcionCapitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                            .addComponent(panelCapitulosAgregados1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelarSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSerie1)
                        .addGap(59, 59, 59))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(textTituloSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(comboCategoriaSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDescripcionSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator9)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(lblFotoSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregarFotoSerie1))))
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(textTituloCapitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCapitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDescripcionCapitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCapitulosAgregados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarSerie1)
                    .addComponent(btnAgregarSerie1))
                .addContainerGap())
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

        btnPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/hogar (1).png"))); // NOI18N
        btnPrincipal.setText("PRINCIPAL");

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

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

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/editar (1).png"))); // NOI18N
        btnEditar.setText("EDITAR");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnReportes.setBackground(new java.awt.Color(0, 0, 0));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/escritura.png"))); // NOI18N
        btnReportes.setText("REPORTES");

        btnAdmincontenido.setBackground(new java.awt.Color(0, 0, 0));
        btnAdmincontenido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdmincontenido.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmincontenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/video.png"))); // NOI18N
        btnAdmincontenido.setText("GESTIÓN DE CONTENIDO");

        lblFavoritos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFavoritos.setForeground(new java.awt.Color(255, 255, 255));
        lblFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/clasificacion.png"))); // NOI18N
        lblFavoritos.setText("FAVORITOS");

        panelPerfil.setBackground(new java.awt.Color(38, 11, 32));
        panelPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/mas (1).png"))); // NOI18N
        btnAgregar.setText("AGREGAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(402, 402, 402))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(lblNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnEditar)))
                        .addGap(63, 63, 63)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFavoritos)
                                .addGap(95, 95, 95)
                                .addComponent(btnReportes)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdmincontenido)
                                .addGap(65, 65, 65)
                                .addComponent(btnAgregar))
                            .addComponent(panelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrincipal)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lblCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(lblNacimiento)
                        .addGap(32, 32, 32)
                        .addComponent(btnEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnReportes)
                                        .addComponent(btnAdmincontenido)
                                        .addComponent(btnAgregar)))
                                .addGap(18, 18, 18)
                                .addComponent(panelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public JButton getBtnAgregarCategorias() {
        return btnAgregarCategorias;
    }

    public void setBtnAgregarCategorias(JButton btnAgregarCategorias) {
        this.btnAgregarCategorias = btnAgregarCategorias;
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

    public JButton getBtnAdmincontenido() {
        return btnAdmincontenido;
    }

    public void setBtnAdmincontenido(JButton btnAdmincontenido) {
        this.btnAdmincontenido = btnAdmincontenido;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnAgregarCapitulo() {
        return btnAgregarCapitulo;
    }

    public void setBtnAgregarCapitulo(JButton btnAgregarCapitulo) {
        this.btnAgregarCapitulo = btnAgregarCapitulo;
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

    public JButton getBtnAgregarPeliculas() {
        return btnAgregarPeliculas;
    }

    public void setBtnAgregarPeliculas(JButton btnAgregarPeliculas) {
        this.btnAgregarPeliculas = btnAgregarPeliculas;
    }

    public JButton getBtnAgregarSerie() {
        return btnAgregarSerie;
    }

    public void setBtnAgregarSerie(JButton btnAgregarSerie) {
        this.btnAgregarSerie = btnAgregarSerie;
    }

    public JButton getBtnAgregarSeries() {
        return btnAgregarSeries;
    }

    public void setBtnAgregarSeries(JButton btnAgregarSeries) {
        this.btnAgregarSeries = btnAgregarSeries;
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

    public JButton getBtnReportes() {
        return btnReportes;
    }

    public void setBtnReportes(JButton btnReportes) {
        this.btnReportes = btnReportes;
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

    public JDialog getjDialogAgregar() {
        return jDialogAgregar;
    }

    public void setjDialogAgregar(JDialog jDialogAgregar) {
        this.jDialogAgregar = jDialogAgregar;
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

    public JPanel getPanelCapitulosAgregados() {
        return panelCapitulosAgregados;
    }

    public void setPanelCapitulosAgregados(JPanel panelCapitulosAgregados) {
        this.panelCapitulosAgregados = panelCapitulosAgregados;
    }

    public JPanel getPanelPerfil() {
        return panelPerfil;
    }

    public void setPanelPerfil(JPanel panelPerfil) {
        this.panelPerfil = panelPerfil;
    }

    public JTextField getTextDescripcionCapitulo() {
        return textDescripcionCapitulo;
    }

    public void setTextDescripcionCapitulo(JTextField textDescripcionCapitulo) {
        this.textDescripcionCapitulo = textDescripcionCapitulo;
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

    public JTextField getTextTituloCapitulo() {
        return textTituloCapitulo;
    }

    public void setTextTituloCapitulo(JTextField textTituloCapitulo) {
        this.textTituloCapitulo = textTituloCapitulo;
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
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmincontenido;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCapitulo;
    private javax.swing.JButton btnAgregarCapitulo1;
    private javax.swing.JButton btnAgregarCategorias;
    private javax.swing.JButton btnAgregarCategoría;
    private javax.swing.JButton btnAgregarFotoPelicula;
    private javax.swing.JButton btnAgregarFotoSerie;
    private javax.swing.JButton btnAgregarFotoSerie1;
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JButton btnAgregarPeliculas;
    private javax.swing.JButton btnAgregarSerie;
    private javax.swing.JButton btnAgregarSerie1;
    private javax.swing.JButton btnAgregarSeries;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarCategoria;
    private javax.swing.JButton btnCancelarPelicula;
    private javax.swing.JButton btnCancelarSerie;
    private javax.swing.JButton btnCancelarSerie1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> comboCategoriaPelicula;
    private javax.swing.JComboBox<String> comboCategoriaSerie;
    private javax.swing.JComboBox<String> comboCategoriaSerie1;
    private com.toedter.calendar.JDateChooser jDateNacimiento;
    private javax.swing.JDialog jDialogAgregar;
    private javax.swing.JDialog jDialogAgregarCapitulos;
    private javax.swing.JDialog jDialogAgregarCategorias;
    private javax.swing.JDialog jDialogAgregarPeliculas;
    private javax.swing.JDialog jDialogAgregarSeries;
    private javax.swing.JDialog jDialogEditarPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JLabel lblFotoSerie1;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblpassseguro;
    private javax.swing.JPanel panelCapitulosAgregados;
    private javax.swing.JPanel panelCapitulosAgregados1;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JRadioButton radbtnAdmin;
    private javax.swing.JRadioButton radbtnCliente;
    private javax.swing.JPasswordField textContrasena;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textDescripcionCapitulo;
    private javax.swing.JTextField textDescripcionCapitulo1;
    private javax.swing.JTextField textDescripcionCategoria;
    private javax.swing.JTextField textDescripcionPelicula;
    private javax.swing.JTextField textDescripcionSerie;
    private javax.swing.JTextField textDescripcionSerie1;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTituloCapitulo;
    private javax.swing.JTextField textTituloCapitulo1;
    private javax.swing.JTextField textTituloCategoria;
    private javax.swing.JTextField textTituloPelicula;
    private javax.swing.JTextField textTituloSerie;
    private javax.swing.JTextField textTituloSerie1;
    // End of variables declaration//GEN-END:variables
}
