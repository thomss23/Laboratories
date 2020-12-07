package com.oop_pub.exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Read a line from stdin and print it to stdout
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
        try {
            String s;
            s=reader.readLine();
            reader.close();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
