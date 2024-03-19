package gestion;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 * Clase de pruebas unitarias para la clase MiCine.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class MiCineTest extends TestCase {

	private Pelicula p1;
	private Pelicula p2;
	private Espectador e1;
	private Espectador e2;
	private MiCine c1;

	/**
     * Prueba el constructor de la clase MiCine.
     * Verifica que se inicialice correctamente el nombre del cine y que las listas de pelculas y espectadores sean instancias de ArrayList.
     */
	public void testMiCine() {
		MiCine c1 = new MiCine("Test");

		assertEquals("Test", c1.nombre);

		assertTrue(c1.peliculas instanceof ArrayList);
		assertTrue(c1.espectadores instanceof ArrayList);
	}
	
	/**
     * Configuracion inicial de los objetos para las pruebas.
     */
	public void setup() {
		// creación de objetos
		p1 = new Pelicula("Pelicula1");
		p2 = new Pelicula("Pelicula2");

		e1 = new Espectador();
		e2 = new Espectador();
		e1.setNombre("Luke");
		e2.setNombre("Leia");

		c1 = new MiCine("Test");
	}
	
	/**
     * Prueba el metodo incluirPelicula de la clase MiCine.
     * Verifica que se incluyen y eliminen correctamente peliculas de la lista de peliculas del cine.
     */
	public void testInlucirPelicula() {
		// creación de los objetos de test
		setup();

		// test inicial de tamaño 0
		assertEquals(0, c1.getPeliculas().size());

		c1.incluirPelicula(p1);
		c1.incluirPelicula(p2);

		assertEquals(2, c1.getPeliculas().size());
		assertEquals(0, c1.getPeliculas().indexOf(p1));
		assertEquals(1, c1.getPeliculas().indexOf(p2));

		c1.eliminarPelicula(p1);
		assertEquals(1, c1.getPeliculas().size());
		assertEquals(0, c1.getPeliculas().indexOf(p2));

		c1.eliminarPelicula(p2);
		assertEquals(0, c1.getPeliculas().size());

	}

	// Vídeo12
	// método de verificación
	/**
     * Prueba el metodo checkOut de la clase MiCine.
     * Verifica que se realice correctamente el proceso de salida de una pelicula para un espectador.
     */
	public void testCheckOut() {
		// configuración de objetos
		setup();

		incluirElementos();

		assertTrue("La pelicula no fue verificada correctamente", c1.checkOut(p1, e1));

		assertEquals("Luke", p1.getEspectador().getNombre());

		assertFalse("La pelicula ha sido verificada", c1.checkOut(p1, e2));

		assertTrue("La pelicula no se ha registrado", c1.checkIn(p1));

		assertFalse("La pelicula ha sido registrada", c1.checkIn(p1));

		assertFalse("La pelicula nunca ha sido registrada", c1.checkIn(p2));

		// Vídeo13
		// test adicionales
		setup();
		e1.getMaximoPeliculas();
		// Refactor > Extract Method
		incluirElementos();

		assertTrue("Primera pelicula no verificada", c1.checkOut(p2, e1));

		assertFalse("Segunda pelicula no debería tener verificación", c1.checkOut(p1, e1));

	}
	
	/**
	 * Metodo extraido del metodo anterior que une todos los items que vamos a utilizar.
	 */
	private void incluirElementos() {
		c1.incluirPelicula(p1);
		c1.incluirPelicula(p2);
		c1.incluirEspectador(e1);
		c1.incluirEspectador(e2);
	}
	
	/**
     * Prueba el metodo obtenerPeliculasParaEspectador de la clase MiCine.
     * Verifica que se obtengan correctamente todas las peliculas asociadas a un espectador.
     */
	public void testObtenerPeliculasParaEspectador() {
		setup();
		incluirElementos();
		assertEquals(0, c1.obtenerPeliculasParaEspectador(e1).size());
		
		c1.checkOut(p1, e1); //checkout primera pelicula
		
		ArrayList<Pelicula> testPeliculas = c1.obtenerPeliculasParaEspectador(e1);
		assertEquals(1, testPeliculas.size());
		assertEquals(0, testPeliculas.indexOf(p1));
		
		c1.checkOut(p2, e1); //checkout segunda pelicula
		testPeliculas = c1.obtenerPeliculasParaEspectador(e1);
		assertEquals(2, testPeliculas.size());
		assertEquals(1, testPeliculas.indexOf(p2));
	}

	//Video15
	/**
	 * Prueba del método obtenerPeliculasDisponibles de la clase MiCine.
	 * Verifica que se obtengan correctamente las películas disponibles en el cine.
	 */
	public void testObtenerPeliculasDisponibles() {
		setup();
		incluirElementos();
		ArrayList<Pelicula> testPeliculas = c1.obtenerPeliculasDisponibles();
		assertEquals(2, testPeliculas.size());
		assertEquals(1, testPeliculas.indexOf(p2));
		
		c1.checkOut(p1, e1);
		testPeliculas = c1.obtenerPeliculasDisponibles();
		assertEquals(1, testPeliculas.size());
		assertEquals(0, testPeliculas.indexOf(p2));
		
		c1.checkOut(p2, e1);
		testPeliculas = c1.obtenerPeliculasDisponibles();
		assertEquals(0, testPeliculas.size());
	}
	
	/**
	 * Prueba del método obtenerPeliculasNoDisponibles de la clase MiCine.
	 * Verifica que se obtengan correctamente las películas no disponibles en el cine.
	 */
	public void testObtenerPeliculasNoDisponibles() {
		setup();
		incluirElementos();
		assertEquals(0, c1.obtenerPeliculasNoDisponibles().size());
		
		c1.checkOut(p1, e1); //checkout primera pelicula
		ArrayList<Pelicula> testPeliculas = c1.obtenerPeliculasNoDisponibles();
		assertEquals(1, testPeliculas.size());
		assertEquals(0, testPeliculas.indexOf(p1));
		
		c1.checkOut(p2, e1); //checkout segunda pelicula
		testPeliculas = c1.obtenerPeliculasNoDisponibles();
		assertEquals(2, testPeliculas.size());
		assertEquals(1, testPeliculas.indexOf(p2));
	}
	
	/**
	 * Prueba del método toString de la clase MiCine.
	 * Verifica que se devuelva correctamente una representación en cadena del cine, 
	 * mostrando su nombre, el número de películas y el número de espectadores.
	 */
	public void testTostring() {
		setup();
		incluirElementos();
		
		assertEquals("Test: 2 películas; 2 espectadores",
				c1.toString());
	}
}
