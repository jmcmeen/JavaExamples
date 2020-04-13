package edu.northeaststate.guiapps.gameoflife.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class LifeMainGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private LifePanel pnlMain = null;
    private JMenuBar mnubarMain = null;
    private JMenu mnuFile = null;
    private JMenu mnuHelp = null;
    private JMenuItem mnuitmExit = null;
    private JMenuItem mnuitmAbout = null;

    public LifeMainGUI() {
        setTitle("Simple Graphics");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents();
        createAndAddMenuBar();
        addMenuOptions();
        setupMenuEvents();
    }

    private void addComponents() {
        pnlMain = new LifePanel();
        add(pnlMain);
    }

    private void createAndAddMenuBar() {
        mnubarMain = new JMenuBar();

        mnuFile = new JMenu("File");
        mnuFile.setMnemonic(KeyEvent.VK_F);
        mnubarMain.add(mnuFile);

        mnuHelp = new JMenu("Help");
        mnuHelp.setMnemonic(KeyEvent.VK_H);
        mnubarMain.add(mnuHelp);

        setJMenuBar(mnubarMain);
    }

    private void addMenuOptions() {
        mnuitmExit = new JMenuItem("Exit");
        mnuitmExit.setMnemonic(KeyEvent.VK_X);
        mnuitmExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        mnuFile.add(mnuitmExit);

        mnuitmAbout = new JMenuItem("About");
        mnuitmAbout.setMnemonic(KeyEvent.VK_B);
        mnuHelp.add(mnuitmAbout);
    }

    private void setupMenuEvents() {
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

    private class AboutHandler implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            JOptionPane.showMessageDialog(
                    LifeMainGUI.this,
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

    public static void main(String[] args) {
        // Launch the main GUI on the event dispatching thread
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        LifeMainGUI mainGUI = new LifeMainGUI();
                        mainGUI.setVisible(true);
                    }
                }
        );
    }
}
