
package juanma.conexion;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class MySQL {
    private Connection conectar;

    public Connection Conexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/parkplus";
            String usuario = "root";
            String contraseña = "";
            conectar = DriverManager.getConnection(url, usuario, contraseña);
            return conectar;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null,"Error");
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if(conectar != null && !conectar.isClosed()){
                conectar.close();
            }
        } catch(Exception error) {
           JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
