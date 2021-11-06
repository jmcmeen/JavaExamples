package edu.northeaststate.cs1.examples;

public class Arrays03 {
    public static void main(String[] args) {
        int[][] twoDArray = new int[100][100];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = getRandomInt(1, 100);
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Method Name: getRandomInt
     * Method Description: Returns a pseudorandom integer >= lowerBound and <= upperBound
     * @param lowerBound
     * @param upperBound
     * @return
     */
    public static int getRandomInt(int lowerBound, int upperBound){
        int range = upperBound - lowerBound + 1;
        int temp = (int)(Math.random() * range) + lowerBound;
        return temp;
    }
}
