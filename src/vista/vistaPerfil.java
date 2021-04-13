/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
                                .addGap(60, 60, 60)
                                .addComponent(btnAgregarFotoSerie))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnAgregarCapitulo)))
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
            .addGroup(jDialogAgregarSeriesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmincontenido;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCapitulo;
    private javax.swing.JButton btnAgregarCategorias;
    private javax.swing.JButton btnAgregarCategoría;
    private javax.swing.JButton btnAgregarFotoPelicula;
    private javax.swing.JButton btnAgregarFotoSerie;
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JButton btnAgregarPeliculas;
    private javax.swing.JButton btnAgregarSerie;
    private javax.swing.JButton btnAgregarSeries;
    private javax.swing.JButton btnCancelarCategoria;
    private javax.swing.JButton btnCancelarPelicula;
    private javax.swing.JButton btnCancelarSerie;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> comboCategoriaPelicula;
    private javax.swing.JComboBox<String> comboCategoriaSerie;
    private javax.swing.JDialog jDialogAgregar;
    private javax.swing.JDialog jDialogAgregarCategorias;
    private javax.swing.JDialog jDialogAgregarPeliculas;
    private javax.swing.JDialog jDialogAgregarSeries;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFavoritos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFotoPelicula;
    private javax.swing.JLabel lblFotoSerie;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelCapitulosAgregados;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JTextField textDescripcionCapitulo;
    private javax.swing.JTextField textDescripcionCategoria;
    private javax.swing.JTextField textDescripcionPelicula;
    private javax.swing.JTextField textDescripcionSerie;
    private javax.swing.JTextField textTituloCapitulo;
    private javax.swing.JTextField textTituloCategoria;
    private javax.swing.JTextField textTituloPelicula;
    private javax.swing.JTextField textTituloSerie;
    // End of variables declaration//GEN-END:variables
}
