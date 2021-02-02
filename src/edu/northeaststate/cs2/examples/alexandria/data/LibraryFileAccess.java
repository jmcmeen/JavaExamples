package edu.northeaststate.cs2.examples.alexandria.data;

import edu.northeaststate.cs2.examples.alexandria.models.Library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.io.IOException;

//TODO abstraction
public class LibraryFileAccess {
    private String filename;

    public LibraryFileAccess(String filename) {
        this.filename = filename;
    }

    public void saveLibraryFile(Library library) throws IOException {
        File file = new File(this.filename);
        String abs = file.getAbsolutePath();
        FileOutputStream fos = new FileOutputStream(abs);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(library);
        System.out.println("\nFile saved to: " + file.getAbsolutePath());
        oos.close();
    }

    public void openLibraryFile(Library library) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(this.filename));

        Library temp = (Library) input.readObject();

        library.setName(temp.getName());
        library.setItems(temp.getItems());

        input.close();
    }
}
