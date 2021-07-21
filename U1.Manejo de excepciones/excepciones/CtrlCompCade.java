package excepciones;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.PrintStream; 
public class CtrlCompCade { 
    public static void main(String[] args) { 
        String wCadeA=" ", wCadeB=""; 
        PrintStream CSalida = System.out; 
        InputStreamReader Entrada = new InputStreamReader(System.in); 
        BufferedReader Teclado = new BufferedReader(Entrada); 
        try { 
            CSalida.println("Digite la cadena A: "); 
            wCadeA=Teclado.readLine(); 
            CSalida.println("Digite la cadena B: "); 
            wCadeB=Teclado.readLine(); 
            if(wCadeA.isEmpty()&&wCadeB.isEmpty())
            	CSalida.println("Las dos cadenas estan vacias"); 
            else if(wCadeA.isEmpty()||wCadeB.isEmpty())
            	CSalida.println("Una de las dos cadenas esta vacia"); 
            if(wCadeB.trim().compareTo(wCadeA.trim())!=0) 
                CSalida.println("La cadena A es diferente de la cadena B"); 
            else 
                CSalida.println("La cadena A es igual a la cadena B"); 
            
        } 
        catch(IOException IOE1) { 
            System.err.println(IOE1.getMessage()); 
        } 
        try { 
        //    wCadeA="Valor nuevo"; 
            wCadeA=null; 
            System.out.println("En el segundo Try ..."); 
            CSalida.println(wCadeA.length()); 
        } 
        catch(NullPointerException NPE1) { 
            System.err.println("En el catch de NullPointer, el error "+NPE1.getMessage()); 
        } 
        try {
        	String sub=wCadeB.substring(2,8 );
        }
        catch(StringIndexOutOfBoundsException SIOBE1) {
        	System.err.println("Los parametros de la subcadena no es valida. error: "+SIOBE1.getMessage()); 
        }
        try {
        	String wCadeC=wCadeA.concat(wCadeB);
        	System.out.println(wCadeC);
        }
        catch(NullPointerException NPE2) {
        	System.err.println("Una de las cadenas es "+NPE2.getMessage()); 
        }
    } 
} 
/*1. Validar que las cadenas tengan contenido
2. ejercicios de manejo de cadenas (juntar, substring, usando exeption)*/