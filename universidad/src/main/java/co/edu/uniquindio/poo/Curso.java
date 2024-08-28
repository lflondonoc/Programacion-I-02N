package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private LinkedList<Estudiante> estudiantes;

    public Curso(String nombre, Profesor profesor){
        this.nombre= nombre;
        this.profesor= profesor;
        estudiantes= new LinkedList<>();
        
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El nombre del curso es " + nombre + " el profesor que lo dicta es "+profesor+" y los esudiantes que están registrados son: \n\n" + estudiantes;
    }

    public void agregarEstudiante (Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
