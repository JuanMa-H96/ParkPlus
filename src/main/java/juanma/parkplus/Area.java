package juanma.parkplus;

public class Area {
    private String areaId;
    private String nombre;
    private int capacidad;
    private String tipoVehiculo;

    public Area(String areaId,String nombre,int capacidad,String tipoVehiculo){
        this.areaId=areaId;
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.tipoVehiculo=tipoVehiculo;
    }


    public String getAreaId() {
        return areaId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

   
    public void setAreaId(String areaId) {
        this.areaId=areaId;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo=tipoVehiculo;
    }
}
