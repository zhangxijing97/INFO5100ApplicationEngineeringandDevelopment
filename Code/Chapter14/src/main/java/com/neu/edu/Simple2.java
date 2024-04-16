package com.neu.edu;

import javax.swing.*;

// Button
public class Simple2 extends JFrame {
    JFrame f;

    Simple2() {
        JButton b = new JButton("Click Here");
        b.setBounds(250, 250, 100, 100); // set location and size
        add(b); // adding button on frame  
        setSize(500, 500); // set size
        setLayout(null);
        setVisible(true);
    }
}
