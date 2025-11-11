package juanma.parkplus;
import juanma.conexion.MySQL;
import Grafica.MenuPrincipal;


import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;


public class Funciones {
    
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
                    JOptionPane.showMessageDialog(Login, "Contraseña o Usuario son incorrectos."
                                                     + "\n           Le quedan " + intentos + " intentos");
                } else {
                    JOptionPane.showMessageDialog(Login, "Se agotaron los intentos. "
                                                     + "\n     Acceso denegado.");
                    System.exit(0);
                }
            }
        } else {
            intentos--;
            if(intentos > 0) {
                JOptionPane.showMessageDialog(Login, "Contraseña tiene que tener mínimo 8 caracteres."
                                                + "\n                  Le quedan " + intentos + " intentos");
            } else {
                JOptionPane.showMessageDialog(Login, "Se agotaron los intentos."
                                                 + "\n     Acceso denegado.");
                System.exit(0);
            }
        }

        
        if(f) {
           MenuPrincipal ventana=new MenuPrincipal();
           ventana.setVisible(true);
           ventana.setLocationRelativeTo(null);
            Login.dispose();//Cierra el jframe
            
            intentos = 3; // aqui reinicio, es opcional
        }
    }
    
        
   
    
    
}
        