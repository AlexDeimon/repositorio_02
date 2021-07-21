//4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
package ejercicios;
import javax.swing.JOptionPane;
public class Ejercicio04 {
	
	public static void main(String[] args) {
		String y=JOptionPane.showInputDialog("Digita tu nombre: ");
		System.out.println("Bienvenido "+y);
	}
}
