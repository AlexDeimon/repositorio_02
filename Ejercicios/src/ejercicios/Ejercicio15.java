//15) Lee un n�mero por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volver� a pedir (do while), despu�s muestra ese n�mero por consola.
package ejercicios;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int c=0;
		Scanner objeto01=new Scanner(System.in);
		do {
			System.out.println("Digite un numero: ");
			c=objeto01.nextInt();
			}while (c<0);
	}

}
