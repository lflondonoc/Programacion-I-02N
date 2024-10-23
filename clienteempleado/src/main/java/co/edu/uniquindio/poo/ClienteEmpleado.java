package co.edu.uniquindio.poo;

public class ClienteEmpleado extends Cliente implements IEmpleado, ICliente {

    public ClienteEmpleado(String nombre, String cedula, String correo, String telefono){
        super(nombre, cedula, correo, telefono);
        
    }

    

    @Override
    public void comprar() {
        System.out.println(nombre+" Compra una botella de agua ");
    }



    @Override
    public void hacerTarea() {
        System.out.println(nombre+" Recoge la basura ");
        
    }
    
}
