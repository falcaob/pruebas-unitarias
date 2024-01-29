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
		p1 = new Pelicula("Pelicula1"); 
		p2 = new Pelicula("Pelicula2"); 
		
		e1 = new Espectador(); 
		e2 = new Espectador();
		e1.setNombre("Luke");
		e2.setNombre("Leia");
		
		c1 = new MiCine("Test");
	}
	
	public void testInlucirPelicula() {
		//creación de los objetos de test
		setup();
		
		//test inicial de tamaño 0
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

}
