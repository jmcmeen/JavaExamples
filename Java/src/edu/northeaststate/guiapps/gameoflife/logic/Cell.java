package edu.northeaststate.guiapps.gameoflife.logic;

public class Cell {
    private boolean alive = false;

    public boolean isAlive() {
        return alive;
    }

    public void makeAlive() {
        alive = true;
    }

    public void setState(int numberOfNeighbors) {
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