//27) Crear una aplicaci�n que nos permite insertar n�meros hasta que insertemos un -1. Calcular el numero de n�meros introducidos.
package ejercicios;
import java.util.Scanner;
public class Ejercicio27 {
	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		int c=0;
		int v=0;
		do {
			System.out.println("digite un numero diferente a -1: ");
			c=Integer.parseInt(objeto1.nextLine());
			v++;
		} while (c!=-1);
		System.out.println("se digitaron "+v+" numeros");
	}

}
