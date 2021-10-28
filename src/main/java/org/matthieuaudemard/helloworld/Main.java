package org.matthieuaudemard.helloworld;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        new Main().helloWorld(System.out);
    }

    void helloWorld(PrintStream out) {
        out.println("Hello World");
    }
}
