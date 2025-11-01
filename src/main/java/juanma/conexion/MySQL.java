package juanma.conexion;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import juanma.parkplus.Vehiculo;

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
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos: " + error.getMessage());
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if(conectar != null && !conectar.isClosed()){
                conectar.close();
            }
        } catch(Exception error) {
           JOptionPane.showMessageDialog(null,"Error al cerrar la conexión: " + error.getMessage());
        }
    }
    
    public void subirVehiculo(Vehiculo vehiculo){
        try {
            if(conectar != null){
                String sql = "INSERT INTO vehiculos (Id_Usuario, Tipo, Placa, Marca, Modelo, Color, anio) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conectar.prepareStatement(sql);
                statement.setInt(1, vehiculo.Id_Usuario);
                statement.setString(2, vehiculo.Tipo);
                statement.setString(3, vehiculo.Placa);
                statement.setString(4, vehiculo.Marca);
                statement.setString(5, vehiculo.Modelo);
                statement.setString(6, vehiculo.Color);
                statement.setInt(7, vehiculo.Anio);

                statement.executeUpdate(); // Ejecuta el insert
            } else {
                JOptionPane.showMessageDialog(null,"No hay conexión a la base de datos");
            }
        } catch(Exception error) {
            JOptionPane.showMessageDialog(null,"Error al insertar vehículo: " + error.getMessage());
        }
    }
}
