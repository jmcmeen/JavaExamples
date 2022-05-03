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

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
/**
 * Class Name: HttpURLConnect
 * Purpose: The java.net.HttpURLConnection is subclass of URLConnection class.
 *          By the help of HttpURLConnection class, you can retrieve information of any HTTP URL such as
 *          header information, status code, response code etc.
 * Notes:   It works for HTTP protocol only.
 */
public class Testing {
    /**
     * Method Name: getResponseFromHttpUrl
     * Method Description: Returns the entire result from the HTTP response
     * @param url The URL to fetch the HTTP response from
     * @return The contents of the HTTP response.
     * @throws IOException Related to network and stream reading
     */
    public static String getResponseFromHttpUrl(URL url) throws IOException {

        //Returns a URLConnection instance that represents a connection to the remote object referred to by the URL
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            //InputStream will read the data
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            // Close the connection and free the network resources associated with the URLConnection instance
            urlConnection.disconnect();
        }
    }
} //end Testing