/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<Favoritos_Peliculas> buscar(String id_usuario) {
        String sql = "SELECT * FROM vista_peliculas_favoritas WHERE ";
        sql+="id_usuario ='"+id_usuario+"'";
        List<Favoritos_Peliculas> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Favoritos_Peliculas(rs.getString("id_peliculas_favoritas"),
                                            new Favoritos(rs.getString("id_favoritos"),
                                                          new UsuarioApp(rs.getString("id_usuario"))),
                                            new Pelicula(rs.getString("id_pelicula"))
                                              ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Favoritos_Peliculas> buscarIdPeliculaFav(String id_usuario,String id_Pelicula) {
        String sql = "SELECT * FROM vista_peliculas_favoritas WHERE ";
        sql+="id_usuario ='"+id_usuario+"' AND ";
        sql+="id_pelicula ='"+id_Pelicula+"'";
        List<Favoritos_Peliculas> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Favoritos_Peliculas(rs.getString("id_peliculas_favoritas"),
                                            new Favoritos(rs.getString("id_favoritos"),
                                                          new UsuarioApp(rs.getString("id_usuario"))),
                                            new Pelicula(rs.getString("id_pelicula"))
                                              ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
