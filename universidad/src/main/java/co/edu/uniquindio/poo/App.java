package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

    Estudiante estudiante= new Estudiante("12345", "Camilo", "Zuñiga", "cz@gmail.com", "32000000", 20);

    Estudiante estudiante1 = new Estudiante("4567", "Camila", "Lopez", "cl@gmail.com", "3100000", 18);

    Estudiante.mostrarMensaje(estudiante.toString());

    }
}
