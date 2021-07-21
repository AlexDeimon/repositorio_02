package multiThreads;

public class CLoadWithArray extends Thread {
	public CLoadWithArray() {
		this(null);
	}	
	public CLoadWithArray (String pw_Name) {
		if(pw_Name !=null)
			setName(pw_Name);
			start();
	}
	public void run() {
		final int UpperL=9;
		int[]w_Array=new int[10];
		for(int i=0;i<(UpperL+1);i++) {
			w_Array[i]=(int)(Math.random()*10);
			System.out.print(getName()+" "+i+" with priority "+getPriority()+"\r");
		}
		System.out.println();
	}
}
