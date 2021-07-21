package readings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToRead {
	public static String data() {
		String sdata = "";
		try {
			// Define an input character stream: streamIn
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader streamIn = new BufferedReader(isr);
			// toRead. The entry ends by pressing the Enter key
			sdata = streamIn.readLine();
		} catch(IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return sdata; // return the typed data
	}
	public static short dataShort(){
		try{
			return Short.parseShort(data());
		} catch(NumberFormatException e){
			return Short.MIN_VALUE; // the smaller value
		}
	}
	public static int dataInt(){
		try{
			return Integer.parseInt(data());
		} catch(NumberFormatException e){
			return Integer.MIN_VALUE; // the smaller value
		}
	}
	public static long dataLong(){
		try{
			return Long.parseLong(data());
		}catch(NumberFormatException e){
			return Long.MIN_VALUE; // the smaller value
		}
	}
	public static float dataFloat(){
		try{
			return Float.parseFloat(data());
		}catch(NumberFormatException e){
			return Float.NaN; // is not a number; valor float.
		}
	}
	public static double dataDouble(){
		try{
			return Double.parseDouble(data());
		}catch(NumberFormatException e){
			return Double.NaN; // is not a number; valor double.
		}
	}
}
