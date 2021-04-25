package model;

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
public class MCapitulo extends Capitulo implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MCapitulo() {
    }

    public MCapitulo(String id, String titulo, String descripcion, Video video, Serie serie) {
        super(id, titulo, descripcion, video, serie);
    }

    @Override
    public boolean crear() {
        String sql = "CALL crear_capitulo ("
                + "'" + getTitulo() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getSerie().getId() + "', "
                + "'" + getVideo().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_capitulo ("
                + "'" + getId() + "', "
                + "'" + getTitulo() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getSerie().getId() + "', "
                + "'" + getVideo().getId() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM capitulos WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Capitulo> listar() {
        String sql = "SELECT * FROM vista_capitulos";
        List<Capitulo> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Capitulo(
                        rs.getString("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        new Video(
                                rs.getString("video_id"),
                                rs.getString("duracion"),
                                rs.getString("dir")),
                        null
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
    
    public List<Capitulo> buscarCapitulosSerie(String id) {
        String sql = "SELECT * FROM vista_capitulos WHERE ";
        sql+="serie_id ='"+id+"'";
        List<Capitulo> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Capitulo(
                        rs.getString("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        new Video(
                                rs.getString("video_id"),
                                rs.getString("duracion"),
                                rs.getString("dir")),
                        new Serie(rs.getString("serie_id"))
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MCapitulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
