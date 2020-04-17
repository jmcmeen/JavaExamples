package edu.northeaststate.alexandria.data;

import edu.northeaststate.alexandria.models.Library;

import java.io.*;

public class FileAccess {
    public static void openLibraryFile(String fileName, Library library) throws IOException, ClassNotFoundException {
        ObjectInputStream input = null;
        input = new ObjectInputStream(new FileInputStream(fileName));
        Library temp = (Library) input.readObject();

        library.setName(temp.getName());
        library.setBooks(temp.getBooks());

        input.close();
    }

    public static void saveLibraryFile(String fileName, Library library) throws IOException {
        File file = new File(fileName);
        //System.out.println(file.getAbsolutePath());
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()));
        output.writeObject(library);
        System.out.println("\nFile saved to: " + file.getAbsolutePath());
        output.close();
    }
}
