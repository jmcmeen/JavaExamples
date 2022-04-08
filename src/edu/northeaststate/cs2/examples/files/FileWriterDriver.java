package edu.northeaststate.cs2.examples.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWriterDriver {
    public static void main(String[] args) {
        Random random = new Random();
        try {
            File file = new File("out.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i <1000; i++) {
                fw.write(random.nextInt(100) + ",");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
