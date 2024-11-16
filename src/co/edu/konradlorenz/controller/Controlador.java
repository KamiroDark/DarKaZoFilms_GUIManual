package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.gui.DarKaZoFilms;
import co.edu.konradlorenz.model.Cine;
import co.edu.konradlorenz.model.ClienteGold;
import co.edu.konradlorenz.model.ClientePro;
import co.edu.konradlorenz.model.ClienteRegular;
import co.edu.konradlorenz.model.Funcion;
import co.edu.konradlorenz.model.TipoMembresia;
import co.edu.konradlorenz.model.Usuario;

public class Controlador {

	protected Funcion objFuncion = new Funcion();

	protected Cine objCine = new Cine();

	protected ArrayList<Usuario> clientes = new ArrayList<>();

	public Usuario usuarioSeleccionado;

	public void run() {
		@SuppressWarnings("unused")
		DarKaZoFilms darkazofims = new DarKaZoFilms();
	}
	// Run

	// Metodo para validar el inicio de sesion
	public boolean validarCredenciales(String correo, String contraseña, TipoMembresia membresia) {
		usuarioSeleccionado = null;

		for (Usuario usuario : clientes) {
			if (usuario.getCorreoElectronico().equals(correo))
				;
			usuarioSeleccionado = usuario;
			break;
		}

		if (usuarioSeleccionado == null)
			return false;

		boolean verificarContraseña = usuarioSeleccionado.getContraseña().equals(contraseña) ? true : false;

		return verificarContraseña;
	}// *//Cierre validarCredenciales

	// Metodo para usuarios ya guardados en el programa
	public void datosDePrueba() {

		// Variables globales
		String nombreUsuario;
		String correoElectronico;
		String contraseña;
		long celular;
		TipoMembresia tipoMembresia;

		// Ejemplo 1
		nombreUsuario = "Darly Diaz";
		correoElectronico = "darlydiaz@gmail.com";
		contraseña = "louis2024";
		celular = 339295373;
		tipoMembresia = TipoMembresia.GOLD;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

		// Ejemplo 2
		nombreUsuario = "Zoe Henao";
		correoElectronico = "henaozoe@gmail.com";
		contraseña = "santiago2023";
		celular = 334353562;
		tipoMembresia = TipoMembresia.PRO;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

		// Ejemplo 3
		nombreUsuario = "Camilo Prieto";
		correoElectronico = "prietocamilo21@gmail.com";
		contraseña = "gojosatoru";
		celular = 312466982;
		tipoMembresia = TipoMembresia.REGULAR;
		nuevoCliente(nombreUsuario, correoElectronico, contraseña, celular, tipoMembresia);

	}// Cierre datos Prueba

	// Metodo para crear y agregar usuarios al sistema
	public void nuevoCliente(String nombreUsuario, String correoElectronico, String contraseña, long celular,
			TipoMembresia membresia) {
		if (TipoMembresia.GOLD.equals(membresia)) {
			Usuario usuarioGold = new ClienteGold(nombreUsuario, correoElectronico, contraseña, celular, membresia);
			clientes.add(usuarioGold);
		} else if (TipoMembresia.PRO.equals(membresia)) {
			Usuario usuarioPro = new ClientePro(nombreUsuario, correoElectronico, contraseña, celular, membresia);
			clientes.add(usuarioPro);
		} else if (TipoMembresia.REGULAR.equals(membresia)) {
			Usuario usuarioRegular = new ClienteRegular(nombreUsuario, correoElectronico, contraseña, celular,
					membresia);
			clientes.add(usuarioRegular);
		}
	}// Cierre nuevoCliente
}// Cierre Control
