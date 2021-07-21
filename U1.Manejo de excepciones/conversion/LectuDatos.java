package conversion;
public class LectuDatos { 
    public static void main(String[] args) { 
        // 1. Declarar variables para los distintos tipos de datos 
        // 2. Elaborar las instrucciones para la entrada de datos de las variables definidas 
        // 3. Mostrar los datos 
        short Dato_Short = 0; 
        int Dato_Int = 0; 
        long Dato_Long = 0; 
        float Dato_Float=0; 
        double Dato_Double = 0; 
        System.out.println("Dato short"); 
        Dato_Short=EntraValiDato.Mtd_DatoShort(); 
        System.out.println("Dato short devuelto = "+Dato_Short); 
        System.out.println("Dato entero:"); 
        Dato_Int =EntraValiDato.Mtd_DatoInt(); 
        System.out.println("Dato entero devuelto = "+Dato_Int); 
        System.out.println("Dato Long:"); 
        Dato_Long =EntraValiDato.Mtd_DatoLong(); 
        System.out.println("Dato Long devuelto = "+Dato_Long); 
        System.out.println("Dato Float: "); 
        Dato_Float=EntraValiDato.Mtd_DatoFloat();
        System.out.println("Dato Float devuelto = "+Dato_Float);
        System.out.println("Dato Double: "); 
        Dato_Double=EntraValiDato.Mtd_DatoDouble();
        System.out.println("Dato Double devuelto = "+Dato_Double);
    }
} 
