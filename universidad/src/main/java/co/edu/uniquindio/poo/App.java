package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

    Estudiante estudiante= new Estudiante("12345", "Camilo", "Zuñiga", "cz@gmail.com", "32000000", 20, 3.0,2.5,4.0,2.2,4.4);

    
    Estudiante.mostrarMensaje(estudiante.toString());

    estudiante.setNombres("Ana");
    Estudiante.mostrarMensaje(estudiante.getNombres());
    Estudiante.mostrarMensaje(estudiante.toString());

    estudiante.setNumeroIdentificacion("00000");
    Estudiante.mostrarMensaje(estudiante.toString());


    }
}
