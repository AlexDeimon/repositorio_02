package fundamentos;

public class ProceStack {

	public static void main(String[] args) {
		int [] nMuestrasTipoA= {0};
		int [] nMuestrasTipoB= {0};
		//int nMuestrasTipoA;
		//int nMuestrasTipoB;
		mtd_TomarMuestraTipoA(nMuestrasTipoA);
		mtd_TomarMuestraTipoB(nMuestrasTipoB);
		mtd_resultados(nMuestrasTipoA[0],nMuestrasTipoB[0]);
	}
	public static void mtd_TomarMuestraTipoA(int[] n) {
		n[0]=mtd_random(10);
		for(int i=0; i<n[0];i++) {
			System.out.println("Tomando muestras tipo A");
			mtd_esperar(200);
		}
	}
	public static void mtd_TomarMuestraTipoB(int[] n) {
		n[0]=mtd_random(10);
		for(int i=0; i<n[0];i++) {
			System.out.println("Tomando muestras tipo B");
			mtd_esperar(200);
		}
	}
	public static int mtd_random(int n) {
		int limtInf=1, limitSup=n;
		return (int)((limitSup-limtInf+1)*Math.random()+limtInf);
	}
	public static void mtd_esperar(int n) {
		long tiempoMil=System.currentTimeMillis()+n;
		while(System.currentTimeMillis()<tiempoMil) {
		}
	} 
	public static void mtd_resultados(int n, int m) {
		System.out.println("Muestras de tipo A: "+n);
		System.out.println("Muestras de tipo B: "+m);
		System.out.println("Total: "+(n+m));
	}
}

//simular round robin