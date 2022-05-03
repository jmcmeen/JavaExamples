/**
 * -----------------------------------------------------
 * File name: StringWriterDriver.java
 * Project name: CS2 Examples
 * Creator's name: Paul Basler
 * John McMeen
 * Email: pbasler@stumail.northeaststate.edu
 * jnmcmeen@northeaststate.edu
 * -----------------------------------------------------
 */

package edu.northeaststate.cs2.examples.stringwriter;

import java.io.StringWriter;

/**
 * Class Name: StringWriterDriver
 * Class Purpose: To demonstrate how StringWriter Class in the java.io.* package can be used by using objects and some
 * of the functions in the StringWriter Class
 */
public class StringWriterDriver {
    /**
     * Method Name: main
     * Method Description: The entry point to the application
     * @param args
     */
    public static void main(String[] args) {
        // Initializing String Writer objects writer, writer1, and writer2
        StringWriter writer = new StringWriter();
        StringWriter writer1 = new StringWriter();
        StringWriter writer2 = new StringWriter();


        // Use of write(int char) method to write the characters H e l l o to the writer object
        writer.write(72);
        writer.write(101);
        writer.write(108);
        writer.write(108);
        writer.write(111);

        // Use getBuffer() to retrieve Hello and output it with toString()
        writer.getBuffer();
        System.out.println(writer.toString());

        // Use append to add a space and CS2 to writer object
        writer.append(' ');
        writer.append('C');
        writer.append('S');
        writer.append('2');

        // Use toString to return the contents of writer object which is Hello CS2
        System.out.println(writer.toString());

        // StringWriter flush method is empty in its class because of this the stream is not flushed and Hello CS2 is printed
        // to the screen.
        writer.flush();

        System.out.println("writer contents after using the flush() method: " + writer.toString());

        // Adds the string Hello to the StringWriter object with the write method
        writer1.write("Hello");

        // Use myChar which is a CharSequence to add " Welcome to" with the append method. The method can
        // also have a start and end in for arguments which looks like this append(CharSequence csq, int start, int end)
        CharSequence myChar = " Welcome to";
        writer1.append(myChar);

        // Append the
        writer1.write(32);
        writer1.write(67);
        writer1.write(83);
        writer1.write(50);

        // The write method in StringWriter can also be used to selectively remove letters from the beginning or
        // end of the myString variable which is also the case for chars as well
        String myString = "WelCome to CS2";
        writer2.write(myString, 3, 11);

        System.out.println(writer1.toString());
        System.out.println(writer2.toString());

        // The close method in StringWriter such as writer.close() is like the flush method it has no effect on a
        // StringWriter object.
    }
}
