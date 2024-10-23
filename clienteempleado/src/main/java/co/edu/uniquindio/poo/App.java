package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        var cliente= new Cliente(null, null, null, null);
        cliente.comprar();
    
        var empleado= new Empleado(null, null, null, null, null);
        empleado.hacerTarea();

        var clienteEmpleado = new ClienteEmpleado(null, null, null, null);
        clienteEmpleado.hacerTarea();
        clienteEmpleado.comprar();

    }
}
