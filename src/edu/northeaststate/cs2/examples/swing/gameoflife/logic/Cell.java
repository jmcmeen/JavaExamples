/**
 * -------------------------------------------------
 * File name: Cell.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.swing.gameoflife.logic;

/**
 * Models a cell in Conway's Game of Life
 */
public class Cell {
    private boolean alive = false;

    /**
     * Method to see if the cell is currently alive
     * @return
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Sets the cell's alive status to true;
     */
    public void makeAlive() {
        alive = true;
    }

    /**
     * Determines if the cell should be alive or dead
     * @param numberOfNeighbors the cell's neighbor count
     */
    public void update(int numberOfNeighbors) {
        if (alive) {
            if (numberOfNeighbors < 2) {
                alive = false;
            } else if (numberOfNeighbors > 3) {
                alive = false;
            }
        } else {
            if (numberOfNeighbors == 3) {
                alive = true;
            }
        }
    }
}