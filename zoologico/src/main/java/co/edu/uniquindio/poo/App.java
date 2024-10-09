package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //Creando un perro y un gato
        Perro perro= new Perro("Milú", 12, 10.5);
        Gato gato= new Gato("Mia", 5, 3);

        boolean menu= true;
        while (menu) {
            Animal.mostrarMensaje("Bienvenidos: \n");
            int animalSeleccionado= Animal.ingresarEntero("Seleccione una mascota: \n1.Perro \n2.Gato \n3.Salir del programa. \n");

            switch (animalSeleccionado) {
                case 1:
                    Animal.mostrarMensaje("Ha seleccionado el perro de nombre "+perro.getNombre());
                    mostrarMenu(perro);
                    break;
                case 2:
                    Animal.mostrarMensaje("Ha seleccionado el gato de nombre "+gato.getNombre());
                    mostrarMenu(gato);
                    break;
                case 3:
                    menu=false;
                    Animal.mostrarMensaje("Saliendo del programa.....");
                    break;
                default:
                    Animal.mostrarMensaje("Error, opción no válida.");
                    break;
            }
            Animal.mostrarMensaje("--------------------------");
        }
    }
    public static void mostrarMenu(Animal animal){
        
        boolean continuarMenu= true;
        while(continuarMenu){
            int opciones= Animal.ingresarEntero("\nIndique una opción para"+animal.getNombre()+"\n1.Dormir \n2.Hacer sonido \n3.Comer \n4.Volver al menú principal.\n");

            switch (opciones) {
                case 1: 
                    animal.dormir();                    
                    break;
                case 2:
                    animal.hacerSonido();
                    break;
                case 3:
                    animal.comer();
                    break;
                case 4:
                    continuarMenu= false;
                    Animal.mostrarMensaje("Volviendo al menú principal....");
                    break;
                default:
                    Animal.mostrarMensaje("Error, opción no válida.");
                    break;
            }
       }
}
}
