/**
 * -------------------------------------------------
 * File Name: ArrayAlgorithms.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */

package edu.northeaststate.cs1.examples;

/**
 * Class Name: ArrayAlgorithms
 * Purpose: Library of common array algorithms for discussion
 */
public class ArrayAlgorithms {
    /**
     * Method Name: bubbleSort
     * Method Description: Sorts an array of integers using basic bubble sort algorithm
     * @param array
     */
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]){
                    swap(array, j, j-1);
                }
            }
        }
    }

    /**
     * Method Name: optimizedBubbleSort
     * Method Description: Sorts an array of integers using an improved bubbleSortAlgorithm
     * @param array
     */
    public static void optimizedBubbleSort(int[] array){
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    /**
     * Method Name: swap
     * Method Description: Given an integer array, swaps values at index1 and index2
     * @param array
     * @param index1
     * @param index2
     */
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Method Name: linearSearch
     * Method Description: Given an array and a search term, the method iteratively searches for the search term, if found
     * returns the index of found term, if not returns a -1
     * @param array
     * @param searchTerm
     * @return
     */
    public static int linearSearch(int[] array, int searchTerm){
        int foundIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchTerm){
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

    /**
     * Method Name: binarySearch
     * Method Description: Given a sorted int array and a search term, searches for search term, if found returns the index
     * of found term, or a -1 if not found
     * @param array
     * @param searchTerm
     * @return
     */
    public static int binarySearch(int[] array, int searchTerm){
        int low = 0;
        int high = array.length - 1;
        int mid;

        while(high >= low){
            mid = (low + high) / 2;

            if(array[mid] == searchTerm){
                return mid;
            }else if(searchTerm < array[mid]){
                high = mid -1;
            }else if(searchTerm > array[mid]){
                low = mid +1;
            }
        }

        return -1;
    }
}
