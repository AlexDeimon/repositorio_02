//Recorre el String del ejercicio 22 y transforma cada car�cter a su c�digo ASCII. Muestralos en linea recta, separados por un espacio entre cada car�cter.
package ejercicios;
public class Ejercicio24 {
	public static void main(String[] args) {
		String cadena="La lluvia en Sevilla es una maravilla";
		Ascii(cadena);

	}
	public static void Ascii (String c){
        for(int i=0;i<c.length();i++){
            char v=c.charAt(i);
            int g=(int)v; 
            System.out.print(g+" ");
        }     
    }

}
