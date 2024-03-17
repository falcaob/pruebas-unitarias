package gestion;

import junit.framework.TestCase;

/**
 * Clase de pruebas unitarias para la clase Pelicula.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class PeliculaTest extends TestCase {
	
	/**
     * Prueba el constructor de la clase Pelicula.
     * Verifica que se inicialice correctamente el titulo de la pelicula y el director.
     */
	public void testPelicula() {
		Pelicula p1 = new Pelicula("Star Wars Episodio I");
		assertEquals("Star Wars Episodio I", p1.titulo);
		assertEquals("Director desconocido", p1.director);
	}
	
	/**
     * Prueba el metodo getEspectador de la clase Pelicula.
     * Verifica que se obtenga correctamente el nombre del espectador asociado a la pelicula.
     */
	public void testGetEspectador() {
		Pelicula p2 = new Pelicula("Star Wars Episodio II");
		Espectador e2 = new Espectador();
		e2.setNombre("Anakin");
		
		//Método para decir que este esta pelicula la ha visto esta persona
		p2.setEspectador(e2);
		
		//Obtener el nombre de la persona que ha visto la pelicula
		//Espectador testEspectador = p2.getEspectador();
		//String testNombre = testEspectador.getNombre();
		String testNombre = p2.getEspectador().getNombre();
		assertEquals("Anakin", testNombre);
	}
	
}
