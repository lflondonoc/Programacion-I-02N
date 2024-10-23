package co.edu.uniquindio.poo;

public class Cliente extends Persona implements ICliente{

    @Override
    public void comprar() {
        System.out.println(nombre+ " Esta comprando ");
        
    }

    public Cliente(String nombre, String cedula, String correo, String telefono){
        super(nombre,cedula,correo,telefono);
        
    }

    @Override
    public String toString() {
        return "Cliente: "+super.toString();
    }
    
}
