package juanma.parkplus;

import java.time.LocalDateTime;

public class Historico {
    private String ticketId;
    private String placa;
    private String areaId;
    private String spotId;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;
    private String modo;
    private double monto;

    public Historico(String ticketId,String placa,String areaId,String spotId,
                     LocalDateTime fechaIngreso,LocalDateTime fechaSalida,
                     String modo,double monto){
        this.ticketId=ticketId;
        this.placa=placa;
        this.areaId=areaId;
        this.spotId=spotId;
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.modo=modo;
        this.monto=monto;
    }

   
    public String getTicketId() {
        return ticketId;
    }

    public String getPlaca() {
        return placa;
    }

    public String getAreaId() {
        return areaId;
    }

    public String getSpotId() {
        return spotId;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public String getModo() {
        return modo;
    }

    public double getMonto() {
        return monto;
    }

    
    public void setTicketId(String ticketId) {
        this.ticketId=ticketId;
    }

    public void setPlaca(String placa) {
        this.placa=placa;
    }

    public void setAreaId(String areaId) {
        this.areaId=areaId;
    }

    public void setSpotId(String spotId) {
        this.spotId=spotId;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso=fechaIngreso;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida=fechaSalida;
    }

    public void setModo(String modo) {
        this.modo=modo;
    }

    public void setMonto(double monto) {
        this.monto=monto;
    }
}
