package gestion;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MiCineTest extends TestCase {

	private Pelicula p1;
	private Pelicula p2;
	private Espectador e1;
	private Espectador e2;
	private MiCine c1;

	public void testMiCine() {
		MiCine c1 = new MiCine("Test");

		assertEquals("Test", c1.nombre);

		assertTrue(c1.peliculas instanceof ArrayList);
		assertTrue(c1.espectadores instanceof ArrayList);
	}

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

	private void incluirElementos() {
		c1.incluirPelicula(p1);
		c1.incluirPelicula(p2);
		c1.incluirEspectador(e1);
		c1.incluirEspectador(e2);
	}

	public void testObtenerPeliculasParaEspectador() {
		setup();
		incluirElementos();
		
		c1.checkOut(p1, e1); //checkout primera pelicula
		ArrayList<Pelicula> testPeliculas = c1.obtenerPeliculasParaEspectador(e1);
		assertEquals(1, testPeliculas.size());
		assertEquals(0, testPeliculas.indexOf(p1));
		
		c1.checkOut(p2, e1); //checkout segunda pelicula
		testPeliculas = c1.obtenerPeliculasParaEspectador(e1);
		assertEquals(2, testPeliculas.size());
		assertEquals(1, testPeliculas.indexOf(p1));
		
	}

}
