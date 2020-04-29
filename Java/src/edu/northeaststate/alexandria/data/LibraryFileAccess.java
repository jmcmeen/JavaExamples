package edu.northeaststate.alexandria.data;

import edu.northeaststate.alexandria.models.Library;

import java.io.*;

public class LibraryFileAccess {
    private String filename;

    public LibraryFileAccess(String filename) {
        this.filename = filename;
    }

    public void saveLibraryFile(Library library) throws IOException {
        File file = new File(this.filename);
        String abs = file.getAbsolutePath();
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(abs));
        output.writeObject(library);
        System.out.println("\nFile saved to: " + file.getAbsolutePath());
        output.close();
    }

    public void openLibraryFile(Library library) throws IOException, ClassNotFoundException {
        ObjectInputStream input;
        input = new ObjectInputStream(new FileInputStream(this.filename));
        Library temp = (Library) input.readObject();

        library.setName(temp.getName());
        library.setItems(temp.getItems());

        input.close();


    }
}
