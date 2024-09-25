package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Parcial1 {
    public static void main(String[] args) {

        // creación de gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech", LocalDate.now());

        //creación entrenador
        Miembro miembro1 = new Miembro("Carlos", 17, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Mario", 18, "Masculino", "1235", Membresia.ANUAL);

        //creación miembros
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", 311434446, "jorge@gmail.com");
        Entrenador entrenador2 = new Entrenador("Fernando", "Entrenamiento Funcional", 1234,
                "fernando@gimnasio.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);
        gimnasio.agregarEntrenador(entrenador2);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        Gimnasio.mostrarMensaje(gimnasio.toString());

        // --------------------Solución parcial 1------------------------
        // Punto A
        int contar = gimnasio.contarMiembrosMembresiaAnualMayoresEdad();
        Gimnasio.mostrarMensaje("\nLa cantidad de miembros con membresía anual que son mayores de edad es: "
                + contar);

        // Punto B
        LinkedList<Entrenador> entrenadorTelefono = gimnasio.agregarEntrenadorConSumaTelefono();
        Gimnasio.mostrarMensaje("\nLos entrenadores con la suma de 30 en su telefono son:");
        for (Entrenador entrenador3 : entrenadorTelefono) {
            Gimnasio.mostrarMensaje(entrenador3.getNombre());
        }

        // Punto C
        gimnasio.invertirNombresMenoresEdad();
        Gimnasio.mostrarMensaje("\nNombres invertidos (para menores de edad) son: ");
        for (Miembro miembro : gimnasio.getMiembros()) {
            Gimnasio.mostrarMensaje(miembro.getNombre());
        }

        // --------------------Solución parcial 1------------------------       
        
    }
}