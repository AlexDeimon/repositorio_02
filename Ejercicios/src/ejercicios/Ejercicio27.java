//27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.
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
