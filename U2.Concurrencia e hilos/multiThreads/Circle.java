package multiThreads;

import java.awt.Color;
import java.awt.Graphics;

class Circle extends Thread {
	Graphics g;
	Color backColor;
	Circle(Graphics g, Color backColor) {
		this.g=g;
		this.backColor=backColor;	
	}
	public void run() {
		int i=200, d=1;
		while(true) {
			System.out.println("Circle... antes de g.setColor(Color.black)");
			g.setColor(Color.black);
			g.drawOval(i, 200, 10, 10);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e1) {
			}
			g.setColor(backColor);
			g.drawOval(i, 200, 10, 10);
			i=i+d;
			if(i==400)
				d=-1;
			if(i==200)
				d=1;
		}
	}
}
