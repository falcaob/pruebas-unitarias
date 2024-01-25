package gestion;

public class Espectador {

		//Propiedades
		private String nombre; //nombre del espectador
		private int maximoPeliculas; //máximo peliculas que pued ver el espectador
		
		//Constructor
		public Espectador() {
			nombre = "Nombre desconocido";
			maximoPeliculas = 5;
		}

		//Métodos Getters y Setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String cualquierNombre) {
			this.nombre = cualquierNombre;
		}

		public int getMaximoPeliculas() {
			return maximoPeliculas;
		}

		public void setMaximoPeliculas(int maximoPeliculas) {
			this.maximoPeliculas = maximoPeliculas;
		}
		
		//Cubrir método toString
		public String toString() {
			return this.getNombre() + " (" + this.getMaximoPeliculas() + " peliculas)";
		}		
}
