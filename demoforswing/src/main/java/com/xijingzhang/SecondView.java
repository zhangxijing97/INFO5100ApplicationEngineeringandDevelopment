package com.xijingzhang;

import javax.swing.*;
import java.awt.*;

public class SecondView extends JPanel {

    public SecondView() {
        setLayout(new BorderLayout());
        JLabel secondViewLabel = new JLabel("Second View");
        secondViewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(secondViewLabel, BorderLayout.CENTER);
    }
}