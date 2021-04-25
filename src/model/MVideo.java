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
public class MVideo extends Video implements Listable<Video>, Editable {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MVideo(int id, String duracion, String dir) {
        super(id, duracion, dir);
    }

    public MVideo() {
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
                list.add(new Video(rs.getInt("id"), rs.getString("duracion"), rs.getString("dir")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Video buscar(String dir) {
        Video v = null;
        String sql = "SELECT id FROM vista_videos where dir LIKE '%" + getDir() + "'";
        System.out.println(sql);
        try (ResultSet rs = con.query(sql)) {
            if (rs.next()) {
                v = new Video();
                v.setId(rs.getInt("id"));
                System.out.println("IDVIDEO: " + v.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

}
