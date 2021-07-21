package processes;

public class ProViewAsProcess {
	public static void main(String[] args){
		int[] nMuestrasTipoA = {0};
	    int[] nMuestrasTipoB = {0};
	    mtd_tomarMuestraTipoA(nMuestrasTipoA);
	    mtd_tomarMuestraTipoB(nMuestrasTipoB);
	    mtd_resultados(nMuestrasTipoA[0], nMuestrasTipoB[0]);
	}
	public static void mtd_tomarMuestraTipoA(int[] n){
		n[0] = mtd_random(10);
	    for (int i = 0; i < n[0]; i++){
	    	System.out.println("Tomando muestra de tipo A");
	    	mtd_esperar(500);
	    }
	}
	public static void mtd_tomarMuestraTipoB(int[] n){
		n[0] = mtd_random(20);
	    for (int i = 0; i < n[0]; i++){
	    	System.out.println("Tomando muestra de tipo B");
	    	mtd_esperar(500);
	    }
	}
	public static void mtd_resultados(int n, int m){
		System.out.println("Muestras de tipo A: " + n);
		System.out.println("Muestras de tipo B: " + m);
		System.out.println("Total: " + (n + m));
	}
	public static int mtd_random(int n){
	    int limiteSup = n, limiteInf = 1;
	    return (int)((limiteSup - limiteInf + 1) * Math.random() +limiteInf); // valor entre 1 y n
	}
	public static void mtd_esperar(int n){
		long timeMi = System.currentTimeMillis() + n; // milisegundos
	    while (System.currentTimeMillis() < timeMi) {  // esperar n msegs.
	    	System.out.println("timeMi = "+timeMi+", currentTimeMillis = "+System.currentTimeMillis());
	    }
	  }
}
