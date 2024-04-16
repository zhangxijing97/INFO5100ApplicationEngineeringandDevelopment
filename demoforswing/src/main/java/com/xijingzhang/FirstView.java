package com.xijingzhang;

import javax.swing.*;
import java.awt.*;

public class FirstView extends JPanel {

    public FirstView() {
        setLayout(new BorderLayout());
        JLabel firstViewLabel = new JLabel("First View");
        firstViewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(firstViewLabel, BorderLayout.CENTER);
    }
}