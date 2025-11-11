package juanma.conexion;

import javax.swing.*;
import java.io.*;
import java.sql.Connection;

public class CargarCVS {

    public static void Cargar(JFrame parentFrame){
        JFileChooser selector=new JFileChooser();
        selector.setMultiSelectionEnabled(true);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setDialogTitle("Selecciona los archivos CVS");

        int resultado=selector.showOpenDialog(parentFrame);
        if(resultado==JFileChooser.APPROVE_OPTION){
            File[] archivos=selector.getSelectedFiles();

            for(File archivo:archivos){
                String nombre=archivo.getName().toLowerCase();

                if(nombre.contains("areas")){
                    cargarAreas(archivo);
                }else if(nombre.contains("spots")){
                    cargarSpots(archivo);
                }else if(nombre.contains("vehiculos")){
                    cargarVehiculos(archivo);
                }else if(nombre.contains("historico")){
                    cargarHistorico(archivo);
                }else{
                    JOptionPane.showMessageDialog(parentFrame,"Archivo no reconocido: "+archivo.getName(),
                            "ParkPlus",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    
    private static void cargarAreas(File archivo){
        try{
            BufferedReader br=new BufferedReader(new FileReader(archivo));
            String linea=br.readLine();if(linea==null)return;
            String sep=linea.contains("|")?"\\|":",";

            Connection con=MySQL.Conectar();
            var ps=con.prepareStatement("INSERT INTO areas(area_id,nombre,capacidad,tipo_vehiculo) VALUES(?,?,?,?)");

            while((linea=br.readLine())!=null){
                String[] d=linea.split(sep);
                if(d.length<4)continue;
                ps.setString(1,d[0]);
                ps.setString(2,d[1]);
                ps.setInt(3,Integer.parseInt(d[2]));
                ps.setString(4,d[3]);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null,"Archivo "+archivo.getName()+" cargado en MySQL.","ParkPlus",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en "+archivo.getName()+": "+e.getMessage(),"ParkPlus",JOptionPane.ERROR_MESSAGE);
        }
    }

  
    private static void cargarSpots(File archivo){
        try{
            BufferedReader br=new BufferedReader(new FileReader(archivo));
            String linea=br.readLine();if(linea==null)return;
            String sep=linea.contains("|")?"\\|":",";

            Connection con=MySQL.Conectar();
            var ps=con.prepareStatement("INSERT INTO spots(spot_id,area_id,disponible,tipo_vehiculo) VALUES(?,?,?,?)");

            while((linea=br.readLine())!=null){
                String[] d=linea.split(sep);
                if(d.length<4)continue;
                ps.setString(1,d[0]);
                ps.setString(2,d[1]);
                ps.setString(3,d[2]);
                ps.setString(4,d[3]);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null,"Archivo "+archivo.getName()+" cargado en MySQL.","ParkPlus",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en "+archivo.getName()+": "+e.getMessage(),"ParkPlus",JOptionPane.ERROR_MESSAGE);
        }
    }


    private static void cargarVehiculos(File archivo){
        try{
            BufferedReader br=new BufferedReader(new FileReader(archivo));
            String linea=br.readLine();if(linea==null)return;
            String sep=linea.contains("|")?"\\|":",";

            Connection con=MySQL.Conectar();
            var ps=con.prepareStatement("INSERT INTO vehiculos(vehiculo_id,placa,marca,modelo,color,tipo,dueno) VALUES(?,?,?,?,?,?,?)");

            while((linea=br.readLine())!=null){
                String[] d=linea.split(sep);
                if(d.length<7)continue;
                ps.setString(1,d[0]);
                ps.setString(2,d[1]);
                ps.setString(3,d[2]);
                ps.setString(4,d[3]);
                ps.setString(5,d[4]);
                ps.setString(6,d[5]);
                ps.setString(7,d[6]);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null,"Archivo "+archivo.getName()+" cargado en MySQL.","ParkPlus",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en "+archivo.getName()+": "+e.getMessage(),"ParkPlus",JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private static void cargarHistorico(File archivo){
        try{
            BufferedReader br=new BufferedReader(new FileReader(archivo));
            String linea=br.readLine();if(linea==null)return;
            String sep=linea.contains("|")?"\\|":",";

            Connection con=MySQL.Conectar();
            var ps=con.prepareStatement("INSERT INTO historico(historial_id,vehiculo_id,area_id,fecha_entrada,fecha_salida) VALUES(?,?,?,?,?)");

            while((linea=br.readLine())!=null){
                String[] d=linea.split(sep);
                if(d.length<5)continue;
                ps.setString(1,d[0]);
                ps.setString(2,d[1]);
                ps.setString(3,d[2]);
                ps.setString(4,d[3]);
                ps.setString(5,d[4]);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(null,"Archivo "+archivo.getName()+" cargado en MySQL.","ParkPlus",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en "+archivo.getName()+": "+e.getMessage(),"ParkPlus",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}

   