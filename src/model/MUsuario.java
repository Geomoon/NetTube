package model;

import java.awt.Image;
import java.util.Date;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LUNA
 */
public class MUsuario extends UsuarioApp implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MUsuario() {
    }

    public MUsuario(String id, String nombre, String apellido, String email, String password, Date fechaNac, Image foto) {
        super(id, nombre, apellido, email, password, fechaNac, foto);
    }

    @Override
    public boolean crear() {
        String sql = "CALL crear_usuario ("
                + "'" + getNombre() + "', "
                + "'" + getApellido() + "', "
                + "'" + getEmail() + "', "
                + "'" + getPassword() + "', "
                + "'" + new java.sql.Date(getFechaNac().getTime()) + "', "
                + "'" + Utils.toStream(getFoto()) + "', "
                + "'')";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_usuario ("
                + "'" + getId() + "', "
                + "'" + getNombre() + "', "
                + "'" + getApellido() + "', "
                + "'" + getEmail() + "', "
                + "'" + getPassword() + "', "
                + "'" + new java.sql.Date(getFechaNac().getTime()) + "', "
                + "'" + Utils.toStream(getFoto()) + "', "
                + "'')";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM usuarios WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> list = new ArrayList<>();
        String sql = "SELECT * FROM vista_usuarios";
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new UsuarioApp(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("fecha_nacimiento"),
                        Utils.toImage(rs.getBytes("foto"))
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String campo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
