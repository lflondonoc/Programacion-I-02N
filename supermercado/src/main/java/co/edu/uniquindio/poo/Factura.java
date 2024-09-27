package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Factura {
    private String id;
    private String fecha;
    private double total;
    LinkedList<DetalleFactura> detalleFacturas;

    public Factura(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        detalleFacturas= new LinkedList<>();
        this.total = calcularTotal();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LinkedList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }
    public void setDetalleFacturas(LinkedList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Factura: " + id + ", fecha=" + fecha + ", total=" + total;
    }
    public double calcularTotal(){
        double total=0;
        for (DetalleFactura detalleFactura: detalleFacturas){
            total += detalleFactura.getSubtotal();
        }
        return total;
    }
}
