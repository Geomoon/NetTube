package model;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;

/**
 *
 * @author LUNA
 */
public class MAdmin extends Admin implements Listable<Admin>, Editable {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MAdmin() {
    }

    public MAdmin(int id, String nombre, String apellido, String email, String password, Date fechaNac, Image foto) {
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
            cs.setByte(7, (byte) 1);
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
            cs.setByte(8, (byte) 1);
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
    public List listar() {
        List<Usuario> list = new ArrayList<>();
        String sql = "SELECT * FROM vista_admins";
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Admin(
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
    public Admin buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static MAdmin obtenerPorEmail(String email) {
        String sql = "SELECT id, nombre, apellido, email, aes_decrypt(password, '357190'), fecha_nacimiento, foto"
                + " from vista_admins"
                + " where email='" + email + "'";
        MAdmin usuario = null;
        try (ResultSet rs = con.query(sql)) {
            if (rs.next()) {
                usuario = new MAdmin();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString(5));
                usuario.setFechaNac(rs.getDate("fecha_nacimiento"));
                usuario.setFoto(Utils.toImage(rs.getBytes("foto")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
}
