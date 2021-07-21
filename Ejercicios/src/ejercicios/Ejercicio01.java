/*1) Declara dos variables numéricas (con el valor que desees), 
muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).*/
package ejercicios;
import java.util.Scanner;
public class Ejercicio01 {
	
	public static void main(String[] args) {
		int q;
		int w;
		Scanner objeto1=new Scanner(System.in);
		System.out.print("Digite numero 1: ");
		q=objeto1.nextInt();
		System.out.print("Digite numero 2: ");
		w=objeto1.nextInt();
		int suma=q+w;
		int resta=q-w;
		int multiplicacion=q*w;
		float division=(float)q/w;
		int modulo=q % w;
		System.out.println(q+" + "+w+" = "+suma);
		System.out.println(q+" + "+w+" = "+suma);
		System.out.println(q+" - "+w+" = "+resta);
		System.out.println(q+" * "+w+" = "+multiplicacion);
		System.out.println(q+" / "+w+" = "+division);
		System.out.println(q+" % "+w+" = "+modulo);
	}
}
