package withRunnable;

public class OneWithRunnable implements Runnable {
	Thread t01;
	String nameOfThread;
	public OneWithRunnable() {
		nameOfThread="thread one";
		t01=new Thread(this, "thread one de t01");
		t01.start();
	}
	public OneWithRunnable(String nameOfThread) {
		this.nameOfThread=nameOfThread;
		t01=new Thread(this, "thread two");
		t01.start();
	}
	public void run() {	
		try {
			for(int i=0; i<101; i++)
				System.out.println(t01.getName()+
						", Valor de i: "+i);
			Thread.sleep(50);
		} catch(InterruptedException e1) {
		}
	}
}
