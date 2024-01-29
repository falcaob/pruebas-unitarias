package gestion;

import java.util.ArrayList;

public class MiCine {
	
	String nombre;
	ArrayList <Pelicula> peliculas;
	ArrayList <Espectador>espectadores;

	public MiCine(String nombre) {
		this.nombre = nombre;
		peliculas = new ArrayList<Pelicula>();
		espectadores = new ArrayList<Espectador>();
	}
	
	//Métodos Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	
	//Métodos para añadir y eliminar peliculas y espectadores
	public void incluirPelicula(Pelicula p1) {
		this.peliculas.add(p1);
	}

	public void eliminarPelicula(Pelicula p1) {
		this.peliculas.remove(p1);
	}
	
	public void incluirEspectador(Espectador e1) {
		this.espectadores.add(e1);
	}
	
	public void eliminarEspectador(Espectador e1) {
		this.espectadores.remove(e1);
	}

}
