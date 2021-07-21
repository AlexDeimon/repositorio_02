//20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
package ejercicios;
import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		int i;
		System.out.println("Digite un numero: ");
		i=objeto1.nextInt();
		if (i<=1){
            System.out.println(i+" No es primo");
        } 
		else {
            int o=(int)Math.sqrt(i);
            int p=0;
            for (int a=o;a>1;a--) {
                if (i%a==0) {
                    p++;
                }
            }
            if (p<1){
                System.out.println(i+" es primo");
            } else {
                System.out.println(i+" no es primo");
            }
        }
	}
}
