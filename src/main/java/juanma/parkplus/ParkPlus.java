package juanma.parkplus;

import javax.swing.JOptionPane;

public class ParkPlus {

    public static void main(String[] args) {
        
        // archivo a leer
        
        String rutaCSV1 = "C:\\Users\\juan1\\OneDrive\\Documentos\\JM\\ParkPlus\\vehiculos100.csv";
       
        
// subir datos
        Funciones.subirDatos(rutaCSV1);
   
        JOptionPane.showMessageDialog(null, "carga completa");
    }
}
