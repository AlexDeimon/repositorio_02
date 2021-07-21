/*2) Declara 2 variables numéricas (con el valor que desees),
he indica cual es mayor de los dos. Si son iguales indicarlo también. 
Ves cambiando los valores para comprobar que funciona.*/
package ejercicios;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		int e;
		int r;
		Scanner objeto1=new Scanner(System.in);
		System.out.print("Digite numero 1: ");
		e=objeto1.nextInt();
		System.out.print("Digite numero 2: ");
		r=objeto1.nextInt();
		if(e>r) {
			System.out.println(e+" es mayor que "+r);
		}
		else if(r>e) {
			System.out.println(r+" es mayor que "+e);
		}
		else if(e==r) {
			System.out.println(e+" es igual que "+r);
		}
	}

}
