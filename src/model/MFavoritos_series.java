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
public class MFavoritos_series extends Favoritos_Series implements CRUD {
    
    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MFavoritos_series() {
    }   

    public MFavoritos_series(String id, Favoritos favorito, Serie serie) {
        super(id, favorito, serie);
    }

    public boolean crear() {
        String fav_id="";
        String sql = "CALL crear_series_favoritas ("
                + "'" + getFavorito().getUser().getId() + "', "              
                + "'" + getSerie().getId() + "' "
                + ")";
        
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean eliminar() {
        String sql = "DELETE FROM series_favoritas WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Favoritos_Series> buscar(String id_usuario) {
        String sql = "SELECT * FROM vista_series_favoritas WHERE ";
        sql+="id_usuario ='"+id_usuario+"'";
        List<Favoritos_Series> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Favoritos_Series(rs.getString("id_series_favoritas"),
                                            new Favoritos(rs.getString("id_favoritos"),
                                                          new UsuarioApp(rs.getString("id_usuario"))),
                                            new Serie(rs.getString("id_serie"))
                                              ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Favoritos_Series> buscarIdSerieFav(String id_usuario,String id_serie) {
        String sql = "SELECT * FROM vista_series_favoritas WHERE ";
        sql+="id_usuario ='"+id_usuario+"' AND ";
        sql+="id_serie ='"+id_serie+"'";
        List<Favoritos_Series> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Favoritos_Series(rs.getString("id_series_favoritas"),
                                            new Favoritos(rs.getString("id_favoritos"),
                                                          new UsuarioApp(rs.getString("id_usuario"))),
                                            new Serie(rs.getString("id_serie"))
                                              ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
}
