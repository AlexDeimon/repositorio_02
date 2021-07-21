package conversion; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class EntraValiDato { 
    // 1. Declarar la variable sobre la cual se entran los datos 
    // 2. Instanciar el objeto InputStreamReader para la entrada de datos 
    // 2. Instancia la fuente de entrada de datos 
    // 3. Elaborar el código de validación 
    public static String Mtd_Captura() { 
        String sDatos=""; 
        try { 
            InputStreamReader ISR = new InputStreamReader(System.in); 
            BufferedReader BR = new BufferedReader(ISR); 
            sDatos=BR.readLine(); 
        } catch(IOException IOE1) { 
            System.err.println("Error: "+IOE1.getMessage()); 
        } 
        return sDatos; 
    } 
    public static short Mtd_DatoShort() { 
        try { 
            return Short.parseShort(Mtd_Captura()); 
        } catch(NumberFormatException NFE) { 
            return Short.MIN_VALUE; 
        } 
    } 
    public static int Mtd_DatoInt() { 
        try { 
            return Integer.parseInt(Mtd_Captura()); 
        } catch(NumberFormatException NFE) { 
            return Integer.MIN_VALUE; 
        } 
    } 
    public static long Mtd_DatoLong() {
    	try {
    		return Long.parseLong(Mtd_Captura());
    	}
    	catch(NumberFormatException NFE) {
    		return Long.MIN_VALUE;
    	}
    }
    public static float Mtd_DatoFloat() {
    	try {
    		return Float.parseFloat(Mtd_Captura());
    	}
    	catch(NumberFormatException NFE) {
    		return Float.MIN_VALUE;
    	}
    }
    public static double Mtd_DatoDouble() {
    	try {
    		return Double.parseDouble(Mtd_Captura());
    	}
    	catch(NumberFormatException NFE) {
    		return Double.MIN_VALUE;
    	}
    }
    }
 
