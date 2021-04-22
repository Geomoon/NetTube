package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;

/**
 *
 * @author LUNA
 */
public class MPelicula extends Pelicula implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MPelicula(String id, String titulo, String descripcion, Image imagen, Categoria categoria, Video video) {
        super(id, titulo, descripcion, imagen, categoria, video);
    }

    public MPelicula() {
    }

    @Override
    public boolean crear() {
        String sql = "{CALL crear_pelicula(?, ?, ?, ?, ?)}";
        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setString(1, getTitulo());
            cs.setBinaryStream(2, Utils.toStream(getFile()), getFile().length());
            cs.setString(3, getDescripcion());
            cs.setString(4, getCategoria().getId());
            cs.setString(5, getVideo().getId());
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editar() {
        String sql = "{CALL editar_pelicula(?, ?, ?, ?, ?, ?)}";
        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setString(1, getId());
            cs.setString(2, getTitulo());
            cs.setBinaryStream(3, Utils.toStream(getFile()), getFile().length());
            cs.setString(4, getDescripcion());
            cs.setString(5, getCategoria().getId());
            cs.setString(6, getVideo().getId());
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM peliculas WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    public List<Pelicula> listar(String aguja, int limit) {
        String sql = "SELECT * FROM vista_peliculas WHERE ";
        sql += "LCASE(titulo) like LCASE('%" + aguja + "%') OR ";
        sql += "LCASE(categoria_id) like LCASE('%" + aguja + "%') ";
        if (limit != 0) {
            sql += "LIMIT " + limit;
        }

        List<Pelicula> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Pelicula(
                        rs.getString("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        Utils.toImage(rs.getBytes("portada")),
                        new Categoria(
                                rs.getString("categoria_id"),
                                rs.getString("nombre"),
                                null),
                        new Video(
                                rs.getString("video_id"),
                                rs.getString("duracion"),
                                rs.getString("dir"))
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
