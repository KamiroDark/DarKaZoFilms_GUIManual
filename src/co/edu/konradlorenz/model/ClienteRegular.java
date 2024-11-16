package co.edu.konradlorenz.model;

public class ClienteRegular extends Usuario{
	
	//Constructor
	public ClienteRegular(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		super(nombreUsuario, correoElectronico, contraseña, celular, membresia);
	}//Cierre ClienteRegular

	//Metodo para calcular el descuento del cliente Regular (Sin membresia)
	@Override
	public double calcularDescuento(double totalCompra) {
		return totalCompra;// Cliente regular no tiene descuento, por eso devolvemos el precio nomral
	}//Cierre calcularDescuento

}//Cierre ClienteRegular
