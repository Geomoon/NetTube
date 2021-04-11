package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String sql = "CALL crear_pelicula ("
                + "'" + getTitulo() + "', "
                + "'" + getImagen() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getCategoria().getId() + "', "
                + "'" + getVideo().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_pelicula ("
                + "'" + getId() + "', "
                + "'" + getTitulo() + "', "
                + "'" + getImagen() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getCategoria().getId() + "', "
                + "'" + getVideo().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM peliculas WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Pelicula> listar() {
        String sql = "SELECT * FROM vista_peliculas";
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

}
