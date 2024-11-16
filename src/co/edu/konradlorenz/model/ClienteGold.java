package co.edu.konradlorenz.model;

public class ClienteGold extends Usuario {

	// Constructor
	public ClienteGold(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		super(nombreUsuario, correoElectronico, contraseña, celular, membresia);
	}// Cierre constructor

	// Metodo para calcular el descuento del cliente Gold
	@Override
	public double calcularDescuento(double totalCompra) {
		double descuento = totalCompra * membresia.getDescuento() / 100;
		return totalCompra - descuento;
	}// Cierre calcularDescuento

}// Cierre ClienteGold
