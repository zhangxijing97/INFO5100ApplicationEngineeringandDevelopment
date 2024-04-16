package com.neu.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCircleGUI extends JFrame implements ActionListener {

    private JComboBox<String> colorComboBox;
    private JPanel circlePanel;
    private JTextField colorOutputField;

    public ColorCircleGUI() {
        setTitle("Color Circle GUI");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create color selection dropdown
        String[] colorOptions = { "Select Color", "Red", "Blue", "Green" };
        colorComboBox = new JComboBox<>(colorOptions);
        colorComboBox.addActionListener(this);

        // Create panel to draw the circle
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Color fillColor = getSelectedColor();
                g.setColor(fillColor);
                g.fillOval(0, 0, 200, 200); // Draw circle
            }
        };

        // Create output text field
        colorOutputField = new JTextField();
        colorOutputField.setEditable(false);

        // Add components to the frame
        add(colorComboBox, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);
        add(colorOutputField, BorderLayout.SOUTH);
    }

    private Color getSelectedColor() {
        String selectedColor = (String) colorComboBox.getSelectedItem();
        switch (selectedColor) {
            case "Red":
                colorOutputField.setText("Red");
                return Color.RED;
            case "Blue":
                colorOutputField.setText("Blue");
                return Color.BLUE;
            case "Green":
                colorOutputField.setText("Green");
                return Color.GREEN;
            default:
                colorOutputField.setText("");
                return Color.WHITE; // Default color (clear)
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorComboBox) {
            circlePanel.repaint(); // Redraw the circle when color selection changes
        }
    }

    // public static void main(String[] args) {
    // SwingUtilities.invokeLater(() -> {
    // ColorCircleGUI gui = new ColorCircleGUI();
    // gui.setVisible(true);
    // });
    // }
}