package com.dou.ud20.Exercises;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Exercise5 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5 frame = new Exercise5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */	

	public Exercise5() {
//Declarations
		JButton btnLimpiar = new JButton("Limpiar");
		MouseListener listenerRaton = new listenerRaton();
		
//Parameterizing
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnLimpiar.setBounds(217, 11, 89, 23);
		textArea.setBounds(10, 39, 520, 303);
		
		//Setting mouse listenet on the textArea
		textArea.addMouseListener(listenerRaton);
		
//Action Listeners
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});		
		
		
//Adding elements to content panel
		contentPane.add(btnLimpiar);
		contentPane.add(textArea);		

	}	
	
	class listenerRaton extends MouseInputAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			textArea.setText("Has hecho clic en \n");
			textArea.setText("Posicion X: " + e.getX());
			textArea.setText("Posicion Y: " + e.getY());

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// Operacion con bits
			if (((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)) {
				textArea.append("Pulsado el botón derecho");
			}

			textArea.append("Se ha pulsado el botón");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			textArea.append("Se ha soltado el botón");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			textArea.append("El ratón ha entrado en el texto \n");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			textArea.append("El ratón ha salido del texto \n");
		}
	}
}
