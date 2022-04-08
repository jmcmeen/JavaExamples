package edu.northeaststate.cs2.examples.files;

import java.io.*;

public class FileReaderDriver {
    public static void main(String[] args) throws IOException {
        File inFile = new File("out.txt");
        char[] array = new char[100];
        FileReader in = new FileReader(inFile);

        //The read method will take a reference to an array, and fill it with characters. This takes a fixed size array
        //to prevent reading a file that is larger than the amount of RAM you have
        in.read(array);

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
        in.close();

        //OR
        //If you want to read all the file, you will need to read it into a buffer, one chunk at a time.
        in = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(in);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        in.close();
    }
}