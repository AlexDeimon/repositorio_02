package redesYComunica;
import java.applet.AppletContext; 
import java.awt.BorderLayout; 
import java.awt.Container; 
import java.net.URL; 
import java.util.HashMap; 
import java.util.Vector; 
import javax.swing.JApplet; 
import javax.swing.JLabel; 
import javax.swing.JList; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
public class SelectorSitio extends JApplet{ 
    private Vector nombreSitios; 
    private HashMap sitios; 
    private JList selectorSitios; 
    public void init() { 
        sitios = new HashMap(); 
        nombreSitios=new Vector(); 
        obtenerSitioHTML(); 
        Container contenedor = getContentPane(); 
        contenedor.add(new JLabel("Sitio para navegar: "), BorderLayout.NORTH); 
        selectorSitios.addListSelectionListener( 
                new ListSelectionListener() { 
                    public void valueChanged(ListSelectionEvent evento){ 
                        Object objeto = selectorSitios.getSelectedValue(); 
                        //URL nuevoDocumento=sitios.get(objeto); 
                        //AppletContext navegador = getApletContext(); 
                        //navegador.showDocument(nuevoDocumento); 
                    } 
                } 
            );         
    } 
    @SuppressWarnings("deprecation") 
    private void obtenerSitioHTML() { 
        String titulo, ubicacion; 
        URL url; 
        while(titulo!=null) { 
            ubicacion=(String) sitios.get("ubicacion"); 
            try { 
                url = new URL(ubicacion); 
                sitios.put(titulo, url); 
                nombreSitios.add(titulo);     
            }catch(MalformedURLException URLE) { 
                URLE.printStackTrace(); 
            } 
        } 
    } 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub
    } 
} 