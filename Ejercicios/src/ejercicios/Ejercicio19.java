//19) Pide por teclado un número entero positivo (debemos controlarlo) 
//y muestra  el número de cifras que tiene. Por ejemplo: 
//si introducimos 1250, nos muestre que tiene 4 cifras. 
//Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
package ejercicios;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		int t;
		System.out.println("Digite un numero entero: ");
		t=objeto1.nextInt();
		String y=Integer.toString(t);
		int u=y.length();
		System.out.print("el numero "+t+" tiene "+u+" cifras");
	}

}
