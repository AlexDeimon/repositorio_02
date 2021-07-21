package excepciones; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.PrintStream; 
public class ExcepString { 
	public static void main(String[] args) { 
		int x; 
        String wNulo = null; 
        String wCadeA, wCadeB; 
        PrintStream CSalida = System.out; 
        InputStreamReader Entrada = new InputStreamReader(System.in); 
        BufferedReader Teclado = new BufferedReader(Entrada); 
        try { 
            CSalida.println("Cadena A: "); 
            wCadeA=Teclado.readLine(); 
            CSalida.println("Cadena B: "); 
            wCadeB=Teclado.readLine(); 
            wCadeA=wCadeA.concat(wNulo); 
            CSalida.println("El resultado de A + B es: "+wCadeA); 
        } 
        catch(IOException IOE1) { 
            System.err.print(IOE1.getMessage()); 
        } 
        catch(NullPointerException NPE1) { 
            System.out.println("Apuntador invalido: "+NPE1); 
        //    System.err.print(NPE1.getMessage()); 
        } 
    } 
} 