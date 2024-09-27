package co.edu.uniquindio.poo;


public class Supermercado {
    private String nombre;
    private String id;
    private String direccion;
    
    public Supermercado(String nombre, String id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Supermercado: " + nombre + ", id=" + id + ", direccion=" + direccion + "]";
    }

    

}
