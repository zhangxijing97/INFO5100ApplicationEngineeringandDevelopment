package com.neu.edu;

import javax.swing.*;
import java.awt.*;

public class MyCanvas extends Canvas {
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("p3.gif");
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(i, 0);
        try {
            tracker.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (tracker.isErrorAny()) {
            System.out.println("Error loading image");
        } else {
            g.drawImage(i, 120, 100, this);
        }
    }

    // public static void main(String[] args) {
    // SwingUtilities.invokeLater(new Runnable() {
    // public void run() {
    // MyCanvas m = new MyCanvas();
    // JFrame f = new JFrame();
    // f.add(m);
    // f.setSize(400, 400);
    // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure program exits on
    // close
    // f.setVisible(true);
    // }
    // });
    // }
}