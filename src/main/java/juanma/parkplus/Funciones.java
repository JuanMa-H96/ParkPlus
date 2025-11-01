package juanma.parkplus;

import juanma.conexion.MySQL;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;

public class Funciones {

    // subir csv
    public static void subirDatos(String rutaArchivoCSV){
        MySQL Datos = new MySQL(); // llamamos a la clase MySQL

        try {
            // abrir conexion
            if(Datos.Conexion() != null){ 
                try (BufferedReader lectorCSV = new BufferedReader(new FileReader(rutaArchivoCSV))) {
                    String linea;
                    boolean esPrimeraLinea = true;

                    while ((linea = lectorCSV.readLine()) != null) {
                        if (esPrimeraLinea) { // Saltar encabezado
                            esPrimeraLinea = false;
                            continue;
                        }

                        String[] datosVehiculo = linea.split(",");

                        // Creamos el objeto Vehiculo directamente con los datos
                        Vehiculo vehiculo = new Vehiculo(
                            Integer.parseInt(datosVehiculo[0].trim()),
                            datosVehiculo[1].trim(),
                            datosVehiculo[2].trim(),
                            datosVehiculo[3].trim(),
                            datosVehiculo[4].trim(),
                            datosVehiculo[5].trim(),
                            Integer.parseInt(datosVehiculo[6].trim())
                        );

                        // Insertamos el vehículo en la base de datos
                        Datos.subirVehiculo(vehiculo);
                    }

                    JOptionPane.showMessageDialog(null,"Se cargaron los vehículos correctamente");

                } catch (Exception errorcvs) {
                    JOptionPane.showMessageDialog(null,"Error al leer el archivo CSV: " + errorcvs.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null,"No se pudo conectar a MySQL");
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null,"No se subieron datos: " + error.getMessage());
        } finally {
            Datos.cerrarConexion(); // Cerrar siempre la conexión
        }
    }
}
