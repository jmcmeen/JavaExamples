package edu.northeaststate.cs2.examples.swing.simpleclock;

import javax.swing.*;
import java.awt.*;

public class ClockLabel extends JLabel {
    public ClockLabel() {
       this.setHorizontalAlignment(JLabel.CENTER);
       this.setVerticalAlignment(JLabel.CENTER);
       this.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
    }
}
