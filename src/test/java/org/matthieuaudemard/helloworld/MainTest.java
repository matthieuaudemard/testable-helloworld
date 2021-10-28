package org.matthieuaudemard.helloworld;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main main = new Main();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    @Test
    void printHelloWorld() {
        main.helloWorld(printStream);
        String outputString = outputStream.toString();
        assertEquals("Hello World\n", outputString);
    }
}
