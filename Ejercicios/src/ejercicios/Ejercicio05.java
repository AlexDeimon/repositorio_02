/*5) Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). 
El radio se pedir� por teclado (recuerda pasar de String a double con Double.parseDouble). 
Usa la constante PI y el m�todo pow de Math.*/
package ejercicios;
import java.util.Scanner;
public class Ejercicio05 {
	
	public static void main(String[] args) {
		try {
			Scanner objeto1=new Scanner(System.in);
			String radio;
			System.out.println("Digite radio del circulo ");
			radio=objeto1.nextLine();
			double r=Double.parseDouble(radio);
			double Area=Math.PI*Math.pow(r, 2);
			System.out.println("El Area del circulo es igual a "+Area);
			}
		catch(NumberFormatException NFE1) {
			System.err.println("Error de digitacion "+NFE1.getMessage());
			}
		}
}
