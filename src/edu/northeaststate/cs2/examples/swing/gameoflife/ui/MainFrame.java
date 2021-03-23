/**
 * -------------------------------------------------
 * File name: Main.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.swing.gameoflife.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Create a JFrame to house MainPanel
 */
public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private MainPanel pnlMain = null;
    private JMenuBar mnubarMain = null;
    private JMenu mnuFile = null;
    private JMenu mnuHelp = null;
    private JMenuItem mnuitmExit = null;
    private JMenuItem mnuitmAbout = null;

    /**
     * Default class constructor
     */
    public MainFrame() {
        this.setTitle("Conway's Game of Life");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add components
        pnlMain = new MainPanel();
        add(pnlMain);

        //create menu bar
        mnubarMain = new JMenuBar();

        mnuFile = new JMenu("File");
        mnuFile.setMnemonic(KeyEvent.VK_F);
        mnubarMain.add(mnuFile);

        mnuHelp = new JMenu("Help");
        mnuHelp.setMnemonic(KeyEvent.VK_H);
        mnubarMain.add(mnuHelp);

        setJMenuBar(mnubarMain);

        //add menu options
        mnuitmExit = new JMenuItem("Exit");
        mnuitmExit.setMnemonic(KeyEvent.VK_X);
        mnuitmExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        mnuFile.add(mnuitmExit);

        mnuitmAbout = new JMenuItem("About");
        mnuitmAbout.setMnemonic(KeyEvent.VK_B);
        mnuHelp.add(mnuitmAbout);

        //set up menu events
        mnuitmExit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        setVisible(false);
                        System.exit(0);
                    }
                }
        );

        mnuitmAbout.addActionListener(new AboutHandler());
    }

    /**
     * Implements ActionListener interface and displays JOptionPane
     */
    private class AboutHandler implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            JOptionPane.showMessageDialog(
                    MainFrame.this,
                    "Based on John Conway's Game of Life. \n" +
                            "The Game of Life, also known simply as Life, \n" +
                            "is a cellular automaton devised by the British \n" +
                            "mathematician John Horton Conway in 1970.\n" +
                            "The game is a zero-player game, meaning that its \n" +
                            "evolution is determined by its initial state, \n" +
                            "requiring no further input. One interacts with \n" +
                            "the Game of Life by creating an initial \n" +
                            "configuration and observing how it evolves.\n",
                    "Game of Life",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
