//14) Realiza una aplicaci�n que nos calcule una ecuaci�n de segundo grado. 
//Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operaci�n en la ra�z cuadrada). 
//Para la ra�z cuadrada usa el m�todo sqlrt de Math. Te recomiendo que uses mensajes de traza.
package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		Scanner objeto01=new Scanner(System.in);
		System.out.print("Digite variable a: ");
		a=objeto01.nextInt();
		System.out.print("Digite variable b: ");
		b=objeto01.nextInt();
		System.out.print("Digite variable c: ");
		c=objeto01.nextInt();
		double �=(Math.pow(b, 2))-(4*a*c);
		System.out.println(�);
        if (�>0){
            double z=((b*(-1))+Math.sqrt(�))/(2*a);
            double x=((b*(-1))-Math.sqrt(�))/(2*a);
  
            System.out.println("El valor de x1 es "+z+" y el valor de x2 es "+x);
        }else{
            System.out.println("El discriminante es negativo");
        }
	}

}
