package gestion;

import java.util.ArrayList;

/**
 * Clase que se encarga de controlar las peliculas que añaden y eliminar los
 * usuarios
 * 
 * @author Irene
 * @version 17 06/03/2024
 */

public class MiCine {

	/**
	 * Propiedades de la clase MiCine
	 * 
	 */

	public String nombre;

	/**
	 * Array que hace referencia a la clase Pelicula {@link Pelicula}
	 */
	public ArrayList<Pelicula> peliculas;
	public ArrayList<Espectador> espectadores;

	/**
	 * Contructor de la clase MiCine
	 * 
	 * @param nombre
	 */

	public MiCine(String nombre) {
		this.nombre = nombre;
		peliculas = new ArrayList<Pelicula>();
		espectadores = new ArrayList<Espectador>();
	}

	/**
	 * Métodos Getters y Setters
	 * 
	 * @return
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * Listas de peliculas y usuarios
	 * 
	 * @return
	 */

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	/**
	 * Método parañadir una peliculas
	 * 
	 * @param p1
	 */
	public void incluirPelicula(Pelicula p1) {
		this.peliculas.add(p1);
	}

	/**
	 * Método para eliminar peliculas
	 * 
	 * @param p1
	 */
	public void eliminarPelicula(Pelicula p1) {
		this.peliculas.remove(p1);
	}

	/**
	 * Método para añadir un espectador
	 * 
	 * @param e1
	 */
	public void incluirEspectador(Espectador e1) {
		this.espectadores.add(e1);
	}

	/**
	 * Método para eliminar un espectador
	 * 
	 * @param e1
	 */
	public void eliminarEspectador(Espectador e1) {
		this.espectadores.remove(e1);
	}

	// Vídeo12
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

	public boolean checkIn(Pelicula p1) {
		if (p1.getEspectador() != null) {
			p1.setEspectador(null);
			return true;
		} else {
			return false;
		}
	}

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
