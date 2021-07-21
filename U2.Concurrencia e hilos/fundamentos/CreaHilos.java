package fundamentos;

class CreaHilos {

	public static void main(String[] args) {
		DefineHilo Hilo1=new DefineHilo("Hilo 1");
		DefineHilo Hilo2=new DefineHilo("Hilo 2");
		DefineHilo Hilo3=new DefineHilo("Hilo 3");
		System.out.println("Arrancando los hilos");
		Hilo1.start();
		Hilo2.start();
		Hilo3.start();
		System.out.println("Fin de los inicios de ejecucion");
		
	}

}

class DefineHilo extends Thread{
	private int TiempoSleep;
	public DefineHilo(String nombre) {
		super(nombre);
		TiempoSleep=(int)(Math.random()*2001);
	}
	public void run() {
		try {
			System.out.println(getName()+" en sleep para "+TiempoSleep+" unidades de tiempo");
			Thread.sleep(TiempoSleep);
		}
		catch(InterruptedException IE1) {
			IE1.printStackTrace();
		}
		System.out.println(getName()+ " ha finalizado");
	}
}