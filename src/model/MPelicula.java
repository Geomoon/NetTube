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
public class MPelicula extends Pelicula implements Listable<Pelicula>, Editable {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MPelicula(int id, String titulo, String descripcion, Image imagen, Categoria categoria, Video video) {
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
            cs.setInt(4, getCategoria().getId());
            cs.setInt(5, getVideo().getId());
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
            cs.setInt(1, getId());
            cs.setString(2, getTitulo());
            cs.setBinaryStream(3, Utils.toStream(getFile()), getFile().length());
            cs.setString(4, getDescripcion());
            cs.setInt(5, getCategoria().getId());
            cs.setInt(6, getVideo().getId());
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean editarSinFoto() {
        String sql = "{CALL editar_pelicula_sin_foto(?, ?, ?, ?, ?)}";
        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setInt(1, getId());
            cs.setString(2, getTitulo());
            cs.setString(3, getDescripcion());
            cs.setInt(4, getCategoria().getId());
            cs.setInt(5, getVideo().getId());
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
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        Utils.toImage(rs.getBytes("portada")),
                        new Categoria(
                                rs.getInt("categoria_id"),
                                rs.getString("nombre"),
                                null),
                        new Video(
                                rs.getInt("video_id"),
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
    public Pelicula buscar(String titulo) {
        Pelicula p = null;
        String sql = "SELECT id from vista_peliculas where LCASE(titulo) = LCASE('" + getTitulo() + "')";
        try (ResultSet rs = con.query(sql)) {
            if (rs.next()) {
                p = new Pelicula(rs.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public List<Pelicula> buscarTitulo(String titulo) {
        List<Pelicula> list = new ArrayList<>();
        String sql = "SELECT titulo from vista_peliculas where LCASE(titulo) LIKE LCASE('%" + titulo + "%') LIMIT 3";
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                Pelicula p = new Pelicula();
                p.setTitulo(rs.getString("titulo"));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
