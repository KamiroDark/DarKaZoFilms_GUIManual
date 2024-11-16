package co.edu.konradlorenz.model;

public abstract class Usuario {

	// Atributos
	protected String nombreUsuario;
	protected String correoElectronico;
	protected String contraseña;
	protected long celular;
	protected TipoMembresia membresia;

	// Constructores
	public Usuario(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.celular = celular;
		this.membresia = membresia;
	}

	public Usuario() {
	}

	// Carpinteria (Getters, Setters & toString)
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public TipoMembresia getMembresia() {
		return membresia;
	}

	public void setMembresia(TipoMembresia membresia) {
		this.membresia = membresia;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + ", celular="
				+ celular + "]";
	}

	// Metodo para calcular el descuento dependiendo de la membresia del usuario
	public abstract double calcularDescuento(double totalCompra);

}// Cierre Usuario
