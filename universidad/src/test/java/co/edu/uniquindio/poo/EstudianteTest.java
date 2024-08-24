/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Estudiante(" ", " ", " ", " ", " ", 0, 0, 0, 0, 0, 0));

        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void edadNegativa() {
        LOG.info("Iniciando test edadNegativa");

        assertThrows(Throwable.class, ()->new Estudiante("12345", "Camilo", "Zuñiga", "cz@gmail.com", "32000000", -20, 3.0,2.5,4.0,2.2,4.4));

        LOG.info("Finalizando test edadNegativa");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Estudiante("12345", "Camilo", "Zuñiga", "cz", "32000000", 20, 3.0,2.5,4.0,2.2,4.4));

        LOG.info("Finalizando test validacionCorreo");
    }
}
