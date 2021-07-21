//17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
package ejercicios;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner objeto1 = new Scanner(System.in);
        
        System.out.println("Digite un dia de la semana");
        String q = objeto1.nextLine();
        switch(q){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Dia festivo");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
	}

}
