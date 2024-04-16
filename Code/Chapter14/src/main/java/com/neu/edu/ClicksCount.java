package com.neu.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Button Click Events
class ClicksCount implements ActionListener { // step 1, extend a class implements ActionListener
    int count = 0; // store number of clicks

    ClicksCount() {
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        button1.addActionListener(this); // step 2, add an instance of the event handler
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(button1);
        frame.add(button2);
        frame.getRootPane().setDefaultButton(button1); // sets default button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { // step 3, provide the actionPerformed(ActionEvent e) method
        count++;
        System.out.println("You have clicked the ACTIVE button " + count + " times");
    }

    // public static void main(String args[]) {

    // ClicksCount Clicks = new ClicksCount();
    // }
}