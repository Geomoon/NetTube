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
public class MUsuario extends UsuarioApp implements Listable<UsuarioApp>, Editable {

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
    public List<UsuarioApp> listar() {
        List<UsuarioApp> list = new ArrayList<>();
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
    public UsuarioApp buscar(String id) {
        return null;
    }

    public static UsuarioApp obtenerPorEmail(String email) {
        String sql = "SELECT id, nombre, apellido, email, AES_DECRYPT(password, '357190')"
                + " FROM vista_usuarios"
                + " WHERE email='" + email + "'";
        UsuarioApp usuario = null;
        try (ResultSet rs = con.query(sql)) {
            if (rs.next()) {
                usuario = new MUsuario();
                usuario.setId(rs.getString("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

}
