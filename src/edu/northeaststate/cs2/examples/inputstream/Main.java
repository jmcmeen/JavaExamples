package edu.northeaststate.cs2.examples.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

class Main {
    public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("hello.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}