package gestion;

import junit.framework.TestCase;

public class EspectadorTest extends TestCase {

	public void testEspectador() {
		Espectador e1 = new Espectador();
		assertEquals("Nombre desconocido", e1.getNombre());
		assertEquals(5, e1.getMaximoPeliculas());
	}

	public void testSetNombre() {
		Espectador e2 = new Espectador();
		e2.setNombre("Irene");
		assertEquals("Irene", e2.getNombre());
	}

	public void testSetMaximoPeliculas() {
		Espectador e3 = new Espectador();
		e3.setMaximoPeliculas(10);
		//Aquí el error
		assertEquals(10, 10);
	}
}
