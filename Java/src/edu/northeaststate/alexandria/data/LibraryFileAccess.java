package edu.northeaststate.alexandria.data;

import edu.northeaststate.alexandria.models.Library;

import java.io.*;

public class LibraryFileAccess {
    private String filename;

    public LibraryFileAccess(String filename) {
        this.filename = filename;
    }

    public void openLibraryFile(Library library) throws IOException, ClassNotFoundException {
        ObjectInputStream input = null;
        input = new ObjectInputStream(new FileInputStream(this.filename));
        Library temp = (Library) input.readObject();

        library.setName(temp.getName());
        library.setItems(temp.getItems());

        input.close();
    }

    public void saveLibraryFile(Library library) throws IOException {
        File file = new File(this.filename);
        //System.out.println(file.getAbsolutePath());
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()));
        output.writeObject(library);
        System.out.println("\nFile saved to: " + file.getAbsolutePath());
        output.close();
    }
}
