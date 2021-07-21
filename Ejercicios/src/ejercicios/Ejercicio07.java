/*7) Lee un número por teclado y muestra por consola,
el carácter al que pertenece en la tabla ASCII.
Por ejemplo: si introduzco un 97, me muestre una a.*/
package ejercicios;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
	int i=0;
	Scanner objeto1=new Scanner(System.in);
	System.out.println("Digite un numero del  al 255");
	i=objeto1.nextInt();
	char ascii = (char) i;
	System.out.println("numero\tascii");
    System.out.println(i+"\t"+ ascii);

	}

}
