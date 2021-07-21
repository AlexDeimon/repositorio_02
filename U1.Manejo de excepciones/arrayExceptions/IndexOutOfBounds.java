package arrayExceptions;

public class IndexOutOfBounds {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];  
			a[10]=50; //  
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("\nFuera de rango... "+e1.getMessage());
		}
	}
}

// 1. Cargar un arreglo de 10 posiciones de manera aleatoria, y ordenarlo
//    de forma ascendente, utilizar rutinas específicas para cada caso.
// 2. Cargar un arreglo de 10 posiciones de manera aleatoria y validar si el
//    arreglo es palíndromo.
