/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class vistaPanelPelicula extends javax.swing.JPanel {

    /**
     * Creates new form PanelPelicula
     */
    public vistaPanelPelicula() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFoto = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lblEstrella = new javax.swing.JLabel();
        lblFav_id = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 11, 32));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(lbFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 18, 109, 129));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/titulo.png"))); // NOI18N
        lbTitulo.setText("titulo");
        add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 176, -1));

        lblEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/estrella desactivada.png"))); // NOI18N
        add(lblEstrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 30));

        lblFav_id.setForeground(new java.awt.Color(38, 11, 32));
        lblFav_id.setText("jLabel1");
        add(lblFav_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblFav_id() {
        return lblFav_id;
    }

    public void setLblFav_id(JLabel lblFav_id) {
        this.lblFav_id = lblFav_id;
    }

    public JLabel getLblEstrella() {
        return lblEstrella;
    }

    public void setLblEstrella(JLabel lblEstrella) {
        this.lblEstrella = lblEstrella;
    }

    public JLabel getLbFoto() {
        return lbFoto;
    }

    public void setLbFoto(JLabel lbFoto) {
        this.lbFoto = lbFoto;
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public void setLbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lblEstrella;
    private javax.swing.JLabel lblFav_id;
    // End of variables declaration//GEN-END:variables
}
