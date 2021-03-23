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
public class MVideo extends Video implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MVideo(String id, String duracion, String dir) {
        super(id, duracion, dir);
    }

    @Override
    public boolean crear() {
        String sql = "CALL crear_video ("
                + "'" + getDuracion() + "', "
                + "'" + getDir() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_video ("
                + "'" + getId() + "', "
                + "'" + getDuracion() + "', "
                + "'" + getDir() + "' "
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM videos WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Video> listar() {
        String sql = "SELECT * FROM vista_videos";
        List<Video> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Video(rs.getString("id"), rs.getString("duracion"), rs.getString("dir")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
