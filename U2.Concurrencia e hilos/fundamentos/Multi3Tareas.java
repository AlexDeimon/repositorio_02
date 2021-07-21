package fundamentos; 
public class Multi3Tareas extends Thread { 
    private String nombre; 
    public Multi3Tareas (String nombre) { 
        this.nombre=nombre; 
    } 
    public static void main(String[] args) { 
    	int i=1;
    	while (i<4){
    		 Multi3Tareas tarea1 = new Multi3Tareas("Pedro"); 
    		 Multi3Tareas tarea2 = new Multi3Tareas("Leison"); 
    		 Multi3Tareas tarea3 = new Multi3Tareas("Paula"); 
    		 tarea1.run();
    		 tarea2.run(); 
    		 tarea3.run();
    		 i++;
    		 
    	}
       
    } 
    public void run() { 
        try { 
            int x = (int)(Math.random()*5000); 
            Thread.sleep(x); 
            System.out.println("Tarea de "+nombre+" con "+x+" unidades de tiempo"); 
        }catch(Exception ET) { 
            ET.printStackTrace(); 
        } 
    } 
} 