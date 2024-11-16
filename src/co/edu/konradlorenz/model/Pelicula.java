package co.edu.konradlorenz.model;

public class Pelicula {
	
	//Atributos
	private String titulo;
	private String clasificacion;
	private String genero;
	private int duracion; // en minutos
	
	//Constructor
	public Pelicula(String titulo, String clasificacion, String genero, int duracion) {
		super();
		this.titulo = titulo;
		this.clasificacion = clasificacion;
		this.genero = genero;
		this.duracion = duracion;
	}

	public Pelicula() {
	}
	
	//Carpinteria (Getters, Setters & toString)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + "]";
	}
}
