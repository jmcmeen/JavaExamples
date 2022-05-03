/**
 * * -------------------------------------------------
 * File name: HttpExample.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: Aaron Gunter
 *                 John McMeen
 * Email: agunter@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.http;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class Name: Project3
 * Purpose: Demonstrate HttpURLConnection class. Java HttpURLConnection is used to retrieve info like header info,
 *  status code and response code this example shows the response code given by the HttpURL to see if download is
 *  successful and if there is a redirect location in the header.
 * Sources:
 *  https://www.tabnine.com/code/java/methods/java.net.URLConnection/getHeaderField
 *  https://www.codejava.net/java-se/networking/java-urlconnection-and-httpurlconnection-examples
 *  https://www.baeldung.com/java-http-request
 */
public class HttpExample {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args command line arguments
     */
    public static void main (String []args) throws IOException{
        //URL object created to get website.
        URL url = new URL ("https://www.nexusmods.com");
        //Used to obtain Http URL connection
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        //Gets response code to the URL
        int responseCode = httpCon.getResponseCode();

        httpCon.setInstanceFollowRedirects(false);
        httpCon.connect();

        String location = httpCon.getHeaderField("Location");

        //Checks response code and shows whether download was successful or not
        if(responseCode !=  HttpURLConnection.HTTP_OK){
            System.out.println("Server returned response code " + responseCode + ". Download failed");
        }
        else {
            System.out.println("This is the response code given: " + responseCode + " Download successful");
            System.out.println(location);
        }
    }
}