/**
 * -------------------------------
 * File name: HttpURLConnect.java
 * Created By: Adela Smith
 *             John McMeen
 * Email: asmit127@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.http;

import java.net.HttpURLConnection;
import java.net.URL;
/**
 * Class Name: HttpURLConnect
 * Purpose: With the HttpURLConnection class, you can retrieve information of any HTTP URL such as
 *          header information, status code, response code, etc. This program will demonstrate how to retrieve
 *          header information.
 * Notes:   It works for HTTP protocol only.
 *          The java.net.HttpURLConnection is a subclass of the URLConnection class.
 */
public class HttpURLConnect {
    /**
     * Method Name: main
     * Method Description: Entry point to the program
     * @param args
     */
    public static void main(String[] args) {
        try {
            // Create a new URL object for a given URL:
            URL url = new URL("http://www.google.com");
            // The openConnection() method of URL class returns the object of URLConnection class
            // If the protocol is http://, you can cast the returned object to an HttpURLConnection object:
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            // The getHeaderFieldKey and getHeaderField methods are used in conjunction to iterate through all the headers in the message.
            for (int i = 1; i <= 8; i++) {
                // Returns the key and the value for the header(s)
                System.out.println(httpConn.getHeaderFieldKey(i) + " = " + httpConn.getHeaderField(i));
            }
            // Close the connection and free the network resources associated with the URLConnection instance
            httpConn.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    } //end main
} // end HttpURLConnect