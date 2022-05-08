package com.dou.ud20.Exercises;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Exercise4 implements WindowListener{

	private JFrame frame;
	public static JTextArea txtrTextoInicial;
	public static String texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise4 window = new Exercise4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//Declaration
		JLabel lblTittle = new JLabel("Eventos");
		frame = new JFrame();
		
//Parameterizing
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addWindowListener(this);
		
		txtrTextoInicial = new JTextArea();
		txtrTextoInicial.setText("Texto inicial");
		txtrTextoInicial.setBounds(111, 50, 206, 177);
		
		
		lblTittle.setBounds(106, 22, 61, 16);
		
//Adding elements to content panel
		frame.getContentPane().add(txtrTextoInicial);
		frame.getContentPane().add(lblTittle);
	}


	@Override
	public void windowClosing(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana cerrandose");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana desactivada");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		texto = txtrTextoInicial.getText();
		txtrTextoInicial.setText(texto+"\n"+"Ventana abierta");
	}
}
