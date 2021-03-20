package model;

import java.awt.Image;
import java.util.List;

/**
 *
 * @author LUNA
 */
public class MPelicula extends Pelicula implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MPelicula(String id, String titulo, String descripcion, Image imagen, Categoria categoria, Video video) {
        super(id, titulo, descripcion, imagen, categoria, video);
    }

    @Override
    public boolean crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
