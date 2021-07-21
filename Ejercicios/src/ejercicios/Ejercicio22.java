//22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
package ejercicios;

public class Ejercicio22 {

	public static void main(String[] args) {
		String cadena="La lluvia en Sevilla es una maravilla";
		int d=0;
		for(int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'|| cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u') {
				d++;
			}
		}
		System.out.print("cantidad de vocales en la cadena es: "+d);
	}

}
