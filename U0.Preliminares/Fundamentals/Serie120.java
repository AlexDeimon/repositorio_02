package fundamentals;

class Serie120 {
	int i;
	double T;
	final int KLI = 1;
	final int KLS = 20;
	Serie120() {
		i=KLI;
		T=0;
	}
	double Fn_SerieT() {
		for(;i<(KLS+1);++i)
			T+=i;
		return T;
	}
	public static void main(String[] args) {
		double R;
		Serie120 OSerie120 = new Serie120();
		R=OSerie120.Fn_SerieT();
		System.out.println("El resultado de la serie es: " + R);
	}
}
