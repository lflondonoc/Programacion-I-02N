package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private String id;
    private int stock;
    private double precioUnitario;
    
    public Producto(String nombre, String id, int stock, double precioUnitario) {
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto:" + nombre + ", id=" + id + ", stock=" + stock + ", precioUnitario=" + precioUnitario;
    }

    
}
