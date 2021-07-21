//28) Eliminar los espacios de una frase pasada por consola por el usuario.
package ejercicios;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		System.out.println("Ingrese frase: ");
		String b=objeto1.nextLine();
		String n=b.replaceAll(" ", "");
		System.out.println("Frase sin espacios: "+n);
	}

}
