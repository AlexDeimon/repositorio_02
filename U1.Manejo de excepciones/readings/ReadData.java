package readings;

public class ReadData {
		public static void main(String[] args){
			short data_short = 0;
		    int data_int = 0;
		    long data_long = 0;
		    float data_float = 0;
		    double data_double = 0;
		    
		    System.out.print("Data short: ");
		    data_short = ToRead.dataShort();
		    System.out.print("Data int: ");
		    data_int = ToRead.dataInt();
		    System.out.print("Data long: ");
		    data_long = ToRead.dataLong();
		    System.out.print("Data float: ");
		    data_float = ToRead.dataFloat();
		    System.out.print("Data double: ");
		    data_double = ToRead.dataDouble();	   
		    
		    System.out.println(data_short);
		    System.out.println(data_int);
		    System.out.println(data_long);
		    System.out.println(data_float);
		    System.out.println(data_double);
		}
}
	// 1. Incluir en los mensajes el rango permitido, ejem. Data short between xxx and yyy
	// 2. Incluir un mensaje para validar IOException
