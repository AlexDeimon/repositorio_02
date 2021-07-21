package arrayExceptions;

import java.awt.Graphics;

public class ExcepWithApplet {
	private int i=0;
	private String greetings[]= {
		"Hello World !!", "HELLO World !!", "HELLO WORLD !!"
	};
	public void paint(Graphics g) {
		try {
			while(i<4) {
				g.drawString(greetings[i], (25+i*20), (25+i*20));
				i++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("in ArrayIndex... "+e.toString());
			g.drawString("greetings overflowed", (25+i*30), (25+i*30));
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("this is always printed");
		}
	}
}

// 1. Incluir un arreglo de contenido numérico,cargarlo de manera aleatoria,
//    mostrar el contenido de cada posición en una ventana y controlar
//    el desbordamiento en caso dado.
