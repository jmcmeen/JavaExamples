package edu.northeaststate.cs2.examples.runnable; /**
 * -------------------------------
 * File name: RandomNumberGenerator.java
 * Created By: Matthew Hamilton
 * Email: mhamilt5@stumail.northeaststate.edu
 * Course & Section: CISP 1020 B70
 * --------------------------------
 */
import java.util.ArrayList;
import java.util.Random;

/**
 * Class Name: RandomNumberGenerator
 * Purpose: Implements runnable and generates random numbers and filters out the prime numbers
 */
public class RandomNumberGenerator implements Runnable {
    private int[] randomNumberArray;
    private ArrayList<Integer> sortedByPrimeList;
    private int maximumNumberSize;
    private int totalNumbersToGenerate;

    /**
     * Method Name: RandomNumberGenerator
     * Method Description: default constructor that assigns 10000000 to maximumNumberSize and 4000 to totalNumbersToGenerate
     */
    public RandomNumberGenerator() {
        maximumNumberSize = 10000000;
        totalNumbersToGenerate = 4000;
    }

    /**
     * Method Name: RandomNumberGenerator
     * Method Description: parameterized constructor to set maximumNumberSize and totalNumbersToGenerate
     * @param maximumNumberSize
     * @param totalNumbersToGenerate
     */
    public RandomNumberGenerator(int maximumNumberSize, int totalNumbersToGenerate) {
        this.maximumNumberSize = maximumNumberSize;
        this.totalNumbersToGenerate = totalNumbersToGenerate;
    }

    /**
     * Method Name: getRandomNumberArray
     * Method Description: returns the randomNumberArray
     * @return int[]: the randomNumberArray
     */
    public int[] getRandomNumberArray() {
        return randomNumberArray;
    }

    /**
     * Method Name: getSortedByPrimeList
     * Method Description: returns the sortedByPrimeList
     * @return ArrayList<Integer>: an arraylist containing the sorted prime numbers
     */
    public ArrayList<Integer> getSortedByPrimeList() {
        if(sortedByPrimeList == null) {
            sortByPrime();
        }
        return sortedByPrimeList;
    }

    /**
     * Method Name: setMaximumNumberSize
     * Method Description: sets the maximum number size
     * @param maximumNumberSize the maximum number size that can be generated
     */
    public void setMaximumNumberSize(int maximumNumberSize) {
        this.maximumNumberSize = maximumNumberSize;
    }

    /**
     * Method Name: totalNumbersToGenerate
     * Method Description: sets the total amount of numbers to generate
     * @param totalNumbersToGenerate the total amount of numbers that will be generated
     */
    public void setTotalNumbersToGenerate(int totalNumbersToGenerate) {
        this.totalNumbersToGenerate = totalNumbersToGenerate;
    }

    /**
     * Method Name: generateNumbers
     * Method Description: generates random numbers based on totalNumbersToGenerate and maximumNumberSize and puts them in
     * randomNumberArray
     */
    public void generateNumbers() {
        randomNumberArray = new int[totalNumbersToGenerate];
        Random random = new Random();
        for (int i = 0; i < totalNumbersToGenerate; i++) {
            randomNumberArray[i] = random.nextInt(maximumNumberSize);
        }
    }

    /**
     * Method Name: sortByPrime
     * Method Description: checks every number in randomNumberArray to see if it is prime. If it is prime,
     * it is added to sortedByPrimeList. sortedByPrimeList is sorted at the end in ascending order.
     */
    public void sortByPrime() {
        //we only need this list if we are sorting by prime, so it is initialized in the method
        sortedByPrimeList = new ArrayList<>();

        for (int num : randomNumberArray) {
            //we assume the number is prime and perform a series of checks to prove that it isn't
            boolean prime = true;
            if (num <= 1) {
                prime = false;
            }
            // if the number is divisible by anything between 2 and num/2, then it is not prime.
            for (int i = 2; i < (num/2); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }//end for loop for prime check
            if (prime) {
                sortedByPrimeList.add(num);
            }
        }//end for each loop
        sortedByPrimeList.sort(new IntegerComparator());
    }

    /**
     * Method Name: optimizedSortByPrime()
     * Method Description: an optimized version of the sortByPrime() method that reduces redundancy.
     * Notes: looked at someone's code to come up with a prime checking algorithm.
     * https://stackoverflow.com/questions/40199440/how-to-determine-if-a-number-is-prime
     */
    public void optimizedSortByPrime() {
        sortedByPrimeList = new ArrayList<>();
        
        for (int numInArray : randomNumberArray) {
            //we still assume the number is prime, and we try to prove it isn't.
            boolean isPrime = true;
            if (numInArray <=1 || numInArray != 2 && numInArray % 2 == 0) {
                isPrime = false;
            } else {
                //assigns sqrtNum the square root of numInArray
                int sqrtNum = (int) Math.sqrt(numInArray);
                /*
                We start at 3 since we already filtered out everything divisible by 2, and we increment by 2 since we don't
                want to check the multiples of 2. We go upto sqrtNum since that is the maximum factor we have to check before
                we start to perform redundant checks for factoring.
                 */
                for (int i = 3; i < sqrtNum; i = i+2) {
                    if (numInArray % i == 0) {
                        isPrime = false;
                        break;
                    }
                }//for loop for prime check
            }//end if/else
            if (isPrime) {
                sortedByPrimeList.add(numInArray);
            }
        }//end foreach
        //sorts the numbers in ascending order
        sortedByPrimeList.sort(new IntegerComparator());
    }

    /**
     * Method Name: run()
     * Method Description: the method that gets called when used with Thread
     * Notes: I don't use the optimizedSortByPrime method since it is too fast. You won't be able to see my amazing jokes.
     */
    @Override
    public void run() {
        generateNumbers();
        sortByPrime();
    }
}