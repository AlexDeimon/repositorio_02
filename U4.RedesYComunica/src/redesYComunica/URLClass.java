package redesYComunica;
import java.net.URL; 
import java.net.URLEncoder; 
public class URLClass { 
    public static void main(String[] args) { 
        URLClass obj = new URLClass(); 
        try { 
            System.out.println("Constructor simple para URL principal" ); 
            obj.display( new URL("http://java.sun.com") ); 
            System.out.println("Constructor de cadena para URL + directorio" ); 
            obj.display( new URL("http://java.sun.com/docs")); 
            System.out.println("Constructor con protocolo, host y directorio" ); 
            obj.display( new URL("http","java.sun.com","/docs" ) ); 
            System.out.println("Constructor con protocolo, host, puerto y directorio" ); 
            obj.display( new URL("http","java.sun.com",80,"/docs")); 
            System.out.println("Construye una direccion absoluta a partir de la \n"+"direccion del Host y una URL relativa" ); 
            URL baseURL = new URL("http://java.sun.com/docs/index.html"); 
            obj.display( new URL( baseURL,"/docs/books/tutorial/index.html") ); 
            System.out.println("Uso de URLEncoder para crear una cadena x-www-form-url" ); 
            System.out.println( URLEncoder.encode("http://espacio .tilde~.mas+.com","ISO-8859-1" ) ); 
        } catch( Exception e ) { 
          System.out.println( e ); 
        } 
    } 
    void display( URL url ) { 
        System.out.print( url.getProtocol()+" " ); 
        System.out.print( url.getHost()+" "); 
        System.out.print( url.getPort()+" "); 
        System.out.print( url.getFile()+" "); 
        System.out.println( url.getRef()); 
        System.out.println( url.toString()); 
        System.out.println(); 
    } 
} 
// otra clase es URLCONNECTION es una clase abstracta (puede ser implementada) 
// 40 métodos (sobrecargados) 
// SOCKET 
// ServerSocket (Crear servidores), sesión virtual en un computador