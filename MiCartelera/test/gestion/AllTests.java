package gestion;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Clase que contiene todos los casos de prueba para ejecutar en conjunto.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class AllTests {

    /**
     * Método para crear un conjunto de pruebas que incluya todos los casos de prueba.
     * 
     * @return Una suite que contiene todos los casos de prueba.
     */
    public static Test suite() {
        TestSuite suite = new TestSuite(AllTests.class.getName());
        //$JUnit-BEGIN$
        suite.addTestSuite(EspectadorTest.class);
        suite.addTestSuite(PeliculaTest.class);
        suite.addTestSuite(MiCineTest.class);
        //$JUnit-END$
        return suite;
    }

}
