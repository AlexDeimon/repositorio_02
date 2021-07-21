package lanzaExcepciones;

public class ExcepYFinally {

	public static void main(String[] args) {
		try {
			throwException();
		}
		catch(Exception Exc) {
			System.err.println("Excepcion abierta en main");
		}
		mtd_NadaEnException();
	}
	public static void throwException() throws Exception {
		try {
			System.out.println("Metodo throwException");
			throw new Exception();
		}
		catch(Exception Exc) {
			System.err.println("Excepcion manejada en el metodo throwException");
			throw Exc;
		}
		finally {
			System.err.println("Finally ejecutado en throwException");
		}
	}
	public static void mtd_NadaEnException() {
		try {
			System.out.println("En el metodo NadaEnException");
		}
		catch(Exception Exc) {
			System.err.println(Exc);
		}
		finally {
			System.err.println("Finally en NadaEnException");
		}
		System.out.println("Fin de NadaEnException");
	}
}