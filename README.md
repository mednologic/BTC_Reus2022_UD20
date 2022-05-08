<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T01</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)

<p align="justify">En este ejercicio se creará una aplicación con interfaz gráfica en la cual se construirá una ventana con un título y marco con los controles básicos, es decir, restaurar, maximizar y cerrar. Al pulsar sobre el botón cerrar se deberá cerrar completamente la aplicación. Esta ventana contendrá una etiqueta y el usuario debe poder cambiar su tamaño.</p>

En la siguiente imagen se puede observar de forma visual las diferentes funcionalidades.

![UD20-T1](https://user-images.githubusercontent.com/103035621/167310271-55fdfed6-2ad7-4682-94d1-44ec1a0fc808.png)

<p align="justify"> Para realizar este ejercicio se utilizará solamente una clase llamada View. En dicha clase se definirán los componentes que formarán la vista junto con su comportamiento utilizando los diferentes actionListeners. En este caso se utiliza solamente un ActionListener que escuchará los eventos de cerrar y cambiar pantalla.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase View.java</summary>
 
  <br>
 
  ```java
package com.dou.ud20.t1;

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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Se crea la clase View y se definen los elementos a utilizar.
public class View {

	private JFrame frame;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JLabel lblNewLabel_1;
	private JButton Cerrar;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public View() {
		initialize();
	}

	/**
	 * Se inicializa el contenido del JFrame, en este ejercicio se han definido dos
	 * areas de texto y un botón. Al introducir dos números enteros y pulsar el
	 * botón, cambiará el tamaño de la pantalla. También tiene un botón para cerrar
	 * la pantalla.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 177, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/**
		 * Botón que cambia el tamaño de la pantalla. Recibe como parámetro el ancho y
		 * el alto mediante un getText en los textField.
		 */
		JButton boton = new JButton("Cambiar Pantalla");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se captura el ancho y el alto.
				int alto = Integer.parseInt(txtAlto.getText());
				int ancho = Integer.parseInt(txtAncho.getText());
				// Se cambia el tamaño de la ventana.
				frame.setSize(alto, ancho);
			}
		});
		boton.setBounds(10, 135, 130, 23);
		frame.getContentPane().add(boton);

		txtAlto = new JTextField();
		txtAlto.setBounds(10, 36, 86, 20);
		frame.getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		JLabel lblNewLabel = new JLabel("Alto");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		txtAncho = new JTextField();
		txtAncho.setBounds(10, 90, 86, 20);
		frame.getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		lblNewLabel_1 = new JLabel("Ancho");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		/**
		 * Se cierra la ventana mediante la función dispose de la clase frame. Esta
		 * acción se realiza en el botón cerrar con el ActionListener.
		 */
		Cerrar = new JButton("Cerrar");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Cerrar.setBounds(33, 169, 89, 23);
		frame.getContentPane().add(Cerrar);

	}
}

  ```
 </details>
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T02</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  
En este ejercicio se deberá crear una aplicación gráfica mediante JFrameForm que contenga una etiqueta y dos botones de operación. Al pulsar dichos botones se deberá reflejar en el texto de la etiqueta cuál es el último botón que el usuario ha pulsado.

En la siguiente imagen se podrá observar de forma gráfica el funcionamiento de los botones con la label.

![UD20-T2](https://user-images.githubusercontent.com/103035621/167310936-250698e6-44bd-4032-b76c-dc0e0f3d856a.png)

<p align="justify">Para realizar este ejercicio de la forma más simple y reducida se ha utilizado una sola clase llamada Exercise2.java mediante la tecnología de estructura de proyecto de Maven. En esta clase se definen los componentes que forman la vista, se les cambia el nombre de componente y se crea el actionListener utilizado para los eventos de los botones y la label.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase CartaClass.java</summary>
<br>

  ```java
package com.dou.ud20.t2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author joseporiollopezbosch / David Dalmau / Octavio Bernal
 *
 */

public class Exercise2 implements ActionListener{

	private JFrame frame;
	private JLabel lblPrincipal;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise2 window = new Exercise2();
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
	public Exercise2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Creating elementos
		frame = new JFrame();
		btn1 = new JButton("Boton1");
		lblPrincipal = new JLabel("Has pulsado: ");
		btn2 = new JButton("Boton2");
		
		//Seting params
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblPrincipal.setBounds(19, 16, 162, 16);
		btn1.setBounds(193, 11, 117, 29);
		btn2.setBounds(322, 11, 117, 29);	
		
		//ActionListeners
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//Adding to contentPane
		frame.getContentPane().add(lblPrincipal);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		
	}
	//Override to control the click events
	@Override
	public void actionPerformed(ActionEvent e) {
		//Geting info from the event
		JButton btnPress = (JButton)e.getSource();
		//Getting the text of the widget
		String name = btnPress.getText();
		//Switching the acction request
		switch(name) {
			case "Boton1":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn1.getText().toString());
				break;
			case "Boton2":
				lblPrincipal.setText("Has pulsado: ");
				lblPrincipal.setText(lblPrincipal.getText()+" "+ btn2.getText().toString());
				break;
		}
	}
	
}

  ```
 </details>

<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T03</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  
  <p align="justify">En este ejercicio hay que crear una aplicación grafica mediante JFrameForm con una ventana que tenga dos etiquetas de texto y dos botones de operación. El comportamiento de la aplicación debe reflejar en las etiquetas de texto el número de veces que el usuario presiona ambos botones. Dicho de otra forma, las labels son contadores de las veces que el usuario presiona los botones.</p>
  
<p align="justify">En este ejercicio se realizan una série de mejoras, se eliminan las label y se añade el código de modificación de label en el propio botón, cuando se presionen los botones se mostrará el contador en ellos. En la siguiente imagen se muestra el funcionamiento y una breve descripción.</p>

![UD20-T3](https://user-images.githubusercontent.com/103035621/167312181-086f15ba-d2de-4288-90b8-6c1b1e130e97.png)

<p align="justify">Para realizar este ejercicio se han creado dos clases, la clase App.java y la clase TA3.java. La primera clase contiene el código de llamada de la vista y la segunda clase hace referencia a la vista de la aplicación.</p>

Se otorga visibilidad al Frame TA3 mediante la sentencia ta3.setVisible(true); importada de la clase TA3.

<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        TA3 ta3 = new TA3();
        ta3.setVisible(true);
        
    }
}
  ```
 </details>

El siguiente código corresponde a la vista, en el se definen sus componentes las acciones que han de realizar mediante los actionListener.

<details>
  <summary>En este spoiler se muestra el código creado en la Clase TA3.java</summary>
<br>

  ```java
package com.dou.ud20.t3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TA3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TA3 frame = new TA3();
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
	public TA3() {
		setTitle("Contador de Clicks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 112);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {
			// Creamos un contador
			private int count = 0;

			public void actionPerformed(ActionEvent e) {
				// Sumamos contador
				count++;

				//Al hacer click se suma un numero al boton al contador
				String clicksBtn1 = String.valueOf(count);
				btnBoton1.setText(clicksBtn1);

			}
		});
		btnBoton1.setBounds(27, 23, 89, 23);
		contentPane.add(btnBoton1);

		JButton btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {

			// Creamos un contador
			private int count = 0;
			public void actionPerformed(ActionEvent e) {
				// Sumamos contador
				count++;

				//Al hacer click se suma un numero al boton al contador
				String clicksBtn2 = String.valueOf(count);
				btnBoton2.setText(clicksBtn2);
			}
		});
		btnBoton2.setBounds(140, 23, 89, 23);
		contentPane.add(btnBoton2);
	}
}

  ```
 </details>
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T04</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contenga una etiqueta y un área de texto. La aplicación debe reflejar en el área de texto todos los eventos de ventana que se produzcan por la creación o interacción del usuario.</p>

![UD20-T4](https://user-images.githubusercontent.com/103035621/167312802-60d26d9d-a3a7-4675-b936-57cd60cce7b8.png)

<p align="justify">En la imagen anterior se explican los diferentes eventos mostrados en el campo de texto en área. Para gestionar estos eventos se utilizan las funciones asociadas a la clase WindowListener y WindowEvent.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase T4.java</summary>
<br>

  ```java
package com.dou.ud20.t4;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class T4 implements WindowListener{

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
					T4 window = new T4();
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
	public T4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Declarations
		frame = new JFrame();
		txtrTextoInicial = new JTextArea();
		JLabel lblTittle = new JLabel("Eventos");
		
		//Parametring
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addWindowListener(this);
		txtrTextoInicial.setText("Texto inicial");
		txtrTextoInicial.setBounds(111, 50, 206, 177);
		lblTittle.setBounds(106, 22, 61, 16);
		
		//Adding to frame
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

  ```
 </details>
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T05</h1></td>
  
 </tr>
</table>
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que tenga un botón y un área de texto. La aplicación debe reflejar en el área de texto todos los eventos de ratón que se produzcan sobre dicha área de texto por las interacciones del usuario. Haciendo click en el botón se limpiará el contenido del área de texto.</p>

![UD20-T5](https://user-images.githubusercontent.com/103035621/167313536-cf750c24-c7e9-489c-8b4a-bb09557b23e4.png)


<p align="justify">En la imagen anterior se resume de forma breve los eventos generados en la aplicación. Para realizar este ejercicio se han creado dos clases, la clase App.java y la TA5.java</p>

En la siguiente clase se introduce el código necesario para dar visibilidad al JFrame.
<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
    	TA5 ta5 = new TA5();
        ta5.setVisible(true);
    }
}

  ```
 </details>
 
En la siguiente clase se introduce el código referente a la vista, a la creación de los componentes y sus eventos. 
 
 <details>
  <summary>En este spoiler se muestra el código creado en la Clase TA5.java</summary>
<br>

  ```java
package com.dou.ud20.t2;

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

public class TA5 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TA5 frame = new TA5();
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

	public TA5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		MouseListener listenerRaton = new listenerRaton();
		textArea.addMouseListener(listenerRaton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});		
		
		btnLimpiar.setBounds(217, 11, 89, 23);
		contentPane.add(btnLimpiar);


		textArea.setBounds(10, 39, 520, 303);
		contentPane.add(textArea);		

	}	
	
	class listenerRaton extends MouseInputAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			textArea.append("\nHas hecho clic en");
			textArea.append("\nPosicion X: " + e.getX());
			textArea.append("\nPosicion Y: " + e.getY());

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// Operacion con bits
			if (((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)) {
				textArea.append("\nPulsado el botón derecho");
			}

			textArea.append("\nSe ha pulsado el botón");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			textArea.append("\nSe ha soltado el botón");
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

  ```
 </details>
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T06</h1></td>
  
 </tr>
</table>
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contiene un botón, y 3 text filed. El usuario introducirá la altura en metros y el peso en kilogramos, al pulsar el botón calc imc se calculará el índice de masa corporal. </p>

![UD20-T6](https://user-images.githubusercontent.com/103035621/167313918-c865caad-58dd-4cb6-95fe-833256790ea5.png)


<p align="justify">En la imagen anterior se explica de forma breve y precisa el funcionamiento del aplicativo. Para trabajar de forma eficiente se crean dos clases, la primera de ellas será la App.Java donde vendrá ubicado el código que dará visibilidad al JFrame, y la segunda clase llamada MainView.Java es donde estará el código referente a la vista.</p>

En la siguiente clase se introduce el código necesario para dar visibilidad al JFrame.
<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t6;

import com.dou.ud20.t6.view.MainView;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */

public class App {
	public static void main(String[] args) {
		/**
		 * Se crea una instancia de la clase MainView. Se otorga visibilidad a la vista
		 * mediante setVisible(true) y se le muestra al usuario la vista.
		 */
		MainView vistaPrincipal = new MainView();
		vistaPrincipal.setVisible(true);
	}
}

  ```
 </details>
 
 
 <p align="justify">En la siguiente clase se introduce el código de la vista, se crean los componentes, se otorga un nombre a ellos para su uso y se utilizan los diferentes eventos para crear la aplicación.</p>
 
<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t6.view;

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

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtKilos;
	private JTextField txtIMC;

	/**
	 * Se crea la vista principal del programa. En esta vista se calculará el IMC
	 * mediante la altura y el peso que el usuario introducira en los textFiled.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtAltura = new JTextField();
		txtAltura.setBounds(141, 69, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(34, 72, 89, 14);
		contentPane.add(lblNewLabel);

		txtKilos = new JTextField();
		txtKilos.setBounds(141, 100, 86, 20);
		contentPane.add(txtKilos);
		txtKilos.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Peso (kilos)");
		lblNewLabel_1.setBounds(34, 103, 89, 14);
		contentPane.add(lblNewLabel_1);

		/**
		 * Mediante el botón Calc IMC, se calculará el IMC teniendo como atributos la
		 * altura en metros y los kilos como peso. Para calcular el IMC se divide el
		 * peso entre (altura*altura).
		 */
		JButton calcularIMC = new JButton("Calc IMC");
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
		calcularIMC.setBounds(34, 130, 89, 23);
		contentPane.add(calcularIMC);

		txtIMC = new JTextField();
		txtIMC.setEditable(false);
		txtIMC.setBounds(141, 131, 86, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(237, 134, 46, 14);
		contentPane.add(lblNewLabel_2);
	}

}

  ```
 </details>
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T07</h1></td>
  
 </tr>
</table>
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contiene un botón, un toggleButton, dos etiquetas y dos campos de texto simnple. Este aplicativo permitirá al usuario convertir los euros introducidos a pesetas y viceversa. Mediante el toggleButton ejecutaremos el cambio de divisas y mediante el botón cambiar cambiaremos el factor de conversión de esta. </p>

![UD20-T7](https://user-images.githubusercontent.com/103035621/167314418-deea6658-4ff6-4329-ae75-d4efff8dd6a0.png)


<p align="justify">En la imagen anterior se puede observar el programa en ejecución con una breve descripción de funcionamiento. El usuario introducirá la cantidad a convertir, mediante el botón cambiar seleccionará el tipo de conversión a realizar y mediante el togglerButtón ejecutará dicha conversión.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase Exercise7.java</summary>
<br>

  ```java
package com.dou.ud20.t7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Exercise7 {

	private JFrame frame;
	private JTextField tfValor;
	private JTextField tfResultado;
	private JButton btnCalculo;
	private Double valorEuros = 166.386;
	private DecimalFormat df = new DecimalFormat("#.##");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise7 window = new Exercise7();
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
	public Exercise7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Declararion
		JLabel lblcantidad = new JLabel("Cantidad a convertir");
		JLabel lblResultado = new JLabel("Resultado");
		JButton btnCambiar = new JButton("Cambiar");
		tfResultado = new JTextField();
		tfValor = new JTextField();
		btnCalculo = new JButton("Euros a ptas");
		
		//Parametring
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblcantidad.setBounds(6, 28, 127, 16);
		frame.getContentPane().add(lblcantidad);
		
		
		tfValor.setBounds(139, 23, 87, 26);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		
		lblResultado.setBounds(238, 28, 62, 16);
		frame.getContentPane().add(lblResultado);
		
		
		tfResultado.setColumns(10);
		tfResultado.setBounds(312, 23, 87, 26);
		btnCalculo.setBounds(70, 90, 117, 29);
		btnCambiar.setBounds(199, 90, 117, 29);
		
		//Action Listeners
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double casting = Double.valueOf(tfValor.getText());
				Double op = conversion(casting);
				tfResultado.setText(String.valueOf(df.format(op)));
				
			}
		});
		
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnCalculo.getText().equals("Euros a ptas")) {
					btnCalculo.setText("Ptas a Euros");
				}else {
					btnCalculo.setText("Euros a ptas");
				}
			}
		});
		
		
		//Adding to frame
		frame.getContentPane().add(tfResultado);
		frame.getContentPane().add(btnCalculo);
		frame.getContentPane().add(btnCambiar);
	}
	
	//Funtion of conversion
	public Double conversion(Double valor) {
		Double resultado = 0.0;
		
		switch(btnCalculo.getText()) {
			case "Ptas a Euros":
				resultado = valor/valorEuros;
				break;
			case "Euros a ptas":
				resultado = valor*valorEuros;
				break;
		}
		return resultado;
	}
}

  ```
 </details>
 <table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T08</h1></td>
  
 </tr>
</table>
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  

  
<p align="justify">Este ejercicio es una copia del ejercicio 7, nuestro equipo ha decicido volver a crearlo de nuevo para poner en práctica todo lo aprendido. En este ejercicio se pide crear una aplicación gráfica mediante JFrameForm con una ventana que contiene un botón, un toggleButton, dos etiquetas y dos campos de texto simnple. Este aplicativo permitirá al usuario convertir los euros introducidos a pesetas y viceversa. Mediante el toggleButton ejecutaremos el cambio de divisas y mediante el botón cambiar cambiaremos el factor de conversión de esta. 
  
Partiendo de esto se realizará un control de errores, el usuario no podrá introducir valores erróneos y no podrá dejar tampoco el campo vacío. Sí el usuario realiza alguna de las acciones mencionadas aparecerá un mensaje de error advirtiendo de eso y vaciará los campos para volver a comenzar. </p>

![UD20-T8-1](https://user-images.githubusercontent.com/103035621/167314838-44fabdc6-6f1c-4270-bf7d-11de86eacf26.png)

En la imagen anterior el usuario introduce los datos correctos. Se muestra la captura junto a una breve explicación.

![UD20-T8-2](https://user-images.githubusercontent.com/103035621/167315037-97eff704-a277-4249-a001-7a949378f33c.png)

<p align="justify">En la imagen anterior se puede observar el funcionamiento de la aplicación al generar un error de forma voluntaria.

El código de este aplicativo ha sido generado en dos clases, en la clase App.Java ubicada en el paquete T8 y la clase MainView.Java ubicada en el paquete View dentro de la estructura de proyecto.</p>

<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t8;

import com.dou.ud20.view.MainView;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */
public class App {
	public static void main(String[] args) {
		/*
		 * Se crea una instancia de la clase MainView llamada vistaPrincipal. Ejecutamos
		 * la funcion setVisible de la vista y le asignamos true.
		 */
		MainView vistaPrincipal = new MainView();
		vistaPrincipal.setVisible(true);
	}
}
  ```
 </details>
 
 <details>
  <summary>En este spoiler se muestra el código creado en la Clase MainView.java</summary>
<br>

  ```java
package com.dou.ud20.view;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 03/05/2022
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField txtConversor;
	private JTextField txtResultado;
	private Double unEurosSonPesetas = 166.386;
	private Double resultadoConversion = 0.0;
	private Double valorAConvertir = 0.0;

	/**
	 * Se crea la vista principal. Se calculará la conversión de divisas de euros a
	 * pesetas y viceversa. Mediante un TogglerButton ejecutaremos la conversión, y
	 * mediante el botón Cambiar Divisa eligiremos el factor de conversión a
	 * realizar.
	 */

	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 11, 124, 14);
		contentPane.add(lblNewLabel);

		txtConversor = new JTextField();
		txtConversor.setBounds(130, 8, 114, 20);
		contentPane.add(txtConversor);
		txtConversor.setColumns(10);

		JLabel lblResult = new JLabel("Resultado");
		lblResult.setBounds(10, 42, 86, 14);
		contentPane.add(lblResult);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(130, 39, 114, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JToggleButton calcularConversion = new JToggleButton("Conversion Ptas a Euros");
		calcularConversion.setBounds(299, 7, 173, 23);
		contentPane.add(calcularConversion);

		/**
		 * Con el ActionListener del TogglerButton se realiza la conversión definida en
		 * el propio texto del botón. Si en el texto aparece la conversión de ptas a
		 * euros se realizará dicha conversión.
		 * 
		 * Se añade try-catch para controlar los errores de formato, no se puede
		 * calcular la conversión de un campo vacío ni de un String.
		 */

		calcularConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (calcularConversion.getText().equals("Conversion Ptas a Euros")) {
					try {
						valorAConvertir = Double.parseDouble(txtConversor.getText());
					} catch (NumberFormatException ex) {
						// Al recibir el error se ejecuta una ventana que muestra el error.
						JOptionPane.showMessageDialog(calcularConversion, "Introduce un valor correcto " + ex);
						// Le damos un valor vacío para que el usuario escriba un número correcto.
						txtConversor.setText("");
					}
					// Si los valores del try-catch son correctos se continuará con el flujo del
					// programa.
					resultadoConversion = valorAConvertir * 0.006;
					txtResultado.setText(resultadoConversion.toString());
				} else if (calcularConversion.getText().equals("Conversion Euros a Ptas")) {
					try {
						valorAConvertir = Double.parseDouble(txtConversor.getText());
					} catch (NumberFormatException ex) {
						// Al recibir el error se ejecuta una ventana que muestra el error.
						JOptionPane.showMessageDialog(calcularConversion, "Introduce un valor correcto " + ex);
						// Le damos un valor vacío para que el usuario escriba un número correcto.
						txtConversor.setText("");
					}
					// Si los valores del try-catch son correctos se continuará con el flujo del
					// programa.
					resultadoConversion = valorAConvertir * unEurosSonPesetas;
					txtResultado.setText(resultadoConversion.toString());
				}
			}
		});

		/**
		 * Mediante el botón Cambiar Divisa, se selecciona la operación a realizar. Al
		 * pulsar el botón en el actionListener se comprobará el texto del togglerButtón
		 * y se cambiará al texto de conversión de la otra divisa.
		 */
		JButton cambiarDivisa = new JButton("Cambiar Divisa");
		cambiarDivisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Selector de divisa mediante getText.
				if (calcularConversion.getText().equals("Conversion Ptas a Euros")) {
					calcularConversion.setText("Conversion Euros a Ptas");
				} else if (calcularConversion.getText().equals("Conversion Euros a Ptas")) {
					calcularConversion.setText("Conversion Ptas a Euros");
				}
			}
		});
		cambiarDivisa.setBounds(299, 38, 173, 23);
		contentPane.add(cambiarDivisa);

		/**
		 * Mediante este botón se setean los cambios a "". Es para borrar el contenido
		 * de los campos y introducir de nuevo los datos
		 */
		JButton botonReset = new JButton("Vaciar Campos");
		botonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtConversor.setText("");
				txtResultado.setText("");
			}
		});
		botonReset.setBounds(299, 72, 173, 23);
		contentPane.add(botonReset);
	}
}

  ```
 </details>
 
			

