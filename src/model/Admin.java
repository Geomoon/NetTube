package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author LUNA
 */
public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(int id, String nombre, String apellido, String email, String password, Date fechaNac, Image foto) {
        super(id, nombre, apellido, email, password, fechaNac, foto);
    }

}
