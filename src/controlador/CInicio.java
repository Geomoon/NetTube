/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.MAdmin;
import model.MUsuario;
import vista.vistaInicio;
import vista.vistaPanelInicioSesion;
import vista.vistaPanelRegistro;

/**
 *
 * @author LUNA
 */
public class CInicio {

    private vistaInicio vInicio;
    private MAdmin mAdmin;
    private MUsuario mUsuario;

    private vistaPanelRegistro vRegistro;
    private vistaPanelInicioSesion vInicioSesion;
    
    private JPanel panelLayout;

    public CInicio(vistaInicio vInicio, MAdmin mAdmin, MUsuario mUsuario, vistaPanelRegistro vRegistro, vistaPanelInicioSesion vInicioSesion) {
        this.vInicio = vInicio;
        this.mAdmin = mAdmin;
        this.mUsuario = mUsuario;
        this.vRegistro = vRegistro;
        this.vInicioSesion = vInicioSesion;
        
    }

    public void initControl() {
        panelLayout = vInicio.getPanelContenido();

        vInicio.getPanelContenido().add(vInicioSesion, "cardSesion");
        vInicio.getPanelContenido().add(vRegistro, "cardRegistro");

        CardLayout layout = (CardLayout) panelLayout.getLayout();

        layout.show(panelLayout, "cardSesion");

        vInicio.setLocationRelativeTo(null);
        vInicio.setVisible(true);
        
        initCInicioSesion();
        initCRegistro();
        
        addEvents();
    }
    
    private void addEvents() {
        vInicio.getBtnMin().addActionListener(l -> vInicio.setExtendedState(JFrame.ICONIFIED));
        vInicio.getBtnCerrar().addActionListener(l -> System.exit(0));
    }
    
    private void initCInicioSesion() {
        CInicioSesion cInicioSesion = new CInicioSesion(mAdmin, mUsuario, vInicioSesion, panelLayout);
        cInicioSesion.initControl();
    }
    
    private void initCRegistro() {
        CRegistro cRegistro = new CRegistro(mAdmin, mUsuario, vRegistro, panelLayout);
        cRegistro.initControl();
    }

}
