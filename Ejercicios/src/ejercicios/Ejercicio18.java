//18) Pide por teclado dos n�mero y genera 10 n�meros aleatorios entre esos n�meros. 
//Usa el m�todo Math.random para generar un n�mero entero aleatorio (recuerda el casting de double a int).
package ejercicios;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner objeto1 = new Scanner(System.in);
		int r;
		System.out.println("Digite un numero: ");
        int w = objeto1.nextInt();
        System.out.println("Digite un numero: ");
        int e = objeto1.nextInt();
        for(int i=0;i<10;i++) {
        	r=(int)Math.floor(Math.random()*(w-e)+e);
            System.out.println(r);
        }
	}

}
