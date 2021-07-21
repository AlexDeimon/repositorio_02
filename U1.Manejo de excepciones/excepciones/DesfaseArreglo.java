package excepciones;
import java.util.Scanner;
public class DesfaseArreglo { 
    public static void main(String[] args) { 
    	int vector[]=new int [10];
    	int i=0;
    	int l=0;
    	Scanner objeto1=new Scanner(System.in);
    	try {
			System.out.println("Longitud del vector (maximo 10): ");
			l=objeto1.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException AIOBE1) {
			System.err.println("Longitud no valida "+AIOBE1); 
		}
		do {
    		vector[i]=(int) (Math.random() * 10);
			System.out.print("\t"+vector[i]);
			i=i+1;
			}while(i<l);
			System.out.println("");
		}
    
} 
    
		


/*1. Cargar un arreglo de manera aleatoria y ordenarlo con funciones 
2. Verificar si un arreglo que se digita es palindromo 
En cualquier caso utilizar excepciones. */
