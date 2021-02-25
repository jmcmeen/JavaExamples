package edu.northeaststate.cs2.examples.swing.gameoflife.ui;

import javax.swing.*;

/**
 * Conway's Game of Life
 */
public class Main {
    /**
     * An entry point for the application
     * @param args
     */
    public static void main(String[] args) {
        // Launch the main GUI on the event dispatching thread
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainFrame mainGUI = new MainFrame();
                        mainGUI.setVisible(true);
                    }
                }
        );
    }
}
