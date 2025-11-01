
package juanma.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    private Connection conn;

    public Connection getConexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/parkplus";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
