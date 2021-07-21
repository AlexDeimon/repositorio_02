//12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
package ejercicios;

public class Ejercicio12 {

	public static void main(String[] args) {
		int g=1;
		System.out.println(g);
		for(g=1;g<101;g++){
			if(g%2==0 && g%3==0)
				System.out.println(g);
		}
		g=100;
		System.out.println(g);
	}

}
