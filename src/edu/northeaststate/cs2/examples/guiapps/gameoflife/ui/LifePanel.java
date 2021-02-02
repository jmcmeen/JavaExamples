package edu.northeaststate.cs2.examples.guiapps.gameoflife.ui;

import edu.northeaststate.cs2.examples.guiapps.gameoflife.logic.Cell;
import edu.northeaststate.cs2.examples.guiapps.gameoflife.logic.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    Cells peatry = new Cells();
    Timer timer = new Timer(50, new TickHandler());

    public LifePanel() {
        timer.start();
    }

    private class TickHandler implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            peatry.tick();
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Cell goobly = new Cell();

        for (int i = 0; i < peatry.getNumberOfRows(); i++) {
            for (int j = 0; j < peatry.getNumberOfColumns(); j++) {
                goobly = peatry.getCell(i, j);
                if (goobly.isAlive())
                    g.fillRect(i * 5, j * 5, 5, 5);
            }
        }
    }
}
