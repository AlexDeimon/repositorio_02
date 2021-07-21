//29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar la cadena resultante
package ejercicios;
import java.util.Scanner;
public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		String m="";
		String q="";
		do{
			System.out.println("Digite frase: ");
			m=objeto1.nextLine();
			q+=m;
		}while(!m.isEmpty());
		System.out.println("cadena resultante= "+q);
	}

}
