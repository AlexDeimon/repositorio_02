/*Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. 
Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. 
Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. 
Piensa bien en la condici�n de salida (3 intentos y si acierta sale, aunque le queden intentos).*/
package ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		String v="Programacion2";
		String b;
		Boolean n=false;
		int m=3;
		do{
			System.out.print("Digite la contrase�a: ");
			b=objeto1.nextLine();
			m-=1;
			if(v.equals(b)) {
				System.out.print("Enhorabuena");
				n=true;
			}
			else
				System.out.println("Contrase�a incorrecta. Quedan "+m+" intentos");
		}while(m>=1 && n==false);
		if(m==0 && n==false)
			System.out.println("No m�s intentos");

	}

}
