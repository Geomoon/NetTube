/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class vistaInicio extends javax.swing.JFrame {

    /**
     * Creates new form vistaIniciosesion
     */
    public vistaInicio() {
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

        panelContenido = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        btnMin = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setTitle("NetTube");
        setBackground(new java.awt.Color(228, 228, 228));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconos/nt-microsoft-windows.png")));
        setUndecorated(true);
        setResizable(false);

        panelContenido.setLayout(new java.awt.CardLayout());

        panelSuperior.setBackground(new java.awt.Color(38, 11, 32));

        btnMin.setBackground(new java.awt.Color(38, 11, 32));
        btnMin.setText("➖");
        btnMin.setToolTipText("Minimizar");
        btnMin.setBorder(null);
        btnMin.setBorderPainted(false);

        btnCerrar.setBackground(new java.awt.Color(38, 11, 32));
        btnCerrar.setText("✖");
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 425, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public JButton getBtnMin() {
        return btnMin;
    }

    public void setBtnMin(JButton btnMin) {
        this.btnMin = btnMin;
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public void setPanelContenido(JPanel panelContenido) {
        this.panelContenido = panelContenido;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMin;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
