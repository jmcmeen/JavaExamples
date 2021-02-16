package edu.northeaststate.cs2.examples.txtfiles;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/edu/northeaststate/cs2/examples/txtfiles/test3.txt", true);
            myWriter.write("Append\nthis\non\nnew\nlines\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}