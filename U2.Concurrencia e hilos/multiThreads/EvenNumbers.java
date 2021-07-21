package multiThreads;

import java.awt.Color;
import java.awt.Graphics;

class EvenNumbers extends Thread {
	Graphics g;
	Color backColor;
	EvenNumbers(Graphics g, Color backColor) {
		this.g=g;
		this.backColor=backColor;
	}
	public void run () {
		int i=0;
		while(i<100) {
			g.setColor(backColor);
			g.fillRect(30, 30, 100, 100);
			g.setColor(Color.black);
			g.drawString(" "+i, 80, 50);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e1) {
			}
			i=i+2;	
		}
	}
}
