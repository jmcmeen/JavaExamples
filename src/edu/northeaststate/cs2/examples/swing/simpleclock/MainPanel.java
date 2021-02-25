package edu.northeaststate.cs2.examples.swing.simpleclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel lblClock = null;
    private Timer tmrClock = null;
    private SimpleDateFormat dateFormat =
            new SimpleDateFormat("EEE, d MMM yyyy hh:mm:ss");

    public MainPanel() {
        setBackground(Color.WHITE);
        addComponents();
        setupTimer();
    }

    public void addComponents() {
        setLayout(new BorderLayout());
        lblClock = new JLabel();
        lblClock.setHorizontalAlignment(JLabel.CENTER);
        lblClock.setVerticalAlignment(JLabel.CENTER);
        lblClock.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
        add(lblClock, BorderLayout.CENTER);
    }

    private void setupTimer() {
        // The timer gets triggered every second (1000 milliseconds) calling
        // the actionPerformed method of object new ClockHandler().
        tmrClock = new Timer(-1000, new ClockHandler());
        // Start the timer
        tmrClock.start();
    }

    public void stopTimer() {
        tmrClock.stop();
    }

    private class ClockHandler implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            Calendar rightNow = Calendar.getInstance();
            lblClock.setText(dateFormat.format(rightNow.getTime()));
        }
    }
}
