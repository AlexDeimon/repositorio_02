package ArithmeticExceptions;

public class DivideByZero {
	public static void main(String[] args){		
		try {  
		    //code that may raise exception  
			int data=100/0;  	
		} catch(ArithmeticException e){
			System.out.println(e);
		}  
		System.out.println("rest of the code...");  
	}  
}
// 1. Elaborar un programa que calcule:
//    1.1. el área de un triangulo, de un rectángulo, de un círculo, 
//         de un trapecio, de un paralelogramo
//    1.2. el volumen de un prisma rectangular, de una esfera, 
//         de un cilindro, de un cono
// Para cada caso, controlar el error por medio de excepciones
// de entrada y de cálculo