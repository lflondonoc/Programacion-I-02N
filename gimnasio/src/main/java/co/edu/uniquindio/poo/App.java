package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        // creación de gimnasio
        Gimnasio gimnasio = new Gimnasio("Smarfit", LocalDate.now());

        //creación entrenador
        Entrenador entrenador = new Entrenador("Juan", "aerobicos", "123", "juan@gmail.com");

        //creación miembros
        Miembro miembro = new Miembro("Juliana", 20, "femenina", TipoMembresia.MENSUAL, entrenador);

        //agregar entrenador al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        //agregar miembro al gimnasio
        gimnasio.agregarMiembro(miembro);

        Gimnasio.mostrarMensaje(gimnasio.toString());

    }
}
