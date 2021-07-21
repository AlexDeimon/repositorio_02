package excepciones;
import java.io.IOException;
import java.io.FileReader;
public class ExceptionApp {
 
    public static void main(String[] args) {
 
        try{
 
            prueba();
 
            //Esta linea no se ejecuta
            System.out.println("No veras este mensaje");
 
        }catch(IOException e){
            System.out.println("Error E/S: el fichero no existe "+e);
        }
 
    }
    public static void prueba() throws IOException{
 
        //Lanzara una excepcion, pero se lanza en el try-catch del main
        FileReader fr=new FileReader("casa");
 
    }
 
}
