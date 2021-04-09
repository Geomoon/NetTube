/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import model.MAdmin;
import model.MUsuario;
import vista.vistaIniciosesion;

/**
 *
 * @author LUNA
 */
public class App {

    public static void main(String[] args) {
        CInicioSesion inicio = new CInicioSesion(
                new MAdmin(),
                new MUsuario(),
                new vistaIniciosesion()
        );
        
        inicio.initControl();
    }
}
