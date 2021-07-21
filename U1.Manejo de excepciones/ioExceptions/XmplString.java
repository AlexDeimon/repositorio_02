package ioExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class XmplString {

	    public static void main(String[] args) {
	        String wCadeA, wCadeB;
	        PrintStream CSalida = System.out;
	        InputStreamReader Entrada = new InputStreamReader(System.in);
	        BufferedReader Teclado = new BufferedReader(Entrada);
	        try{
	          CSalida.println("Cadena de caracteres A: ");
	          wCadeA=Teclado.readLine();
	          CSalida.println("Cadena de caracteres B: ");
	          wCadeB=Teclado.readLine();
	          wCadeA=wCadeA.concat(wCadeB);
	          CSalida.println("Ahora, la cadena A + B en A es: "+wCadeA);
	        } catch(IOException e1){
	            System.err.println(e1.getMessage());
	        }
	    }    
	}

	// 1. Evaluar la longitud de las cadenas digitadas y validar la ejecución 
	// 2. Evaluar las cadenas para determinar la mayor de ellas (lexicográficamente)
	// 3. Invertir las cadenas y mostrar el resultado
