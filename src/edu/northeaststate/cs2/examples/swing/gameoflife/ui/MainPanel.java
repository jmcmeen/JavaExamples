/**
 * -------------------------------------------------
 * File name: MainPanel.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.swing.gameoflife.ui;

import edu.northeaststate.cs2.examples.swing.gameoflife.logic.Cell;
import edu.northeaststate.cs2.examples.swing.gameoflife.logic.Grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A Swing JPanel for displaying the Grid model
 */
public class MainPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    Grid grid;
    Timer timer;

    /**
     * Default class constructor, starts timer to control
     */
    public MainPanel() {
        grid = new Grid();
        timer = new Timer(100, new TickHandler());
        timer.start();
    }

    /**
     * Inner class that implements an interface which updates the grid at each tick
     */
    private class TickHandler implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            grid.tick();
            repaint();
        }

    }

    /**
     * Repaints the grid
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Cell cell;

        for (int i = 0; i < grid.getNumberOfRows(); i++) {
            for (int j = 0; j < grid.getNumberOfColumns(); j++) {
                cell = grid.getCell(i, j);
                if (cell.isAlive())
                    g.fillRect(i * 5, j * 5, 5, 5);
            }
        }
    }
}
