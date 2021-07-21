package fundamentos;
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProcesosEnInterfaz extends Frame {
	private static final long serialVersionUID = 1L;
	private Button b1;
	private Choice combobox;
	public ProcesosEnInterfaz() {
		setLayout(new FlowLayout());
		add(b1=new Button("Ejecutar"));
		b1.addActionListener(new EscuchaBoton());
		add(combobox=new Choice());
		combobox.addItem("Proceso 1");
		combobox.addItem("Proceso 2");
		combobox.addItem("Proceso 3");
		setSize(600,600);
		setVisible(true);
	}
	class EscuchaBoton implements ActionListener{
		public void actionPerformed(ActionEvent AE) {
			try {
				Thread.sleep(3000);
				System.out.print("Termino la ejecucuion");
			}catch(Exception E1) {
				E1.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new ProcesosEnInterfaz();
	}

}
