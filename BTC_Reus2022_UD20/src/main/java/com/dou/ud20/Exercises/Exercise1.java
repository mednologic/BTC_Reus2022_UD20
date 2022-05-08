package com.dou.ud20.Exercises;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.1.1
 * @date 04/05/2022
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Se crea la clase View y se definen los elementos a utilizar.
public class Exercise1 {

	private JFrame frame;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JLabel lblNewLabel_1;
	private JButton Cerrar;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise1 window = new Exercise1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Exercise1() {
		initialize();
	}

	/**
	 * Se inicializa el contenido del JFrame, en este ejercicio se han definido dos
	 * areas de texto y un botón. Al introducir dos números enteros y pulsar el
	 * botón, cambiará el tamaño de la pantalla. También tiene un botón para cerrar
	 * la pantalla.
	 */

	private void initialize() {
//Declaraciones
		JButton boton = new JButton("Cambiar Pantalla");
		JLabel lblNewLabel = new JLabel("Alto");
		lblNewLabel_1 = new JLabel("Ancho");
		txtAlto = new JTextField();
		txtAncho = new JTextField();
		Cerrar = new JButton("Cerrar");
		
//Parameterizing
		frame = new JFrame();
		frame.setBounds(100, 100, 177, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		boton.setBounds(10, 135, 130, 23);
		
		txtAlto.setBounds(10, 36, 86, 20);
		txtAlto.setColumns(10);
		
		lblNewLabel.setBounds(10, 11, 46, 14);
		lblNewLabel_1.setBounds(10, 67, 46, 14);

		txtAncho.setBounds(10, 90, 86, 20);
		txtAncho.setColumns(10);
		
		Cerrar.setBounds(33, 169, 89, 23);
		
//Action Listeners
		
		/**
		 * Botón que cambia el tamaño de la pantalla. Recibe como parámetro el ancho y
		 * el alto mediante un getText en los textField.
		 */
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se captura el ancho y el alto.
				int alto = Integer.parseInt(txtAlto.getText());
				int ancho = Integer.parseInt(txtAncho.getText());
				// Se cambia el tamaño de la ventana.
				frame.setSize(alto, ancho);
			}
		});
		//Close window
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
//Adding elements to frame
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(txtAncho);
		frame.getContentPane().add(txtAlto);
		frame.getContentPane().add(boton);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(Cerrar);

	}
}
