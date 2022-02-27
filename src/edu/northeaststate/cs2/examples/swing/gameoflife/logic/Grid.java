/**
 * -------------------------------------------------
 * File name: Grid.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.swing.gameoflife.logic;

import java.util.Random;

/**
 * Represents a 2d grid of cells in Conway's Game of Life
 */
public class Grid {

    /**
     * 2d array of Cell objects
     */
    private Cell[][] cells = new Cell[100][100];

    /**
     * Class constructor generates a random grid of alive and dead cells
     */
    public Grid() {
        //Create a Random object to generate random integers
        Random random = new Random();

        //For each cell, allocate memory and 33% Cell becomes alive
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = new Cell();
                if (random.nextInt(3) == 0) {
                    cells[row][col].makeAlive();
                }
            }
        }
    }

    /**
     * Returns the number of rows in the grid
     * @return
     */
    public int getNumberOfRows() {
        return cells.length;
    }

    /**
     * Returns the number of columns in the grid
     * @return
     */
    public int getNumberOfColumns() {
        return cells[0].length;
    }

    /**
     * Updates to a new generation of the grid
     */
    public void tick() {
        Cell[][] temp = new Cell[cells.length][cells[0].length];
        int numberOfNeighbors = 0;
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                temp[row][col] = new Cell();
                numberOfNeighbors = countNeighbors(row, col);
                temp[row][col].update(numberOfNeighbors);
            }
        }
        cells = temp;
    }

    /**
     * Counts the neighbors of a given Cell
     * @param row
     * @param col
     * @return
     */
    private int countNeighbors(int row, int col) {
        int count = 0;
        int rowAbove = row - 1;
        int rowBelow = row + 1;
        int colLeft = col - 1;
        int colRight = col + 1;

        Cell ul = getCell(rowAbove, colLeft);
        if (ul != null) {
            if (ul.isAlive()) count++;
        }
        Cell above = getCell(rowAbove, col);
        if (above != null) {
            if (above.isAlive()) count++;
        }
        Cell ur = getCell(rowAbove, colRight);
        if (ur != null) {
            if (ur.isAlive()) count++;
        }
        Cell left = getCell(row, colLeft);
        if (left != null) {
            if (left.isAlive()) count++;
        }
        Cell right = getCell(row, colRight);
        if (right != null) {
            if (right.isAlive()) count++;
        }
        Cell ll = getCell(rowBelow, colLeft);
        if (ll != null) {
            if (ll.isAlive()) count++;
        }
        Cell below = getCell(rowBelow, col);
        if (below != null) {
            if (below.isAlive()) count++;
        }
        Cell lr = getCell(rowBelow, colRight);
        if (lr != null) {
            if (lr.isAlive()) count++;
        }

        return count;
    }

    /**
     * Returns a Cell from the grid at a given position
     * @param row specified row
     * @param col specifed column
     * @return the Cell at position [row, column]
     */
    public Cell getCell(int row, int col) {
        if (row >= 0 && row < cells.length) {
            if (col >= 0 && col < cells[0].length) {
                return cells[row][col];
            }
        }
        return null;
    }
}