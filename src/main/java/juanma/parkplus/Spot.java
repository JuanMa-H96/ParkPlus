package juanma.parkplus;

public class Spot {
    private String spotId;
    private String areaId;
    private String tipoVehiculo;
    private String status;

    public Spot(String spotId,String areaId,String tipoVehiculo,String status){
        this.spotId=spotId;
        this.areaId=areaId;
        this.tipoVehiculo=tipoVehiculo;
        this.status=status;
    }


    public String getSpotId() {
        return spotId;
    }

    public String getAreaId() {
        return areaId;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getStatus() {
        return status;
    }

    
    public void setSpotId(String spotId) {
        this.spotId=spotId;
    }

    public void setAreaId(String areaId) {
        this.areaId=areaId;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo=tipoVehiculo;
    }

    public void setStatus(String status) {
        this.status=status;
    }
}
