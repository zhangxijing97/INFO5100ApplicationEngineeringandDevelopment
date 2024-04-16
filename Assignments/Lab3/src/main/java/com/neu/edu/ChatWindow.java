package com.neu.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private JTextArea chatArea;
    private JTextField chatInput1, chatInput2;
    private JButton sendButton1, sendButton2;

    public ChatWindow() {
        setTitle("Chat Window");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(2, 1));

        // User 1 interface
        JPanel panel1 = new JPanel(new BorderLayout());
        chatInput1 = new JTextField();
        sendButton1 = new JButton("User 1 Send");
        sendButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = chatInput1.getText().trim();
                if (!message.isEmpty()) {
                    chatArea.append("User 1: " + message + "\n");
                    chatInput1.setText("");
                }
            }
        });
        panel1.add(chatInput1, BorderLayout.CENTER);
        panel1.add(sendButton1, BorderLayout.EAST);

        // User 2 interface
        JPanel panel2 = new JPanel(new BorderLayout());
        chatInput2 = new JTextField();
        sendButton2 = new JButton("User 2 Send");
        sendButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = chatInput2.getText().trim();
                if (!message.isEmpty()) {
                    chatArea.append("User 2: " + message + "\n");
                    chatInput2.setText("");
                }
            }
        });
        panel2.add(chatInput2, BorderLayout.CENTER);
        panel2.add(sendButton2, BorderLayout.EAST);

        inputPanel.add(panel1);
        inputPanel.add(panel2);

        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}