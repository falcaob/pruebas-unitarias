package gestion;

/**
 * Clase que representa una película.
 * Contiene información sobre el título, director y espectador asociado.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class Pelicula {
    
    // Propiedades
    
    /** Título de la película. */
    String titulo;
    
    /** Director de la película. */
    String director;
    
    /** Espectador asociado a la película. */
    Espectador espectador;
    
    // Constructor
    
    /**
     * Constructor de la clase Pelicula.
     * Inicializa el título de la película y asigna un director predeterminado.
     * 
     * @param titulo El título de la película.
     */
    public Pelicula(String titulo) {
        this.titulo = titulo;
        this.director = "Director desconocido";
    }
    
    // Métodos Getters y Setters
    
    /**
     * Obtiene el título de la película.
     * 
     * @return El título de la película.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la película.
     * 
     * @param titulo El nuevo título de la película.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el director de la película.
     * 
     * @return El director de la película.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el director de la película.
     * 
     * @param director El nuevo director de la película.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Establece el espectador asociado a la película.
     * 
     * @param e2 El espectador que se asociará a la película.
     */
    public void setEspectador(Espectador e2) {
        this.espectador = e2;
    }

    /**
     * Obtiene el espectador asociado a la película.
     * 
     * @return El espectador asociado a la película.
     */
    public Espectador getEspectador() {
        return this.espectador;
    }
}
