package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LUNA
 */
public class ConexionMySQL {

    //private String url = "jdbc:mysql://192.168.0.121:3306/nettubedb";
    private String url = "jdbc:mysql://localhost:3306/nettubedb?serverTimezone=UTC";

    private String user = "clientenettube";
    private String password = "cliente357190";

    private Connection con;

    private static ConexionMySQL instance;

    private ConexionMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ConexionMySQL getInstance() {
        if (instance == null) {
            return new ConexionMySQL();
        }
        return instance;
    }

    public ResultSet query(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException noQuery(String nosql) {
        try (Statement st = con.createStatement()) {
            st.execute(nosql);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public static void main(String[] args) {
        ConexionMySQL.getInstance();
    }
}
