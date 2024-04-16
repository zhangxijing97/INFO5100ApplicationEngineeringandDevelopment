package com.xijingzhang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSwitcherApp extends JFrame {

    private JPanel currentView;

    public ViewSwitcherApp() {
        setTitle("View Switcher App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Set BorderLayout for the frame's content pane
        getContentPane().setLayout(new BorderLayout());

        // Start with the first view
        currentView = new FirstView();
        getContentPane().add(currentView, BorderLayout.CENTER);

        // Create a button to switch views
        JButton switchButton = new JButton("Click Me");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the second view upon button click
                switchToSecondView();
            }
        });

        // Add the button to the SOUTH region of the content pane
        getContentPane().add(switchButton, BorderLayout.SOUTH);
    }

    private void switchToSecondView() {
        // Remove the current view and add the second view
        getContentPane().remove(currentView);
        currentView = new SecondView();
        getContentPane().add(currentView, BorderLayout.CENTER); // Place the new view in the CENTER

        // Revalidate and repaint the frame to reflect the changes
        revalidate();
        repaint();
    }
}
