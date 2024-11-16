package co.edu.konradlorenz.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Funcion {

	// Atributos
	private SalaCine sala;
	private String horario;
	private Pelicula pelicula;

	// Constructores
	public Funcion(SalaCine sala, String horario, Pelicula pelicula) {
		this.sala = sala;
		this.horario = horario;
		this.pelicula = pelicula;
	}

	public Funcion() {
	}

	// Carpinteria (Setters, Getters & toString)
	public SalaCine getSala() {
		return sala;
	}

	public void setSala(SalaCine sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Funcion [sala=" + sala + ", horario=" + horario + ", pelicula=" + pelicula + "]";
	}

	// Metodo para obtener la fecha y hora de manera ordenada
	public String getActualTime() {
		LocalDateTime fechaHoraActual = LocalDateTime.now(); // Formato de LocalDate Time: YYYY-MM-DDTHH:MM:SS
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); // Formato más agradable a la
																						// vista.
		String actualTime = fechaHoraActual.format(formato);
		return actualTime;
	}// Cierre getActualTime

}// Cierre Funcion
