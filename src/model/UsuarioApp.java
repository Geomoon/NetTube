/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author LUNA
 */
public class UsuarioApp extends Usuario {

    public UsuarioApp() {
    }

    public UsuarioApp(int id) {
        super(id);
    }
    
    public UsuarioApp(int id, String nombre, String apellido, String email, String password, Date fechaNac, Image foto) {
        super(id, nombre, apellido, email, password, fechaNac, foto);
    }

    public UsuarioApp(int id, String nombre, String apellido, String email) {
        super(id, nombre, apellido, email);
    }
    
    

}
