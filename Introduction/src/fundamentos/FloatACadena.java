package fundamentos;

public class FloatACadena {

	public static void main(String[] args) {
		float F= (float) 5.0;
		String cadena = String.valueOf(F); 
		cadena = Float.toString(F);
		System.out.println("El flotante F en terminos de cadena es "+cadena);
	}

}
