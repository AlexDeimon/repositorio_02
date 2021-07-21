package redesYComunica;
import java.util.Scanner;
import java.net.InetAddress; 
import java.net.UnknownHostException; 
public class CInetAddress { 
    public static void main(String[] args) { 
    	Scanner objeto1=new Scanner(System.in);
        try { 
            System.out.println("-> Direccion IP de una URL, por nombre: " ); 
            InetAddress address =InetAddress.getByName(objeto1.nextLine()); 
//            InetAddress.getByName( "java.sun.com" ); 
//            InetAddress.getByName( "microsoft.com" ); 
            System.out.println( address ); 
            System.out.println("-> Nombre a partir de la direccion" ); 
            int temp = address.toString().indexOf( '/' ); 
            address = InetAddress.getByName( 
            address.toString().substring(temp+1) ); 
            System.out.println(address); 
            System.out.println("-> Direccion IP actual de LocalHost" ); 
            address = InetAddress.getLocalHost(); 
            System.out.println( address ); 
            System.out.println("-> Nombre de LocalHost a partir de la direccion" ); 
            temp = address.toString().indexOf( '/' ); 
            address = InetAddress.getByName( 
            address.toString().substring(temp+1) ); 
            System.out.println( address ); 
            System.out.println("-> Nombre actual de LocalHost" ); 
            System.out.println(address.getHostName()); 
            System.out.println("-> Direccion IP actual de LocalHost" ); 
            byte[] bytes = address.getAddress(); 
            for( int cnt=0; cnt < bytes.length; cnt++ ) { 
                int uByte = bytes[cnt] < 0 ? bytes[cnt]+256 : bytes[cnt]; 
                System.out.print( uByte+" " ); 
        } 
        System.out.println(); 
        } catch( UnknownHostException e ) { 
            System.out.println( e ); 
            System.out.println("No se encontró conexión a internet" ); 
        } 
    } 
}