package ar.edu.udeci.pv.actividad2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.cli.*;

@SpringBootApplication
public class Actividad2Application {
	private static final Logger logger = LogManager.getLogger(Actividad2Application.class);

    public static void main(String[] args) {
		Options options = new Options();

		options.addOption("h", "help", false, "Muestra esta ayuda");
		options.addOption("n", "name", true, "Especifica el nombre de la persona"); // Opción -n
		options.addOption("e", "edad", true, "Especifica la edad de la persona");   // Opción -e

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();

		try {
			CommandLine cmd = parser.parse(options, args);

			if (cmd.hasOption("h")) {
				formatter.printHelp("Activiad2", options);
				return;
			}

			if (!cmd.hasOption("n")) {
				logger.warn("ERROR: Falta el nombre. Usa -n o --name para especificarlo.");
				formatter.printHelp("Activiad2", options);
				return;
			}

			if (!cmd.hasOption("e")) {
				logger.warn("ERROR: Falta la edad. Usa -e o --edad para especificarla.");
				formatter.printHelp("Activiad2", options);
				return;
			}

			String nombre = cmd.getOptionValue("n");
			String edad = cmd.getOptionValue("e");

			System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

		} catch (ParseException e) {
			System.out.println("Error al analizar los argumentos: " + e.getMessage());
			formatter.printHelp("Activiad2", options);
		}
	}
}