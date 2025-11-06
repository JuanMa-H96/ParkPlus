
package juanma.parkplus;


public class Usuario {
    
    public int Id;
    public String Nombre;
    public String Tipo;

    public Usuario(int Id, String Nombre, String Tipo) {
        this.Id = Id;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
