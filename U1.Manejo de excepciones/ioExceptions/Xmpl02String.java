package ioExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Xmpl02String {

    public static void main(String[] args) {
        String wCadeA, wCadeB, wCadeC;
        int wLA;
        PrintStream CSalida = System.out;
        InputStreamReader Entrada = new InputStreamReader(System.in);
        BufferedReader Teclado = new BufferedReader(Entrada);
        try{
        	CSalida.println("Cadena de caracteres A: ");
        	wCadeA=Teclado.readLine();
        	wLA=wCadeA.length();
        	CSalida.println("Cadena de caracteres B: ");
        	wCadeB=Teclado.readLine();
        	wCadeA=wCadeA.concat(wCadeB);
        	CSalida.println("Ahora, la cadena A + B en A es: "+wCadeA);
        	wCadeC=wCadeA.substring(wLA).trim();
        	CSalida.println("\n"+wCadeC);
        } catch(IOException e1){
            System.err.println(e1.getMessage());
        }
    }   
}

// 1. Verificar si la cadena A es palíndrome
// 2. Validar si las dos cadenas son iguales