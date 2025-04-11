package ar.edu.udeci.pv.actividad2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.commons.cli.CommandLine;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Actividad2ApplicationTests {

    @Test
    void testParseArgumentsValidos() {
        String[] args = {"-n", "Lucía", "-e", "30"};
        CommandLine cmd = Actividad2Application.parseArguments(args);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("n"));
        assertEquals("Lucía", cmd.getOptionValue("n"));
    }
}
