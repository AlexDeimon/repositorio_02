//13) Realiza una aplicación que nos pida un número de ventas a introducir, 
//después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
package ejercicios;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		int h;
		int j;
		int k;
		int l=0;
		Scanner objeto1=new Scanner(System.in);
		System.out.println("Digite Numero de ventas: ");
		h=objeto1.nextInt();
		for(j=1;j<=h;j++) {
			System.out.println("Digite precio de la venta " +j+ ":");
			k=objeto1.nextInt();
			l=l+k;
		}
		System.out.print("El total de ventas fue: "+l);
		
		

	}

}
