/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LUNA
 */
public class vistaPanelInicioSesion extends javax.swing.JPanel {

    /**
     * Creates new form vistaPanelInicioSesion
     */
    public vistaPanelInicioSesion() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textContrasena = new javax.swing.JPasswordField();
        btnIniciosesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(612, 428));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NetTube");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CORREO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        textUsuario.setBackground(new java.awt.Color(63, 25, 56));
        textUsuario.setForeground(new java.awt.Color(204, 204, 204));
        add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 201, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASE??A");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        textContrasena.setBackground(new java.awt.Color(63, 25, 56));
        textContrasena.setForeground(new java.awt.Color(204, 204, 204));
        add(textContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 201, 30));

        btnIniciosesion.setBackground(new java.awt.Color(34, 12, 51));
        btnIniciosesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciosesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciosesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/iniciar-sesion.png"))); // NOI18N
        btnIniciosesion.setText("INICIAR SESI??N");
        btnIniciosesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnIniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, 42));

        btnRegistrarse.setBackground(new java.awt.Color(34, 12, 51));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/agregar-usuario (1).png"))); // NOI18N
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, 42));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/pinguino.png"))); // NOI18N
        jLabel4.setText("GO.PovDDI  ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 110, -1));

        jLabel6.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel6.setText("Comienza con Nosotros ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fondo-login1.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 430));
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnIniciosesion() {
        return btnIniciosesion;
    }

    public void setBtnIniciosesion(JButton btnIniciosesion) {
        this.btnIniciosesion = btnIniciosesion;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public JPasswordField getTextContrasena() {
        return textContrasena;
    }

    public void setTextContrasena(JPasswordField textContrasena) {
        this.textContrasena = textContrasena;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciosesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField textContrasena;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
