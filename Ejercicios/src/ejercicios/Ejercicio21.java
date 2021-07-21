//21) Muestra los números primos entre 1 y 100.
package ejercicios;

public class Ejercicio21 {
	public static void main(String[] args) {
		int s;
		for(s=1;s<100;s++) {
			int o=(int)Math.sqrt(s);
			int p=0;
			for (int a=o;a>1;a--) {
				if (s%a==0) {
					p++;
					}
				}
			if (p<1){
                System.out.println(s);
            }
			}
		}
}
