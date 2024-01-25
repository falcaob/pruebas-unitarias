package gestion;

import junit.framework.TestCase;

public class PeliculaTest extends TestCase {
	
	public void testPelicula() {
		Pelicula p1 = new Pelicula("Star Wars Episodio I");
		assertEquals("Star Wars Episodio I", p1.titulo);
		assertEquals("Director desconocido", p1.director);
	}
	
	public void testGetEspectador() {
		Pelicula p2 = new Pelicula("Star Wars Episodio II");
		Espectador e2 = new Espectador();
		e2.setNombre("Anakin");
		
		//Método para decir que este esta pelicula la ha visto esta persona
		p2.setEspectador(e2);
		
		//Obtener el nombre de la persona que ha visto la pelicula
		Espectador testEspectador = p2.getEspectador();
		String testNombre = testEspectador.getNombre();
		
		assertEquals("Anakin", testNombre);
	}
	
}
