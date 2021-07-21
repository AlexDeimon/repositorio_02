//25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), 
//según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
package ejercicios;
import java.util.Scanner;
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner objeto1=new Scanner(System.in);
		System.out.print("Digite primer numero: ");
		double h=Double.parseDouble(objeto1.nextLine());
		System.out.print("Digite segundo numero: ");
		double j=Double.parseDouble(objeto1.nextLine());
		System.out.print("Digite la operacion que desea: ");
		String k=objeto1.nextLine();
		double l=0;
		switch (k){
			case "+":l=h+j;break;
			case "-":;l=h-j;break;
			case "*":l=h*j;break;
			case "/":l=h/j;break;
			case "^":l=(int)Math.pow(h, j);break;
			case "%":l=h%j;break;
			}
		System.out.print("resultado: "+l);
	}

}
