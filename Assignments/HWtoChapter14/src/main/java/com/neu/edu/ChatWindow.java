package com.neu.edu;

import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {

    private JTextArea chatArea;
    private JTextField messageField;

    public ChatWindow(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane);

        messageField = new JTextField(20);
        messageField.addActionListener(e -> sendMessage());
        add(messageField, BorderLayout.SOUTH);
    }

    private void sendMessage() {
        String message = messageField.getText();
        chatArea.append("You: " + message + "\n");
        messageField.setText("");
        // Logic to send message to another user
    }

    public void receiveMessage(String sender, String message) {
        chatArea.append(sender + ": " + message + "\n");
    }
}
