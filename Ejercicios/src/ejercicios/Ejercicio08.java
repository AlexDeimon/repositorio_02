//8) Modifica el ejercicio anterior, para que en lugar de pedir un n�mero, pida un car�cter (char) y muestre su c�digo en la tabla ASCII.
package ejercicios;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		char o;
		Scanner objeto1=new Scanner(System.in);
		System.out.println("Digite un caracter");
		o=objeto1.next().charAt(0);
		int ascii = (int) o;
		System.out.println("caracter\tascii");
	    System.out.println(o+"\t\t"+ ascii);

	}

}
