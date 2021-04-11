package model;

import java.awt.Image;
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
public class MSerie extends Serie implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MSerie(String id, String titulo, String descripcion, Image imagen, Categoria categoria, List<Capitulo> capitulos) {
        super(id, titulo, descripcion, imagen, categoria, capitulos);
    }

    public MSerie() {
    }

    @Override
    public boolean crear() {
        String sql = "CALL crear_serie ("
                + "'" + getTitulo() + "', "
                + "'" + getImagen() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getCategoria().getId() + "'"
                + ")";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_serie ("
                + "'" + getId() + "', "
                + "'" + getTitulo() + "', "
                + "'" + getImagen() + "', "
                + "'" + getDescripcion() + "', "
                + "'" + getCategoria().getId() + "'"
                + ")";
        return (con.noQuery(sql) == null);
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

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
