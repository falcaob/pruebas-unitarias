package gestion;

import java.util.ArrayList;

/**
 * Clase que se encarga de controlar las peliculas que inlucluyen y eliminan los
 * espectadores del cine.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */

public class MiCine {

	/**
	 * Propiedas que representa el nombre del cine.
	 * 
	 */

	public String nombre;

	/**
	 * Lista de peliculas del cine. {@link Pelicula}
	 */
	public ArrayList<Pelicula> peliculas;
	/**
	 * Listas de espectadores del cine. {@link Pelicula}
	 */
	public ArrayList<Espectador> espectadores;

	/**
	 * Contructor de la clase MiCine
	 * 
	 * @param nombre El nombre del cine.
	 */

	public MiCine(String nombre) {
		this.nombre = nombre;
		peliculas = new ArrayList<Pelicula>();
		espectadores = new ArrayList<Espectador>();
	}

	/**
	 * Métodos getter para obtener el nombre del cine.
	 * 
	 * @return El nombre del cine.
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * Método getter para obtener la lista de peliculas del cine.
	 * 
	 * @return La lista de películas del cine.
	 */

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	/**
	 * Método getter para obtener la lista de espectadores del cine.
	 * 
	 * @return La lista de espectadores del cine.
	 */
	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	/**
	 * Método para añadir una pelicula a la lista del cine.
	 * 
	 * @param p1 La pelicula que se va a incluir..
	 */
	public void incluirPelicula(Pelicula p1) {
		this.peliculas.add(p1);
	}

	/**
	 * Método para eliminar una pelicula de la lista del cine.
	 * 
	 * @param p1 La pelicula que se va a eliminar.
	 */
	public void eliminarPelicula(Pelicula p1) {
		this.peliculas.remove(p1);
	}

	/**
	 * Método para incluir un espectador a la lista del cine.
	 * 
	 * @param e1 El ecpectador que se va a incluir.
	 */
	public void incluirEspectador(Espectador e1) {
		this.espectadores.add(e1);
	}

	/**
	 * Método para eliminar un espectador de la lista del cine.
	 * 
	 * @param e1 El espectador que se va a eliminar.
	 */
	public void eliminarEspectador(Espectador e1) {
		this.espectadores.remove(e1);
	}

	// Vídeo12
	
	/**
	 * Método para registrar la salida de una película para un espectador dado.
	 * 
	 * @param p1 La película que se va a registrar para la salida.
	 * @param e1 El espectador que va a ver la película.
	 * @return Verdadero si la salida se registró con éxito, falso en caso contrario.
	 */
	public boolean checkOut(Pelicula p1, Espectador e1) {
		
		// número de peliculas verificados para el espectador 1
		int peliculasOut = this.obtenerPeliculasParaEspectador(e1).size();
		
		if ((p1.getEspectador() == null) && (peliculasOut < e1.getMaximoPeliculas())) {
			p1.setEspectador(e1);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método para registrar la devolución de una película.
	 * 
	 * @param p1 La película que se va a devolver.
	 * @return Verdadero si la devolución se registró con éxito, falso si la película no tenía espectador.
	 */
	public boolean checkIn(Pelicula p1) {
		if (p1.getEspectador() != null) {
			p1.setEspectador(null);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método para obtener todas las películas asociadas a un espectador dado.
	 * 
	 * @param e1 El espectador del que se desean obtener las películas.
	 * @return Una lista de películas asociadas al espectador dado.
	 */
	public ArrayList<Pelicula> obtenerPeliculasParaEspectador(Espectador e1) {
		ArrayList<Pelicula> resultado = new ArrayList<Pelicula>();
		for (Pelicula aPelicula : this.getPeliculas()) {
			if ((aPelicula.getEspectador() != null) && 
					(aPelicula.getEspectador().getNombre().equals(e1.getNombre())))

			// if(aPelicula.getEspectador().getNombre().equals(e1.getNombre()))

			{
				resultado.add(aPelicula);
			}
		}

		return resultado;
	}

}
