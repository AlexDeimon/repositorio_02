package dataBase;
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import com.mysql.jdbc.PreparedStatement; 
import java.sql.Connection; 
//import com.sun.jdi.connect.spi.Connection; 
public class Conexion { 
    public static void main(String[] args) { 
        String usr="root"; 
        String pwd="MySQL757"; 
        String driver="com.mysql.jdbc.Driver"; 
        String url="jdbc:mysql://localhost:3306/hc-n"; 
        Connection Con_MySQL = null; 
        PreparedStatement PSt_SQL=null; 
        ResultSet RS =null; 
        try { 
            Class.forName(driver); 
            Con_MySQL=DriverManager.getConnection(url, usr, pwd); 
            String SQL_LineInve = "SELECT Li_Codigo, Li_Nombre FROM LineInve"; 
            PSt_SQL=(PreparedStatement) Con_MySQL.prepareStatement(SQL_LineInve); 
            RS=PSt_SQL.executeQuery(); 
            while(RS.next()) { 
                System.out.println(RS.getInt("Li_Codigo")); 
                System.out.println(RS.getString("Li_Nombre")); 
            } 
        } 
        catch(Exception Ex) { 
            Ex.printStackTrace(); 
            throw new RuntimeException(Ex); 
        } 
        finally{ 
            try { 
                if(RS!=null) 
                    RS.close(); 
                if(PSt_SQL!=null) { 
                    PSt_SQL.close(); 
                } 
                if(Con_MySQL!=null) 
                    Con_MySQL.close(); 
            } 
            catch(Exception Ex) { 
                Ex.printStackTrace(); 
                throw new RuntimeException(Ex); 
            } 
        } 
    } 
} 