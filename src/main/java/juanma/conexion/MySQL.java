package juanma.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
    private static final String URL="jdbc:mysql://localhost:3306/parkplus";
    private static final String USER="root";
    private static final String PASSWORD="";
    private static Connection conexion=null;

    public static Connection Conectar(){
        try{
            if(conexion==null || conexion.isClosed()){
                conexion=DriverManager.getConnection(URL,USER,PASSWORD);
            }
            return conexion;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

   
    
    public static boolean verificarConexion(){
        Connection prueba = Conectar();{
        if(prueba != null){
            return true;//conecto
        }else{
            return false;//no conecto
        }
    }
    }
    
     //cerrar conexion
    public static void Cerrar(){
        try{
            if(conexion!=null && !conexion.isClosed()){
                conexion.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
