package lanzaExcepciones;

public class Persona {
	private int Edad;
//	private int estatura=2;
	public int getEdad() {
		return this.Edad;
	}
	public void setEdad(int Edad) {
		if(Edad<1)
			throw new RuntimeException("La edad deber ser mayor que cero");
		this.Edad=Edad;
		System.out.println("Edad colocada: "+this.Edad);
//		System.out.println("la persona tiene estatura = "+this.estatura);
	}
}
