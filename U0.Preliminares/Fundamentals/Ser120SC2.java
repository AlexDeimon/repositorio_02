package fundamentals;

public class Ser120SC2 {
    int i;
	double T;
	final int KLI = 1;
//	final int KLS = 5;
        int KLS = 5;
    Ser120SC2() {
		i=KLI;
		T=0;
                System.out.println("A la salida de el constructor"); 
	}
    Ser120SC2(int n, int z) {
                KLS=z;
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
        double R, W;
        int k, l;
        System.out.println("Antes de instanciar ");
        Ser120SC2 O1Ser120SC2 = new Ser120SC2();
        R=O1Ser120SC2.Fn_SerieT();
        System.out.println("El resultado de la serie de Objeto 1 es: " + R);
        k=(int)(Math.random()*10)+1;
        l=(int)(Math.random()*10)+1;
        Ser120SC2 O2Ser120SC2 = new Ser120SC2(k, l);
        System.out.println("Despues de instanciar");
        W=O2Ser120SC2.Fn_SerieT();
        System.out.println("El resultado de la serie de Objeto 2 es: " + W);
        if(R==W)
            System.out.println("El resultados iguales: ");
        else
            if(R<W)
                System.out.println("R < W");
            else
                System.out.println("R > W");
    }
}