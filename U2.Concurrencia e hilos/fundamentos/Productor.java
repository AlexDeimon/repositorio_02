package fundamentos;

public class Productor extends Thread{
	private Monitor buff;
	private int n;
	private int sleep;
	public Productor(Monitor m, int n, int ts){
		this.buff=m;
		this.n=n;
		sleep=ts;
	}
	public void run() {
		try {
			char c;
			int i=0;
			while(i<n) {
				c=(char)('A'+i);
				buff.Colocar(c);
				System.out.println("Caracter producido: "+c);
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
