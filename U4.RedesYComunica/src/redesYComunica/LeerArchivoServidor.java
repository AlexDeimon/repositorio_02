package redesYComunica;
import java.awt.BorderLayout; 
import java.awt.Container; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JEditorPane; 
import javax.swing.JFrame; 
import javax.swing.JOptionPane; 
import javax.swing.JScrollPane; 
import javax.swing.JTextField; 
import javax.swing.event.HyperlinkEvent; 
import javax.swing.event.HyperlinkListener; 
public class LeerArchivoServidor extends JFrame{ 
    private static final long serialVersionUID = 1L; 
    private JTextField campoIntroducir; 
    private JEditorPane areaContenido; 
    public LeerArchivoServidor() { 
        super("Navegador web simple"); 
        Container contenedor = getContentPane(); 
        campoIntroducir=new JTextField("Direccion de busqueda: "); 
        campoIntroducir.addActionListener( 
            new ActionListener() { 
                public void actionPerformed(ActionEvent evento) { 
                    obtenerLaPagina(evento.getActionCommand()); 
                } 
            } 
        ); 
        contenedor.add(campoIntroducir, BorderLayout.NORTH); 
        areaContenido=new JEditorPane(); 
        areaContenido.setEditable(false); 
        areaContenido.addHyperlinkListener( 
            new HyperlinkListener() { 
                public void hyperlinkUpdate(HyperlinkEvent evento) { 
                    if(evento.getEventType()==HyperlinkEvent.EventType.ACTIVATED) 
                        obtenerLaPagina(evento.getURL().toString()); 
                } 
            } 
        ); 
        contenedor.add(new JScrollPane(areaContenido), BorderLayout.CENTER); 
        setSize(500,300); 
        setVisible(true); 
    } 
    private void obtenerLaPagina(String ubicacion) { 
//        System.out.println(ubicacion); 
        try { 
            areaContenido.setPage(ubicacion); 
            campoIntroducir.setText(ubicacion); 
//            System.out.println("Despues de campoIntroducir..."); 
        }catch(Exception IOE) { 
            JOptionPane.showMessageDialog(this, "No es una direccion URL valida", "url incorrecto",  
                    JOptionPane.ERROR_MESSAGE); 
        } 
    } 
    public static void main(String[] args) { 
        LeerArchivoServidor aplicacion = new LeerArchivoServidor(); 
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
} 