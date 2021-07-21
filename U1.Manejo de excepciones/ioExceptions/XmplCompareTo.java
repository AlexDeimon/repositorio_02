package ioExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class XmplCompareTo {

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
        	if(wCadeB.trim().compareTo(wCadeA.trim())!=0)
                CSalida.println("Las cadenas son diferentes");
            else
                CSalida.println("Las cadenas son iguales");
        } catch(IOException e1){
            System.err.println(e1.getMessage());
        }
        try {
        	wCadeA="Algo";
        	System.out.println("En el segundo try...");
        	System.out.println(wCadeA.length());
    	} catch(NullPointerException e2) {
    		System.err.println("En el NullPointer"+e2.getMessage());
    	}
	}    	
}   
// 1. Validar que las cadenas tengan contenido
// 2. Generar una entrada a la segunda excepción
// 3. Si las cadenas son iguales, concatenar B a A, si son diferentes
//    reemplazar A con B