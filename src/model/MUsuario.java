package model;

import java.awt.Image;
import java.sql.CallableStatement;
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

    public MUsuario(int id, String nombre, String apellido, String email, String password, Date fechaNac, Image foto) {
        super(id, nombre, apellido, email, password, fechaNac, foto);
    }

 @Override
    public boolean crear() {
        String sql = "{call crear_usuario(?, ?, ?, ?, ?, ?, ?)}";

        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setString(1, getNombre());
            cs.setString(2, getApellido());
            cs.setString(3, getEmail());
            cs.setString(4, getPassword());
            cs.setDate(5, new java.sql.Date(getFechaNac().getTime()));
            cs.setBinaryStream(6, Utils.toStream(getFile()), getFile().length());
            cs.setByte(7, (byte) 0);
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar() {
        String sql = "{call editar_usuario(?, ?, ?, ?, ?, ?, ?, ?)}";
        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setInt(1, getId());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setString(4, getEmail());
            cs.setString(5, getPassword());
            cs.setDate(6, new java.sql.Date(getFechaNac().getTime()));
            cs.setBinaryStream(7, Utils.toStream(getFile()), getFile().length());
            cs.setByte(8, (byte) 0);
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
                        rs.getInt("id"),
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

    public static MUsuario obtenerPorEmail(String email) {
        String sql = "SELECT id, nombre, apellido, email, AES_DECRYPT(password, '357190'), fecha_nacimiento, foto"
                + " FROM vista_usuarios"
                + " WHERE email='" + email + "'";
        MUsuario usuario = null;
        try (ResultSet rs = con.query(sql)) {
            if (rs.next()) {
                usuario = new MUsuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString(5));
                usuario.setFechaNac(rs.getDate("fecha_nacimiento"));
                usuario.setFoto(Utils.toImage(rs.getBytes("foto")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

}
