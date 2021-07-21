//23. Reemplaza todas las a del String del ejercicio 22 por una e.
package ejercicios;

public class Ejercicio23 {
	public static void main(String[] args) {
		String cadena="La lluvia en Sevilla es una maravilla";
		String cadena2=cadena.replace('a', 'e');
		System.out.print(cadena2);
	}
}
