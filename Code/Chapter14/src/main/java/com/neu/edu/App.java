package com.neu.edu;

import javax.swing.*;

/**
 * AWT – Abstract Window Toolkit and Swing
 *
 */

public class App {

    public static void main(String[] args) {

        // Basic
        // JFrame frame = new JFrame("My First GUI");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(300, 300);
        // JButton button1 = new JButton("Button 1");
        // JButton button2 = new JButton("Button 2");
        // frame.getContentPane().add(button1);
        // frame.getContentPane().add(button2);
        // frame.setVisible(true);

        // Button
        // new Simple2();
        new ClicksCount();

        // Button Click Events
        ClicksCount Clicks = new ClicksCount();

        // Layout(BorderLayout, FlowLayout, GridBagLayout)
        // new Gui();

        // Images
        new MyCanvas();

        // new ImageDisplay();
    }
}
