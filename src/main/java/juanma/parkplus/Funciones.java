package juanma.parkplus;

import Grafica.MenuPrincipal;
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
    
    private static int intentos = 3;
    public static void Login(String Usuario, String Contraseña, javax.swing.JFrame Login){
        final String USUARIO = "HERNANDEZ";
        final String PASS = "Hernandez96";
        boolean f = false;

        if(Contraseña.length() >= 8) {
            if(Usuario.equals(USUARIO) && Contraseña.equals(PASS)) {
                f = true;
            } else {
                intentos--;
                if(intentos > 0) {
                    JOptionPane.showMessageDialog(Login, "Contraseña o Usuario son incorrectos.\nLe quedan " + intentos + " intentos");
                } else {
                    JOptionPane.showMessageDialog(Login, "Se agotaron los intentos. Acceso denegado.");
                    System.exit(0);
                }
            }
        } else {
            intentos--;
            if(intentos > 0) {
                JOptionPane.showMessageDialog(Login, "Contraseña tiene que tener mínimo 8 caracteres.\nLe quedan " + intentos + " intentos");
            } else {
                JOptionPane.showMessageDialog(Login, "Se agotaron los intentos. Acceso denegado.");
                System.exit(0);
            }
        }

        
        if(f) {
            MenuPrincipal ventana=new MenuPrincipal();
           ventana.setVisible(true);
           ventana.setLocationRelativeTo(null);
            Login.dispose();
            
            intentos = 3; // aqui reinicio, es opcional
        }
    }
    }
