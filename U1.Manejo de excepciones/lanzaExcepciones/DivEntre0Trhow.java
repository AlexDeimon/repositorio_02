package lanzaExcepciones;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DivEntre0Trhow extends JFrame
	implements ActionListener {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField CampoEntraNume, CampoEntraDeno, CampoCocien;
	private int Numerador, Denominador, result, result2;
	public static void main( String args[] ){
		DivEntre0Trhow application = new DivEntre0Trhow();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	public DivEntre0Trhow() {
		super( "Demonstrating Exceptions" );
		Container container = getContentPane();
		container.setLayout( new GridLayout( 4, 2 ) );
		container.add(new JLabel( "Digite el numerador ", SwingConstants.RIGHT ) );
		CampoEntraNume = new JTextField();
		container.add( CampoEntraNume );
		container.add( new JLabel( "Digite numerador y presione Enter ", SwingConstants.RIGHT));
		CampoEntraDeno = new JTextField();
		container.add( CampoEntraDeno );
		CampoEntraDeno.addActionListener( this );
		container.add( new JLabel( "RESULTADO", SwingConstants.RIGHT ) );
		CampoCocien = new JTextField();
		container.add( CampoCocien );
		Button Comprobar = new Button("COMPROBAR");
 		container.add(Comprobar,SwingConstants.RIGHT);
 		container.add(Comprobar);
		setSize( 425, 100 );
		setVisible( true );
		Comprobar.addActionListener(
	 			new ActionListener(){
	 				public void actionPerformed(ActionEvent e) {
	 					if(Numerador/Denominador==result) {
	 						CampoCocien.setText( String.valueOf( result ) );
	 					}
	 					else 
	 						CampoCocien.setText("Error de calculo");
	 					}
	 				});
	}
	public void actionPerformed( ActionEvent event ){
		CampoCocien.setText( " " );  
		try { 
			Numerador = Integer.parseInt( CampoEntraNume.getText() );
			Denominador = Integer.parseInt( CampoEntraDeno.getText() );
			result = Cociente( Numerador, Denominador );
			CampoCocien.setText( String.valueOf( result ) );
		}
		catch ( NumberFormatException numberFormatException ) {
			JOptionPane.showMessageDialog( this, "Debe ingresar dos valores enteros", "Formato invalidado",
			JOptionPane.ERROR_MESSAGE );
		}
		catch ( ArithmeticException arithmeticException ) {
			JOptionPane.showMessageDialog( this, arithmeticException.toString(), "Arithmetic Exception",
					JOptionPane.ERROR_MESSAGE );
      }
	}
	public int Cociente( int numerador, int denominador ) throws ArithmeticException{
		return numerador / denominador;
	}
	
}
