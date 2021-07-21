package fundamentos;

public class Consumidor extends Thread{
	private Monitor buff;
	private int n;
	private int sleep;
	public Consumidor(Monitor buff, int n, int sleep) {
		this.buff=buff;
		this.n=n;
		this.sleep=sleep;
	}
	public void run() {
		try {
			char c;
			int i=0;
			while(i<n) {
				c=buff.sacarI();
				System.out.println("Caracter consumido: "+c);
				sleep((int)(Math.random()*sleep));
				i++;
			}
		}
		catch(Exception E1) {
			E1.printStackTrace();
			throw new RuntimeException(E1);
		}
	}
}
