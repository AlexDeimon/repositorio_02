package Examen.Final.BDMuseo;

import Examen.Final.BDMuseo.vista.VentanaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Examen.Final.BDMuseo")
public class BDMuseoApplication {
    
	public static void main(String[] args) {
                VentanaPrincipal ventana=new VentanaPrincipal();
                ventana.setTitle("Ventana Principal");
                ventana.setVisible(true);
	}

        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(BDMuseoApplication.class, args);
        }
            
}