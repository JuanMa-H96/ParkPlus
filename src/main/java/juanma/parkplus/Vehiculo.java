package juanma.parkplus;

public class Vehiculo {
    private String placa;
    private String tipoVehiculo;
    private String tipoArea;

    public Vehiculo(String placa,String tipoVehiculo,String tipoArea){
        this.placa=placa;
        this.tipoVehiculo=tipoVehiculo;
        this.tipoArea=tipoArea;
    }


    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    
    public void setPlaca(String placa) {
        this.placa=placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo=tipoVehiculo;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea=tipoArea;
    }
}
