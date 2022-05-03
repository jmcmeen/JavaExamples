package edu.northeaststate.cs2.examples.date;

import java.text.SimpleDateFormat;
import java.util.Date;
// The IntelliJ IDEA Blog, Jet Brains, https://blog.jetbrains.com/idea/2020/03/intellij-idea-2020-1-eap7/
// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
public class SimpleDateFormat2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("'Today''s Date:'" + " EEEE, MMMM-dd-yyyy G " +
                " 'The Time:'" + " hh:mm:ss aa, z");
        String date = sdf.format(new Date());
        System.out.println(date);
    }
}





