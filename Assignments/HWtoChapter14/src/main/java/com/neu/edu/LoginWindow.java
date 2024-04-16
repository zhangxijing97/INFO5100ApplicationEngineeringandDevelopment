package com.neu.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginWindow() {
        setTitle("Login");
        setSize(300, 120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin")) { // Very simple validation
                    JOptionPane.showMessageDialog(LoginWindow.this, "Login Successful");
                    dispose();
                    new ChatWindow().setVisible(true); // Open chat window
                } else {
                    JOptionPane.showMessageDialog(LoginWindow.this, "Invalid credentials");
                }
            }
        });
        add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}