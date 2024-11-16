package co.edu.konradlorenz.model;

import java.util.Arrays;

public class SalaCine {

	// Atributos
	private String nombreSala;
	private int fila;
	private int columna;
	private Asiento[][] sala;

	// Constructores
	public SalaCine(String nombreSala, int fila, int columna, Asiento[][] sala) {
		super();
		this.nombreSala = nombreSala;
		this.fila = fila;
		this.columna = columna;
		this.sala = sala;
	}

	public SalaCine() {

	}

	// Carpinteria (Setters, Getters y toString)
	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public Asiento[][] getSala() {
		return sala;
	}

	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "SalaCine [nombreSala=" + nombreSala + ", fila=" + fila + ", columna=" + columna + ", sala="
				+ Arrays.toString(sala) + "]";
	}

	//Metodo para iniciar la sala de cine
	public void inicializarAsientos() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                // Alternar entre "Premier" y "General"
                if ((i + j) % 2 == 0) {
                    sala[i][j] = new Asiento("Premier");
                } else {
                    sala[i][j] = new Asiento("General");
                }
            }
        }
	}//Cierre inicializarAsientos
	
	//Metodo para mostrar Asientos
	public void mostrarAsientos() {
        System.out.println("Disposición de asientos en " + nombreSala + " (O = ocupado, D = disponible):");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                Asiento asiento = sala[i][j];
                String estado = asiento.isReservado() ? "O" : "D";
                String tipo = asiento.getTipo().equals("Premier") ? "P" : "G";
                System.out.print(estado + tipo + " ");
            }
            System.out.println();
        }
    }//Cierre mostrarAsientos
}//Cierre SalaCine
