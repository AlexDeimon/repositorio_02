package fundamentos;

public class TestMonitor {
	public static void main(String[] args) {
		Monitor Moni=new Monitor(10);
		Productor Produ=new Productor(Moni, 6, 2000);
		Consumidor Consu=new Consumidor(Moni, 6, 4000);
		Produ.start();
		Consu.start();
	} 
}

