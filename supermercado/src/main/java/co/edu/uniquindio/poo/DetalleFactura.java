package co.edu.uniquindio.poo;

public class DetalleFactura {
    private int cantidad;
    private double subtotal;
    Producto producto;
    
    public DetalleFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal(producto);
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    @Override
    public String toString() {
        return "DetalleFactura: " + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + "]";
    }

    public double calcularSubtotal (Producto producto){
        return cantidad* producto.getPrecioUnitario();
    }

    
}
