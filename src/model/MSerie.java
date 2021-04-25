package model;

import java.awt.Image;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;

/**
 *
 * @author LUNA
 */
public class MSerie extends Serie implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MSerie(String id, String titulo, String descripcion, Image imagen, Categoria categoria, List<Capitulo> capitulos) {
        super(id, titulo, descripcion, imagen, categoria, capitulos);
    }

    public MSerie() {
    }

    @Override
    public boolean crear() {
        String sql = "{CALL crear_serie (?, ?, ?, ?)}";

        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setString(1, getTitulo());
            cs.setBinaryStream(2, Utils.toStream(getFile()), getFile().length());
            cs.setString(3, getDescripcion());
            cs.setString(4, getCategoria().getId());
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("fuera");
        return false;
    }

    @Override
    public boolean editar() {
        String sql = "{CALL crear_serie (?, ?, ?, ?, ?)}";

        try (CallableStatement cs = con.getCon().prepareCall(sql)) {
            cs.setString(1, getId());
            cs.setString(2, getTitulo());
            cs.setBinaryStream(3, Utils.toStream(getFile()), getFile().length());
            cs.setString(4, getDescripcion());
            cs.setString(5, getCategoria().getId());
            return cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM series WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Serie> listar() {
        String sql = "SELECT * FROM vista_series";
        List<Serie> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Serie(
                        rs.getString("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        Utils.toImage(rs.getBytes("portada")),
                        new Categoria(
                                rs.getString("categoria_id"),
                                rs.getString("nombre"),
                                ""),
                        null
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Serie> listar(String text, int limit) {

        String sql = "SELECT * FROM vista_series ";
        sql += " WHERE LCASE(titulo) like LCASE('%" + text + "%') OR ";
        sql += "LCASE(categoria_id) like LCASE('%" + text + "%') ";
        if (limit != 0) {
            sql += " LIMIT " + limit;
        }

        List<Serie> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Serie(
                        rs.getString("id"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        Utils.toImage(rs.getBytes("portada")),
                        new Categoria(
                                rs.getString("categoria_id"),
                                rs.getString("nombre"),
                                ""),
                        null
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MSerie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
