package fundamentals;

public class Serie120SC {
	int i;
	double T;
	final int KLI = 1;
	final int KLS = 5;
	Serie120SC() {
		i=KLI;
		T=0;
                System.out.println("A la salida de el constructor"); 
	}
        Serie120SC(int n, int z) {
		i=n;
		T=0;
                System.out.println("A la salida de el constructor 2"); 
	}
	double Fn_SerieT() {
		for(;i<(KLS+1);++i)
			T+=i;
		return T;
	}
	public static void main(String[] args) {
		double R;
                System.out.println("Antes de instanciar ");
		Serie120SC OSerie120SC = new Serie120SC(3, 4);
                System.out.println("Despues de instanciar");
		R=OSerie120SC.Fn_SerieT();
		System.out.println("El resultado de la serie es: " + R);
	}
}