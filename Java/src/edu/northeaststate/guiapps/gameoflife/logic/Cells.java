package edu.northeaststate.guiapps.gameoflife.logic;

import java.util.Random;

public class Cells {

    private Cell[][] cells = new Cell[100][100];

    public Cells() {
        Random generator = new Random();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = new Cell();
                if (generator.nextInt(3) == 0) {
                    cells[row][col].makeAlive();
                }
            }
        }
    }

    public int getNumberOfRows() {
        return cells.length;
    }

    public int getNumberOfColumns() {
        return cells[0].length;
    }

    public void tick() {
        Cell[][] temp = new Cell[cells.length][cells[0].length];
        int numberOfNeighbors = 0;
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                temp[row][col] = new Cell();
                numberOfNeighbors = countNeighbors(row, col);
                temp[row][col].setState(numberOfNeighbors);
            }
        }
        cells = temp;
    }

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

    public Cell getCell(int row, int col) {
        if (row >= 0 && row < cells.length) {
            if (col >= 0 && col < cells[0].length) {
                return cells[row][col];
            }
        }
        return null;
    }
}