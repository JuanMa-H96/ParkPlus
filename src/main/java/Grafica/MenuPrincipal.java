
package Grafica;
import juanma.conexion.MySQL;
import juanma.conexion.CargarCVS;

import javax.swing.*;
import java.awt.*;
import juanma.parkplus.Funciones;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    
    public MenuPrincipal() {
        initComponents();
        
        setTitle("Menu Principal");
        setSize(890,515);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //colocar imagen
        jPanel1 = new JPanel(){
            Image fondo = new ImageIcon("C:\\Users\\juan1\\OneDrive\\Documentos\\JM\\ParkPlus\\menu.jpg").getImage();
            
            @Override
            protected void paintComponent(Graphics g){
                g.drawImage(fondo, 0 , 0, getWidth(), getHeight(), this);
            }
        };           
                
        setContentPane(jPanel1);//coloca el panel como fondo
        
        jPanel1.setLayout(null);//inserto y organizo los botones que van sobre el fondo
        
        jPanel1.add(UMG);
        jPanel1.add(spots);
        jPanel1.add(smoto);
        jPanel1.add(scarro);
            
        jPanel1.add(estudiante);
        jPanel1.add(profesor);
        jPanel1.add(visitante);
        
        jPanel1.add(dmestudiante);
        jPanel1.add(dmprofesor);
        jPanel1.add(dmvisitante);
        
        jPanel1.add(dcestudiante);
        jPanel1.add(dcprofesor);
        jPanel1.add(dcvisitante);
          
        jPanel1.add(Parqueo);
        jPanel1.add(Ingreso);
        jPanel1.add(Salida);
        jPanel1.add(Registro);
        jPanel1.add(Recarga);
        jPanel1.add(Administrador);
        jPanel1.add(HAuto);
        jPanel1.add(HRUsuario);
        jPanel1.add(Cargar);
        jPanel1.add(Fecha);
        jPanel1.add(Salir);
        
        jPanel1.add(antena);
        jPanel1.add(estado);
        
        
         //aqui puedo modificar los botones
         
         smoto.setOpaque(false);
         smoto.setBorder(BorderFactory.createEmptyBorder());
         scarro.setOpaque(false);
         scarro.setBorder(BorderFactory.createEmptyBorder());
         
         dmestudiante.setOpaque(false);
         dmestudiante.setBorder(BorderFactory.createEmptyBorder());
         dmprofesor.setOpaque(false);
         dmprofesor.setBorder(BorderFactory.createEmptyBorder());
         dmvisitante.setOpaque(false);
         dmvisitante.setBorder(BorderFactory.createEmptyBorder());
         
         dcestudiante.setOpaque(false);
         dcestudiante.setBorder(BorderFactory.createEmptyBorder());
         dcprofesor.setOpaque(false);
         dcprofesor.setBorder(BorderFactory.createEmptyBorder());
         dcvisitante.setOpaque(false);
         dcvisitante.setBorder(BorderFactory.createEmptyBorder());
         
         
         estudiante.setOpaque(false);
         profesor.setOpaque(false);
         visitante.setOpaque(false);
         
         spots.setOpaque(false);
         spots.setBorder(BorderFactory.createEmptyBorder());
       
         Ingreso.setOpaque(false);
         Ingreso.setBorder(BorderFactory.createEmptyBorder());
         
         Salida.setOpaque(false);
         Salida.setBorder(BorderFactory.createEmptyBorder());
         
         Registro.setOpaque(false);
         Registro.setBorder(BorderFactory.createEmptyBorder());
         
         Recarga.setOpaque(false);
         Recarga.setBorder(BorderFactory.createEmptyBorder());
         
         Administrador.setOpaque(false);
         Administrador.setBorder(BorderFactory.createEmptyBorder());
         
         HAuto.setOpaque(false);
         HAuto.setBorder(BorderFactory.createEmptyBorder());
         
         HRUsuario.setOpaque(false);
         HRUsuario.setBorder(BorderFactory.createEmptyBorder());
         
         Cargar.setOpaque(false);
         Cargar.setBorder(BorderFactory.createEmptyBorder());
         
         Fecha.setOpaque(false);
         Fecha.setBorder(BorderFactory.createEmptyBorder());
         
         Parqueo.setBorder(BorderFactory.createEmptyBorder());
         Salir.setBorder(BorderFactory.createEmptyBorder());
         
         antena.setOpaque(false);
         antena.setBorder(BorderFactory.createEmptyBorder());
         
         estado.setOpaque(false);
         estado.setBorder(BorderFactory.createEmptyBorder());
         if(MySQL.verificarConexion()){
         estado.setText("Conectado");
         estado.setForeground(new java.awt.Color(0,128,0)); // verde
         }else{
         estado.setText("Desconectado");
         estado.setForeground(new java.awt.Color(255,0,0)); // rojo
}

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Administrador = new javax.swing.JButton();
        HRUsuario = new javax.swing.JButton();
        HAuto = new javax.swing.JButton();
        Recarga = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        Ingreso = new javax.swing.JButton();
        Fecha = new javax.swing.JButton();
        Cargar = new javax.swing.JButton();
        UMG = new javax.swing.JLabel();
        Parqueo = new javax.swing.JButton();
        spots = new javax.swing.JLabel();
        visitante = new javax.swing.JLabel();
        estudiante = new javax.swing.JLabel();
        profesor = new javax.swing.JLabel();
        smoto = new javax.swing.JLabel();
        dcestudiante = new javax.swing.JLabel();
        dmestudiante = new javax.swing.JLabel();
        dcprofesor = new javax.swing.JLabel();
        dmprofesor = new javax.swing.JLabel();
        scarro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dcvisitante = new javax.swing.JLabel();
        dmvisitante = new javax.swing.JLabel();
        antena = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel8.setText("CATEDRATICO");

        jLabel7.setText("CATEDRATICO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 120, 70));

        Administrador.setBackground(new java.awt.Color(0, 255, 255));
        Administrador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Administrador.setForeground(new java.awt.Color(255, 255, 255));
        Administrador.setText("Aministrador");
        Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 40));

        HRUsuario.setBackground(new java.awt.Color(0, 255, 255));
        HRUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        HRUsuario.setForeground(new java.awt.Color(255, 255, 255));
        HRUsuario.setText("<html><center>Historial de Recargas <br>Por Usuario</center></html>\n\n\n");
        jPanel1.add(HRUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 180, 50));

        HAuto.setBackground(new java.awt.Color(0, 255, 255));
        HAuto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        HAuto.setForeground(new java.awt.Color(255, 255, 255));
        HAuto.setText("<html><center>Historial por <br>Vehiculo</center></html>\n");
        jPanel1.add(HAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 150, 50));

        Recarga.setBackground(new java.awt.Color(0, 255, 255));
        Recarga.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Recarga.setForeground(new java.awt.Color(255, 255, 255));
        Recarga.setText("<html><center>Recargar<br>Saldo\n</center></html>\n");
        Recarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargaActionPerformed(evt);
            }
        });
        jPanel1.add(Recarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 127, 90));

        Registro.setBackground(new java.awt.Color(0, 255, 255));
        Registro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("<html><center>Registrara<br>Vehiculo</center></html>\n");
        jPanel1.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 126, 90));

        Salida.setBackground(new java.awt.Color(0, 255, 255));
        Salida.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Salir");
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 107, 71));

        Ingreso.setBackground(new java.awt.Color(0, 255, 255));
        Ingreso.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        Ingreso.setForeground(new java.awt.Color(255, 255, 255));
        Ingreso.setText("Ingresar");
        jPanel1.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 114, 71));

        Fecha.setBackground(new java.awt.Color(0, 255, 255));
        Fecha.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("Ajustar Fecha");
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 111, 40));

        Cargar.setBackground(new java.awt.Color(0, 255, 255));
        Cargar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Cargar.setForeground(new java.awt.Color(255, 255, 255));
        Cargar.setText("Cargar CVS");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jPanel1.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 150, 49));

        UMG.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        UMG.setForeground(new java.awt.Color(255, 255, 255));
        UMG.setText("                     UMG Mazatenango, Suchitepequez");
        jPanel1.add(UMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 392, 52));

        Parqueo.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\OneDrive\\Documentos\\JM\\ParkPlus\\parqueo.jpg")); // NOI18N
        Parqueo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Parqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParqueoActionPerformed(evt);
            }
        });
        jPanel1.add(Parqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 230, 160));

        spots.setBackground(new java.awt.Color(0, 255, 255));
        spots.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        spots.setForeground(new java.awt.Color(255, 255, 255));
        spots.setText("Lugares Disponibles");
        spots.setOpaque(true);
        jPanel1.add(spots, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 70));

        visitante.setBackground(new java.awt.Color(0, 255, 255));
        visitante.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        visitante.setForeground(new java.awt.Color(255, 0, 0));
        visitante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        visitante.setText("Visitante");
        visitante.setOpaque(true);
        jPanel1.add(visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, 50));

        estudiante.setBackground(new java.awt.Color(0, 153, 255));
        estudiante.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        estudiante.setForeground(new java.awt.Color(255, 0, 0));
        estudiante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estudiante.setText("Estudiante");
        estudiante.setOpaque(true);
        jPanel1.add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 50));

        profesor.setBackground(new java.awt.Color(255, 255, 0));
        profesor.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        profesor.setForeground(new java.awt.Color(255, 0, 0));
        profesor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profesor.setText("Maestro");
        profesor.setOpaque(true);
        jPanel1.add(profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 50));

        smoto.setBackground(new java.awt.Color(0, 255, 255));
        smoto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        smoto.setForeground(new java.awt.Color(255, 0, 0));
        smoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smoto.setText("Moto");
        smoto.setOpaque(true);
        jPanel1.add(smoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 40));

        dcestudiante.setBackground(new java.awt.Color(0, 153, 255));
        dcestudiante.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dcestudiante.setForeground(new java.awt.Color(255, 255, 255));
        dcestudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dcestudiante.setText("100/100");
        dcestudiante.setOpaque(true);
        jPanel1.add(dcestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, 50));

        dmestudiante.setBackground(new java.awt.Color(0, 153, 255));
        dmestudiante.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dmestudiante.setForeground(new java.awt.Color(255, 255, 255));
        dmestudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmestudiante.setText("100/100");
        dmestudiante.setOpaque(true);
        jPanel1.add(dmestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 50));

        dcprofesor.setBackground(new java.awt.Color(255, 255, 0));
        dcprofesor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dcprofesor.setForeground(new java.awt.Color(255, 255, 255));
        dcprofesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dcprofesor.setText("100/100");
        dcprofesor.setOpaque(true);
        jPanel1.add(dcprofesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, 50));

        dmprofesor.setBackground(new java.awt.Color(255, 255, 0));
        dmprofesor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dmprofesor.setForeground(new java.awt.Color(255, 255, 255));
        dmprofesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmprofesor.setText("100/100");
        dmprofesor.setOpaque(true);
        jPanel1.add(dmprofesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, 50));

        scarro.setBackground(new java.awt.Color(0, 255, 255));
        scarro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        scarro.setForeground(new java.awt.Color(255, 0, 0));
        scarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scarro.setText("Carro");
        scarro.setOpaque(true);
        jPanel1.add(scarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Moto");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 50));

        dcvisitante.setBackground(new java.awt.Color(0, 255, 255));
        dcvisitante.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dcvisitante.setForeground(new java.awt.Color(255, 255, 255));
        dcvisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dcvisitante.setText("100/100");
        dcvisitante.setOpaque(true);
        jPanel1.add(dcvisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 50));

        dmvisitante.setBackground(new java.awt.Color(0, 255, 255));
        dmvisitante.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dmvisitante.setForeground(new java.awt.Color(255, 255, 255));
        dmvisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmvisitante.setText("100/100");
        dmvisitante.setOpaque(true);
        jPanel1.add(dmvisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 70, 50));

        antena.setBackground(new java.awt.Color(0, 255, 255));
        antena.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\OneDrive\\Documentos\\JM\\ParkPlus\\antena.jpg")); // NOI18N
        antena.setOpaque(true);
        jPanel1.add(antena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 60, 50));

        estado.setBackground(new java.awt.Color(0, 255, 255));
        estado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setOpaque(true);
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParqueoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParqueoActionPerformed

    private void RecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecargaActionPerformed

    private void AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministradorActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       
        MySQL.Cerrar();
        System.exit(0);
       
    }//GEN-LAST:event_SalirActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        CargarCVS.Cargar(this);
    }//GEN-LAST:event_CargarActionPerformed
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administrador;
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Fecha;
    private javax.swing.JButton HAuto;
    private javax.swing.JButton HRUsuario;
    private javax.swing.JButton Ingreso;
    private javax.swing.JButton Parqueo;
    private javax.swing.JButton Recarga;
    private javax.swing.JButton Registro;
    private javax.swing.JButton Salida;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel UMG;
    private javax.swing.JLabel antena;
    private javax.swing.JLabel dcestudiante;
    private javax.swing.JLabel dcprofesor;
    private javax.swing.JLabel dcvisitante;
    private javax.swing.JLabel dmestudiante;
    private javax.swing.JLabel dmprofesor;
    private javax.swing.JLabel dmvisitante;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel estudiante;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel profesor;
    private javax.swing.JLabel scarro;
    private javax.swing.JLabel smoto;
    private javax.swing.JLabel spots;
    private javax.swing.JLabel visitante;
    // End of variables declaration//GEN-END:variables
}
