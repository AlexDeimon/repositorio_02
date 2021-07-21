package excepciones;
import java.util.Scanner;
public class DivisionEntre0 {
	static int base01=(int) (Math.random() * 10);
	static int altura=(int) (Math.random() * 10);
	static int radio=(int) (Math.random() * 10);
	static int base02=(int) (Math.random() * 10);
	static int largo=(int) (Math.random() * 10);
	static int ancho=(int) (Math.random() * 10);
	public static void main(String[] args) {
		int now;
		Scanner objeto1=new Scanner(System.in);
		do{
            System.out.println("1. Area Triangulo");
            System.out.println("2. Area Rectangulo");
            System.out.println("3. Area Circulo");
            System.out.println("4. Area Trapecio");
            System.out.println("5. Area Paralelogramo");
            System.out.println("6. Volumen Prisma Rectangular");
            System.out.println("7. Volumen Esfera");
            System.out.println("8. Volumen Cilindro");
            System.out.println("9. Volumen Cono");
            System.out.println("10. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now=objeto1.nextInt();
            if(now>=1&& now<11){
            	switch(now){
                    case 1:Triangulo();break;
                    case 2:Rectangulo();break;
                    case 3:Circulo();break;
                    case 4:Trapecio();break;
                    case 5:Paralelogramo();break;
                    case 6:PrismaRectangular();break;
                    case 7:Esfera();break;
                    case 8:Cilindro();break;
                    case 9:Cono();break;
                    case 10:System.out.println("EL PROGRAMA HA TERMINADO");
                    }
            	}else
                System.out.println(now+" NO ES UN VALOR ENTRE 1 Y 10" );
            }while(now!=10);
	}
	public static void Triangulo(){
		try {
			double triangulo=(((base01)*(altura))*0.5);
			System.out.println("El Area del Triangulo con base: "+base01+" y altura: "+altura+ " es igual a "+triangulo+"\n");
			}
		catch(ArithmeticException AE1) {
			if((((base01)*(altura))*0.5)==0) 
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Rectangulo() {
		try {
			double rectangulo=((base01)*(altura));
			System.out.println("El Area del Rectangulo con base: "+base01+" y altura: "+altura+ " es igual a "+rectangulo+"\n");
			}
		catch(ArithmeticException AE1) {
			if(((base01)*(altura))==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Circulo() {
		try {
			double circulo=(Math.PI)*(Math.pow(radio, 2));
			System.out.println("El Area del Circulo con radio "+ radio +" es igual a "+ circulo+"\n");
		}
		catch(ArithmeticException AE1) {
			if((Math.PI)*(Math.pow(radio, 2))==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Trapecio() {
		try {
			double trapecio=(((base01)+(base02))*0.5)*(altura);
			System.out.println("El Area del trapecio con base 1: "+ base01 +", base 2: "+ base02+" y altura: "+altura +" es igual a "+ trapecio+"\n");
		}
		catch(ArithmeticException AE1) {
			if((((base01)+(base02))*0.5)*(altura)==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Paralelogramo() {
		try {
			double paralelogramo=((base01)*(altura));
			System.out.println("El Area del Paralelogramo con base: "+base01+" y altura: "+altura+ " es igual a "+paralelogramo+"\n");
		}
		catch(ArithmeticException AE1) {
			if(((base01)*(altura))==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void PrismaRectangular() {
		try {
			double prismarectangular=ancho*largo*altura;
			System.out.println("El Volumen del prisma rectangular con ancho: "+ancho+", largo: "+largo+" y altura: "+altura+ " es igual a "+prismarectangular+"\n");
		}
		catch(ArithmeticException AE1) {
			if(ancho*largo*altura==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Esfera() {
		try {
			double esfera=(4*(Math.PI)*(Math.pow(radio, 3)))/3;
			System.out.println("El Volumen de una esfera de radio: "+radio+" es igual a "+esfera+"\n");			
		}
		catch(ArithmeticException AE1) {
			if((4*(Math.PI)*(Math.pow(radio, 3)))/3==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Cilindro() {
		try {
			double Cilindro=Math.PI*((Math.pow(radio,2)))*altura;
			System.out.println("El volumen del cilindro de radio: "+radio+", y altura "+altura+ " es igual a "+Cilindro+"\n");
		}
		catch(ArithmeticException AE1) {
			if(Math.PI*((Math.pow(radio,2)))*altura==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}
	public static void Cono() {
		try {
			double Cono=(Math.PI*((Math.pow(radio,2)))*altura)/3;
			System.out.println("El volumen del cono de radio: "+radio+", y altura "+altura+ " es igual a "+Cono+"\n");
		}
		catch(ArithmeticException AE1) {
			if((Math.PI*((Math.pow(radio,2)))*altura)/3==0)
			System.err.println("Error matematico "+AE1.getMessage());
		}
	}

}
//1. el área de un triangulo, de un rectángulo, de un círculo,
//de un trapecio, de un paralelogramo
//2.. el volumen de un prisma rectangular, de una esfera,
//de un cilindro, de un cono
//Para cada caso, controlar el error por medio de excepciones
//de entrada y de cálculo