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
public class MFavoritos extends Favoritos implements CRUD{

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MFavoritos() {
    }

    public MFavoritos(String id) {
        super(id);
    }

    public MFavoritos(String id, UsuarioApp user) {
        super(id, user);
    }
    
    @Override
    public boolean crear() {
        String sql = "CALL crear_favoritos ("            
                + "'" + getUser().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM favoritos WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Favoritos> listar() {
        String sql = "SELECT * FROM vista_favoritos";
        List<Favoritos> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Favoritos(
                        rs.getString("id"),
                        new UsuarioApp(
                                rs.getString("id_usuario"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getString("email"))             
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MCapitulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
