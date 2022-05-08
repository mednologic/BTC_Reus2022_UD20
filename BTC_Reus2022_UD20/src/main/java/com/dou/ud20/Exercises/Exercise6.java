package com.dou.ud20.Exercises;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Exercise6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtKilos;
	private JTextField txtIMC;

	/**
	 * Se crea la vista principal del programa. En esta vista se calculará el IMC
	 * mediante la altura y el peso que el usuario introducira en los textFiled.
	 */
	public Exercise6() {
		contentPane = 			new JPanel();
		JLabel lblNewLabel = 	new JLabel("Altura (metros)");
		JLabel lblNewLabel_1 = 	new JLabel("Peso (kilos)");
		JLabel lblNewLabel_2 = 	new JLabel("IMC");
		JButton calcularIMC = 	new JButton("Calc IMC");
		txtKilos = 				new JTextField();
		txtIMC = 				new JTextField();
		txtAltura = 			new JTextField();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		txtAltura.setBounds(141, 69, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		
		lblNewLabel.setBounds(34, 72, 89, 14);
		

		
		txtKilos.setBounds(141, 100, 86, 20);
		txtKilos.setColumns(10);

		lblNewLabel_1.setBounds(34, 103, 89, 14);
		
		calcularIMC.setBounds(34, 130, 89, 23);
				
		txtIMC.setEditable(false);
		txtIMC.setBounds(141, 131, 86, 20);
		
		txtIMC.setColumns(10);

		lblNewLabel_2.setBounds(237, 134, 46, 14);
		
//Action Listeners
		/**
		 * Mediante el botón Calc IMC, se calculará el IMC teniendo como atributos la
		 * altura en metros y los kilos como peso. Para calcular el IMC se divide el
		 * peso entre (altura*altura).
		 */
		calcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Mediante DecimalFormat le damos un formato al String para reducir el número
				 * de decimales sin redondear.
				 */
				DecimalFormat f1 = new DecimalFormat("#.00");
				double altura = Double.parseDouble(txtAltura.getText());
				double peso = Double.parseDouble(txtKilos.getText());
				altura = altura * altura;
				double imc = peso / altura;
				// Se utiliza la función format del DecimalFormat y como parámetro el imc.
				txtIMC.setText(f1.format(imc));
			}
		});

//Adding elements to content Panel
		contentPane.add(calcularIMC);
		contentPane.add(lblNewLabel_1);
		contentPane.add(txtKilos);
		contentPane.add(txtIMC);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
	}

}
