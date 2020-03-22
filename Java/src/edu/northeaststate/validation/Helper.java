package edu.northeaststate.validation;

public class Helper {
    public static int isPositiveInteger(String testString){
        int x;

        try {
            x = Integer.parseInt(testString);

            if(x < 1){
                x = -1;
            }
        }
        catch(Exception e){
            x = -1;
        }

        return x;
    }

    public static double isPositiveDouble(String testString){
        double x;
        try {
            x = Double.parseDouble(testString);

            if( !(x > 0.0) ){
                x = -1.0;
            }
        }
        catch(Exception e){
            x = -1.0;
        }

        return x;
    }
}
