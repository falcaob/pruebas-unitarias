package gestion;

public class Pelicula {
	
	//Propiedades
	public String titulo;
	public String director;
	
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
		// TODO Auto-generated method stub
		
	}

	public Espectador getEspectador() {
		// TODO Auto-generated method stub
		return null;
	}


}
