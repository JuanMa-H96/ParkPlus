
package juanma.parkplus;

import juanma.conexion.MySQL;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ParkPlus {

    public static void main(String[] args) {
       MySQL mysql = new MySQL();
        Connection conectar = mysql.Conexion();

        if(conectar != null){
            JOptionPane.showMessageDialog(null,"Conectado");
        } else {
            JOptionPane.showMessageDialog(null,"Error");
        }

        mysql.cerrarConexion();
    }
    
}
