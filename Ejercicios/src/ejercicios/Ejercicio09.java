//9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
//y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
package ejercicios;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		float p;
		float a=(float)0.21;
		System.out.println("Digite el precio del producto: ");
		p=objeto1.nextFloat();
		float s=(float)(p+(p*a));
		System.out.println("Precio del producto mas 21% de IVA: "+s);
	}

}
