package com.neu.edu;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JFrame {
    public ImageDisplay() {
        // Initialize JFrame
        setTitle("Image Display");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an ImageIcon from an image file
        ImageIcon imageIcon = new ImageIcon(
                "/Users/zhangxijing/MasterNEU/INFO5100ApplicationEngineeringandDevelopment/Code/Chapter14/image/error.jpg");

        // Resize image to fit the JLabel
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(280, 280, java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        imageIcon = new ImageIcon(newimg); // transform it back

        // Create a JLabel and set its icon
        JLabel label = new JLabel(imageIcon);
        add(label); // Add the label to the JFrame

        // Set layout and visibility
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplay();
            }
        });
    }
}
