package fundamentos;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Proceso
{
    public int tiempoLLegada = 0;
    public int stack = 0;
    public int finalizacion = 0;
}

public class RoundRobin {
    
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in); 
        Random rand = new Random(); 
        
        int Q ;
        int numProcesos ;
        System.out.print("Digite valor del Quantum: ");
        Q = sc.nextInt();
        System.out.print("Digite numero de procesos: ");
        numProcesos = sc.nextInt();
        System.out.println("Quantum: " + Q + ", Numero de procesos: " + numProcesos);
        Proceso[] procesos = new Proceso[numProcesos];
        
        
        for (int i = 0; i<procesos.length;i++)
        {
            procesos[i] = new Proceso();
            procesos[i].tiempoLLegada = i;
            procesos[i].stack = rand.nextInt(1000);
            System.out.println("Proceso " + (i+1) + " valor " + procesos[i].stack);
        }
        
        Proceso procesoActual = null;
        List<Proceso> procesoCola = new ArrayList<>();
        
        int tiempo = 0;
        int nProceso = 0;
        int procesoEspejo = procesos.length;
        boolean sw = true;
        int index = 0;
        
        while(procesoEspejo > 0)
        {
            if(procesos.length > nProceso && tiempo >= procesos[nProceso].tiempoLLegada){
                procesoCola.add(procesos[nProceso]);
                nProceso = nProceso + 1;
            }
            else{
                if(nProceso > 0 || procesoCola.size() > 0)
                {
                    if(procesoActual == null)
                    {
                        procesoActual = procesoCola.get(0);
                        procesoCola.remove(0);
                        sw = true;
                    }
                    else{
                        if(sw)
                        {
                            if(procesoActual.stack >= Q)
                            {
                                procesoActual.stack = procesoActual.stack - Q;
                                tiempo = tiempo + Q;
                            }
                            else{
                                tiempo = tiempo + procesoActual.stack;
                                procesoActual.stack = 0;
                            }
                            
                            if(procesoActual.stack < 1)
                            {
                                procesoActual.finalizacion = tiempo;
                                System.out.println("Proceso " + (procesoActual.tiempoLLegada+1) + " Finalizo");
                                procesoEspejo = procesoEspejo - 1;
                                procesoActual = null;
                            }
                            else{
                            sw = false;
                            }
                        }
                        else{
                            procesoCola.add(procesoActual);
                            procesoActual = null;
                        }
                    }
                }
                else{
                    tiempo = tiempo + 1;
                }
            } 
        }
       

    }
}