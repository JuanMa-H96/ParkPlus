
package juanma.parkplus;

public class Vehiculo {
public int Id_Usuario;
    public String Tipo;
    public String Placa;
    public String Marca;
    public String Modelo;
    public String Color;
    public int año;
    
    public Vehiculo(int Id_Usuario, String Tipo, String Placa, String Marca, String Modelo, String Color, int año){
        this.Id_Usuario=Id_Usuario;
        this.Tipo=Tipo;
        this.Placa=Placa;
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Color=Color;
        this.año=año;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }
    public String getTipo(){
        return Tipo;
    }
    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    public int getAño() {
        return año;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}