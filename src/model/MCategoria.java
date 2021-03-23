package model;

import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LUNA
 */
public class MCategoria extends Categoria implements CRUD {

    private static ConexionMySQL con = ConexionMySQL.getInstance();

    public MCategoria() {
    }

    public MCategoria(String id, String nombre, String descripcion) {
        super(id, nombre, descripcion);
    }

    @Override
    public boolean crear() {
        String sql = "CALL crear_categoria ("
                + "'" + getNombre() + "', "
                + "'" + getDescripcion() + "' "
                + "')";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean editar() {
        String sql = "CALL editar_categoria ("
                + "'" + getId() + "', "
                + "'" + getNombre() + "', "
                + "'" + getDescripcion() + "' "
                + "')";
        return (con.noQuery(sql) == null);
    }

    @Override
    public boolean eliminar() {
        String sql = "DELETE FROM categorias WHERE id='" + getId() + "'";
        return (con.noQuery(sql) == null);
    }

    @Override
    public List<Categoria> listar() {
        String sql = "SELECT * FROM vista_categorias";
        List<Categoria> list = new ArrayList<>();
        try (ResultSet rs = con.query(sql)) {
            while (rs.next()) {
                list.add(new Categoria(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Object buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
