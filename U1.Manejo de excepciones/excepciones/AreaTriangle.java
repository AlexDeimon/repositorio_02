package excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class AreaTriangle {
	public static void main(String[] args) {
		String b;
		String a;
		float area;
		PrintStream Salida = System.out; 
        InputStreamReader Entrada = new InputStreamReader(System.in); 
        BufferedReader Teclado = new BufferedReader(Entrada); 
        try {
        	Salida.println("Digite la base: "); 
            b=Teclado.readLine();
            Salida.println("Digite la altura: "); 
            a=Teclado.readLine(); 
            int base = Integer.parseInt(b);
            int altura = Integer.parseInt(a);
            area=(float)(base*altura/2.0);
            Salida.println("El area del triangulo es: "+area); 
        }
        catch(IOException IOE1) { 
            System.err.println(IOE1); 
        } 
        catch(NumberFormatException NFE1) {
        	System.err.println("Valores no validos "+NFE1); 
        }
	}

}
