package co.edu.konradlorenz.gui;

import javax.swing.*;
import javax.swing.border.Border;

import co.edu.konradlorenz.controller.Controlador;
import co.edu.konradlorenz.model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

@SuppressWarnings("serial")
public class DarKaZoFilms extends JFrame {

	Controlador controlador = new Controlador();

	// Ventanas
	JFrame darKaZoFlims = new JFrame();

	// Paneles
	JPanel invisiblePanel = new JPanel(); // Este JPanel permite que el autofocus no sea el primer campo de texto.
	JPanel bodyMenuPrincipal;

	// Campos de texto
	JTextField txtField;
	JPasswordField pwdField;
	
	//Colores
		Color fondoPanel = Color.WHITE;//Fondo de todos los JPanel
		Color fondoFrame = Color.RED;//Fondo del JFrame
	
	//Constructor del JFrame
		public DarKaZoFilms(){

			controlador.datosDePrueba();
		
			darKaZoFlims.setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar la ejecución si se cierra la ventana
			darKaZoFlims.setTitle("DarKaZo Flims");
			darKaZoFlims.setSize(1440 ,900 );
			darKaZoFlims.setLocationRelativeTo(null);//Centra la ventana
			darKaZoFlims.setLayout(null);//Desactivar layout automático para usar setBounds()
			darKaZoFlims.setResizable(false);//No permite modificar el tamaño de la ventana
			darKaZoFlims.setBackground(Color.BLUE);//Color de la barra de la ventana
			darKaZoFlims.getContentPane().setBackground(fondoFrame);
			
			
			invisiblePanel.setFocusable(true);
			invisiblePanel.setVisible(true);
			
			darKaZoFlims.add(invisiblePanel);//Autofocus.
			
			darKaZoFlims.setVisible(true);
		}//Cierre DarKaZoFlims
}// */Cierre DarKaZoFlims
