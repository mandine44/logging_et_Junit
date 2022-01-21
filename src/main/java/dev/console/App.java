package dev.console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dev.service.*;


public class App {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class); 
	// App.class = nom du logger, = nom de la classe par convention, correspond au nom du logger dans fichier logback.xml
	//permet de pouvoir afficher le nom de la classe qui a poussé le log dans le fichier de sortie ou la console
	
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");
		
		AppService service = new AppService();
		
		service.executer("bonjour");

	}

}
