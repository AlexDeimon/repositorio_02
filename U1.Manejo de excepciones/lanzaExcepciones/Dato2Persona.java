package lanzaExcepciones;

public class Dato2Persona {

	public static void main(String[] args) {
		try {
			Persona persona = new Persona();
			persona.setEdad(-10);
		}
		catch(RuntimeException REx) {
			System.out.println(REx.getMessage());
		}
	}
}
