package multiThreads;

import java.awt.Color;
import java.awt.Graphics;

class OddNumbers extends Thread {
	Graphics g;
	Color backColor;
	OddNumbers(Graphics g, Color backColor) {
		this.g=g;
		this.backColor=backColor;
	}
	public void run() {
		int i=1;
		System.out.println("oddNumbers ... antes del while de run()");
		while(i<100) {
			System.out.println("oddNumbers dentro del while");
			g.setColor(backColor);
			g.fillRect(30, 150, 100, 100);
			System.out.println("oddNumbers dentro del while... antes de g.setColor ...");
			g.setColor(Color.black);
			g.drawString(" "+i, 80, 170);
			System.out.println("oddNumbers dentro del while... antes del try");
			try {
				System.out.println("oddNumbers dentro del try ...");
				Thread.sleep(100);
			}
			catch(InterruptedException e1) {
			}
			i=i+2;
		}
	}
}
