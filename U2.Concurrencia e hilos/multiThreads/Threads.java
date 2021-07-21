package multiThreads;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Threads extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	static Color backColor;
	JLabel my1Label = new JLabel("dato 1");
	JLabel my2Label = new JLabel("dato 2");
	JTextField my1Text = new JTextField(5);
	JTextField my2Text = new JTextField(5);
	JButton myButton = new JButton("Calc Sum");
	JLabel result = new JLabel();
	Threads (String name){
		super(name);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(my1Label);
		getContentPane().add(my1Text);
		getContentPane().add(my2Label);
		getContentPane().add(my2Text);
		getContentPane().add(result);
		getContentPane().add(myButton);
		backColor=getBackground();
		ActionListener myHears = new ActionListener(){
			public void actionPerformed(ActionEvent e1) {
				String temp = my1Text.getText();
				String temp1 = my2Text.getText();
				double d1 = Double.parseDouble(temp);
				double d2 = Double.parseDouble(temp1);
				double tot = d1 + d2;
				result.setText("total = "+tot);
			} //actionPerformed
		}; //ActionListener
		myButton.addActionListener(myHears);
	}	
	public static void main(String[] cmdLine) {
		Threads frame = new Threads("Sum of two numbers");
		WindowAdapter myHears = new WindowAdapter(){
			public void windowClosing(WindowEvent e1) {
				System.exit(0);
			}
		};
		System.out.println("main ... antes de frame.addWindowListener ...");
		frame.addWindowListener(myHears);
		frame.setSize(600, 300);
		frame.setVisible(true);
		Graphics g=frame.getContentPane().getGraphics();
		OddNumbers oddNumbers = new OddNumbers(g, backColor);
		EvenNumbers evenNumbers = new EvenNumbers(g, backColor);
		Circle circle = new Circle(g, backColor);
		System.out.println("main... antes de oddNumbers.run()");
		oddNumbers.run();
		System.out.println("main... antes de evenNumbers.run()");
		evenNumbers.run();
		System.out.println("main... antes de circle.run()");
		circle.run();
	}
}
