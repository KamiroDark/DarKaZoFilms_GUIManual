package co.edu.konradlorenz.model;

public class ClientePro extends Usuario {
	
	//Constructor
	public ClientePro(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		super(nombreUsuario, correoElectronico, contraseña, celular, membresia);
	}//Cierre Constructor

	//Metodo para calcular el descuento del cliente Pro
	@Override
	public double calcularDescuento(double totalCompra) {
		double descuento = totalCompra * membresia.getDescuento()/100;
		return totalCompra - descuento;
	}//Cierre calcularDescuento

}//Cierre ClientePro
