//26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
package ejercicios;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		System.out.println("Inserte un numero mayor que 1: ");
		int ñ=Integer.parseInt(objeto1.nextLine());
		int z=0;
		int x=1;
		if(ñ>1) {
			while(x<=ñ) {
				z+=x;
				x++;
			}
			System.out.println("la sumatoria del 1 hasta "+ñ+" es= "+z);
		}else
			System.out.println("El numero debe ser mayor a 1 ");
		
	}

}
