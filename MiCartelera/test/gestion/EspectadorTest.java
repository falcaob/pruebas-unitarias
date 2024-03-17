package gestion;

import junit.framework.TestCase;

/**
 * Clase de pruebas unitarias para la clase Espectador.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class EspectadorTest extends TestCase {

    /**
     * Prueba el constructor de la clase Espectador.
     * Verifica que se inicialice correctamente el nombre y el maximo de peliculas.
     */
    public void testEspectador() {
        Espectador e1 = new Espectador();
        assertEquals("Nombre desconocido", e1.getNombre());
        assertEquals(5, e1.getMaximoPeliculas());
    }

    /**
     * Prueba el metodo setNombre de la clase Espectador.
     * Verifica que se establezca correctamente el nombre del espectador.
     */
    public void testSetNombre() {
        Espectador e2 = new Espectador();
        e2.setNombre("Irene");
        assertEquals("Irene", e2.getNombre());
    }

    /**
     * Prueba el metodo setMaximoPeliculas de la clase Espectador.
     * Verifica que se establezca correctamente el maximo de peliculas que puede ver el espectador.
     */
    public void testSetMaximoPeliculas() {
        Espectador e3 = new Espectador();
        e3.setMaximoPeliculas(10);
        assertEquals(10, e3.getMaximoPeliculas());
    }
    
    // Nuevo método
    
    /**
     * Prueba el metodo toString de la clase Espectador.
     * Verifica que se devuelva correctamente una representacion en cadena de los datos del espectador.
     */
    public void testToString() {
        Espectador e4 = new Espectador();
        e4.setNombre("Irene Falcao");
        e4.setMaximoPeliculas(9);
        String testString = "Irene Falcao (9 peliculas)";
        assertEquals(testString, e4.toString());
    }
}
