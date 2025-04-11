package ar.edu.udeci.pv.actividad2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.cli.*;

@SpringBootApplication
public class Actividad2Application {
    private static final Logger logger = LogManager.getLogger(Actividad2Application.class);

    public static void main(String[] args) {
        CommandLine cmd = parseArguments(args);

        if (cmd == null || cmd.hasOption("h")) {
            showHelp();
            return;
        }

        if (!cmd.hasOption("n") || !cmd.hasOption("e")) {
            logger.warn("Faltan parámetros obligatorios: nombre (-n) y edad (-e).");
            showHelp();
            return;
        }

        String nombre = cmd.getOptionValue("n");
        String edad = cmd.getOptionValue("e");

        logger.info("Nombre: {}, Edad: {}", nombre, edad);
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }

    public static CommandLine parseArguments(String[] args) {
        Options options = buildOptions();
        CommandLineParser parser = new DefaultParser();

        try {
            return parser.parse(options, args);
        } catch (ParseException e) {
            logger.error("Error al analizar los argumentos: {}", e.getMessage());
            showHelp();
            return null;
        }
    }

    private static Options buildOptions() {
        Options options = new Options();
        options.addOption("h", "help", false, "Muestra esta ayuda");
        options.addOption("n", "name", true, "Especifica el nombre de la persona");
        options.addOption("e", "edad", true, "Especifica la edad de la persona");
        return options;
    }

    private static void showHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("Actividad2", buildOptions());
    }
}