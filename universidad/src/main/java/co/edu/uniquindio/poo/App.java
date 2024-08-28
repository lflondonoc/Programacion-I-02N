package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

    Estudiante estudiante1= new Estudiante("12345", "Camilo", "Zuñiga", "cz@gmail.com", "32000000", 20, 3.0,2.5,4.0,2.2,4.4);

    Estudiante estudiante2= new Estudiante("5678", "Juan", "Lopez", "jl@gmail.com", "32000000", 20, 3.0,2.5,4.0,1.0,4.4);

    Estudiante estudiante3= new Estudiante("000", "Sara", "Zuñiga", "sz@gmail.com", "32000000", 20, 3.0,2.5,4.0,2.9,4.4);

    Profesor profesor= new Profesor("Luisa Fernanda", "0088768");

    Curso curso = new Curso("Programación 1", profesor);

    curso.agregarEstudiante(estudiante1);
    curso.agregarEstudiante(estudiante2);
    curso.agregarEstudiante(estudiante3);

    Curso.mostrarMensaje(curso.toString());


    }
}
