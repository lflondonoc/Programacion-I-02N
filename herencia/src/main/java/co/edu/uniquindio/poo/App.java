package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Juan", "123", "30", "juan@gmail.com");

        Empleado empleado= new Empleado("Luis", "456", "28", 0);


        Persona.mostrarMensaje(cliente.toString());
        Persona.mostrarMensaje(empleado.toString());
    }
}
