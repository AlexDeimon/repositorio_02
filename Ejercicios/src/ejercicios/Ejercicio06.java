//6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		try {
			Scanner objeto1=new Scanner(System.in);
			int u;
			System.out.println("Digite un numero");
			u=objeto1.nextInt();
			if(u%2==0) {
				System.out.println("El numero es par");
				}
			else{
				System.out.println("El numero es impar");
				}
			}
		catch(InputMismatchException IME1) {
			System.err.println("Error de digitacion "+IME1.getMessage());
			}
		}
}
