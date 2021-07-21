package redesYComunica;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class DemoServidor {
	public static void main(String[] args) throws Exception {
		ObjectInputStream OIS = null;
		ObjectOutputStream OOS = null;
		Socket s=null;
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(3606);
		System.out.println("Entrando al proceso");
		while(true) {
			try {
				System.out.println("Antes de aceptar");
				s=ss.accept();
				System.out.println("conexion sonre la /IP: "+s.getInetAddress());
				OIS=new ObjectInputStream(s.getInputStream());
				OOS=new ObjectOutputStream(s.getOutputStream());
				String CadeDato=(String) OIS.readObject();
				String Saludo="Te pido conexion ("+CadeDato+")"+System.currentTimeMillis();
				OOS.writeObject(Saludo);
				System.out.println("Te doy mi conexion");	
			}catch(Exception E1) {
				E1.printStackTrace();
			}finally {
				s.close();
			}
		}
	}

}
