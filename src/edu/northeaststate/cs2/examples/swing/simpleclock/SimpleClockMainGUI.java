package edu.northeaststate.cs2.examples.swing.simpleclock;

import javax.swing.*;
import java.awt.event.*;

public class SimpleClockMainGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private MainPanel pnlMain = null;
    private JMenuBar mnubarMain = null;
    private JMenu mnuFile = null;
    private JMenu mnuHelp = null;
    private JMenuItem mnuitmExit = null;
    private JMenuItem mnuitmAbout = null;

    public SimpleClockMainGUI() {
        this.setTitle("Simple Clock");
        this.setSize(320, 120);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowHandler());

        pnlMain = new MainPanel();
        this.add(pnlMain);

        this.mnubarMain = new JMenuBar();

        this.mnuFile = new JMenu("File");
        this.mnuFile.setMnemonic(KeyEvent.VK_F);
        this.mnubarMain.add(mnuFile);

        this.mnuHelp = new JMenu("Help");
        this.mnuHelp.setMnemonic(KeyEvent.VK_H);
        this.mnubarMain.add(mnuHelp);

        this.mnuitmExit = new JMenuItem("Exit");
        this.mnuitmExit.setMnemonic(KeyEvent.VK_X);
        this.mnuitmExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        this.mnuFile.add(mnuitmExit);

        this.mnuitmAbout = new JMenuItem("About");
        this.mnuitmAbout.setMnemonic(KeyEvent.VK_B);
        this.mnuHelp.add(mnuitmAbout);

        //set up menu events
        this.mnuitmExit.addActionListener(new ExitHandler());
        this.mnuitmAbout.addActionListener(new AboutHandler());

        this.setJMenuBar(mnubarMain);
    }

    private void confirmExit() {
        int ans = JOptionPane.showConfirmDialog(
                null,
                "The application is about to exit. Exit?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            pnlMain.stopTimer();
            setVisible(false);
            System.exit(0);
        }
    }

    private class AboutHandler implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            JOptionPane.showMessageDialog(
                    SimpleClockMainGUI.this,
                    "Hello, I'm a clock.",
                    "Ask simple questions...",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class ExitHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            confirmExit();
        }

    }

    private class WindowHandler implements WindowListener {
        @Override
        public void windowActivated(WindowEvent e) {
            // Invoked when the Window is set to be the active Window.
            // Not handled
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // Invoked when a window has been closed as the result of calling
            // dispose on the window.
            // Not handled
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // Invoked when the user attempts to close the window from the
            // window's system menu.
            confirmExit();
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            // Invoked when a Window is no longer the active Window.
            // Not handled
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            // Invoked when a window is changed from a minimized to a normal
            // state.
            // Not handled
        }

        @Override
        public void windowIconified(WindowEvent e) {
            // Invoked when a window is changed from a normal to a minimized
            // state.
            // Not handled
        }

        @Override
        public void windowOpened(WindowEvent e) {
            // Invoked the first time a window is made visible.
            // Not handled
        }
    }

    public static void main(String[] args) {
        // Launch the main GUI on the event dispatching thread
       SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        SimpleClockMainGUI mainGUI = new SimpleClockMainGUI();
                        mainGUI.setVisible(true);
                    }
                }
        );
    }
}
