/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.MAdmin;
import model.MUsuario;
import vista.vistaInicio;
import vista.vistaPanelInicioSesion;
import vista.vistaPanelRegistro;

/**
 *
 * @author LUNA
 */
public class App {

    static {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        CInicio inicio = new CInicio(
                new vistaInicio(), 
                new MAdmin(), 
                new MUsuario(), 
                new vistaPanelRegistro(), 
                new vistaPanelInicioSesion()
        );
        
        inicio.initControl();
    }
}
