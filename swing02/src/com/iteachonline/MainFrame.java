package com.iteachonline;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextArea textarea ;
    private JButton btn;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        textarea = new JTextArea();
        btn = new JButton("Click Me!");

        add(textarea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}