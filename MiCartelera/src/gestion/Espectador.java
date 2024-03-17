package gestion;

/**
 * Clase que representa a un espectador en un cine.
 * Contiene informacion sobre el nombre del espectador y el maximo de peliculas que puede ver.
 * 
 * @author Irene
 * @version 17 18/03/2024
 */
public class Espectador {

    // Propiedades

    /** Nombre del espectador. */
    private String nombre;

    /** Maximo de peliculas que puede ver el espectador. */
    private int maximoPeliculas;

    // Constructor

    /**
     * Constructor de la clase Espectador.
     * Inicializa el nombre del espectador como "Nombre desconocido" y el maximo de peliculas como 5.
     */
    public Espectador() {
        nombre = "Nombre desconocido";
        maximoPeliculas = 5;
    }

    // Metodos Getters y Setters

    /**
     * Obtiene el nombre del espectador.
     * 
     * @return El nombre del espectador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del espectador.
     * 
     * @param cualquierNombre El nuevo nombre del espectador.
     */
    public void setNombre(String cualquierNombre) {
        this.nombre = cualquierNombre;
    }

    /**
     * Obtiene el maximo de peliculas que puede ver el espectador.
     * 
     * @return El maximo de peliculas que puede ver el espectador.
     */
    public int getMaximoPeliculas() {
        return maximoPeliculas;
    }

    /**
     * Establece el maximo de peliculas que puede ver el espectador.
     * 
     * @param maximoPeliculas El nuevo maximo de peliculas que puede ver el espectador.
     */
    public void setMaximoPeliculas(int maximoPeliculas) {
        this.maximoPeliculas = maximoPeliculas;
    }

    // Metodo toString

    /**
     * Metodo toString para obtener una representacion en cadena del espectador.
     * 
     * @return Una cadena que representa al espectador con su nombre y el maximo de peliculas.
     */
    public String toString() {
        return this.getNombre() + " (" + this.getMaximoPeliculas() + " peliculas)";
    }
}
