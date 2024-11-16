package co.edu.konradlorenz.model;

import java.util.ArrayList;
import java.util.List;

public class Cine {

	// Atributos
	private String teatro;
	private String direccion;
	private List<Funcion> funciones = new ArrayList<>();

	// Construtor Vacio
	public Cine() {
	}// Cierre Constructor Vacio

	public Cine(String teatro, String direccion, List<Funcion> funciones) {
		super();
		this.teatro = teatro;
		this.direccion = direccion;
		this.funciones = funciones;
	}// Cierre constructor

	// Carpinteria (Setters, Getters y toString)
	public String getTeatro() {
		return teatro;
	}

	public void setTeatro(String teatro) {
		this.teatro = teatro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	@Override
	public String toString() {
		return "Cine [teatro=" + teatro + ", direccion=" + direccion + "]";
	}

}// Cierre Cine
