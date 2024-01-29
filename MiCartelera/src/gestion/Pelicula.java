package gestion;

public class Pelicula {
	
	//Propiedades
	String titulo;
	String director;
	Espectador espectador;
	
	//Constructor
	public Pelicula(String string) {
		this.titulo = string;
		this.director = "Director desconocido";
	}
	
	//Métodos Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setEspectador(Espectador e2) {
		this.espectador = e2;
		
	}

	public Espectador getEspectador() {
		return this.espectador;
	}

}
