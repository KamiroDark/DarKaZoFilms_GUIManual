package co.edu.konradlorenz.model;

public class Asiento implements SillaPremier, SillaGeneral {

	// Atributos
	private int numero;
	private int fila;
	private boolean reservado = false;
	private String tipo; // "Premier" o "General"

	// Constructores
	public Asiento(int numero, int fila, boolean reservado, String tipo) {
		this.numero = numero;
		this.fila = fila;
		this.reservado = reservado;
		this.tipo = tipo;
	}

	public Asiento() {
	}

	public Asiento(String tipo) {
		this.tipo = tipo;
		this.reservado = false; // Inicialmente disponible por eso es falso :3
	}

	// Carpinteria (Getters y Setters)
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Asiento [numero=" + numero + ", fila=" + fila + ", reservado=" + reservado + "]";
	}

	// Metodo que se implementa para traer el precio de la silla Premier
	@Override
	public double calcularPrecioPremier() {
		// TODO Auto-generated method stub
		return PRECIOPREMIER;
	}

	// Metodo que se implementa para traer el precio de la silla General
	@Override
	public double calcularPrecioGeneral() {
		// TODO Auto-generated method stub
		return PRECIOGENERAL;
	}

}
