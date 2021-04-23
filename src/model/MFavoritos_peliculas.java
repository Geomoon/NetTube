/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author User
 */
public class MFavoritos_peliculas extends Favoritos_Peliculas implements CRUD{
    
    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MFavoritos_peliculas() {
    }

    public MFavoritos_peliculas(String id, Favoritos favoritos, Pelicula pelicula) {
        super(id, favoritos, pelicula);
    }
    
    @Override
    public boolean crear() {
        String sql = "CALL crear_pelicula_favoritas ("
                + "'" + getFavoritos().getId() + "', "               
                + "'" + getPelicula().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM peliculas_favoritas WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
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
