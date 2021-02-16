package edu.northeaststate.cs2.examples.txtfiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/edu/northeaststate/cs2/examples/txtfiles/test2.txt");
            myWriter.write("Write\nthis\non\nnew\nlines\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}