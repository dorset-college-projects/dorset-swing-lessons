package com.iteachonline;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel() {

        textArea = new JTextArea();

        setLayout(new BorderLayout());
        // TAKES UP ENTIRE AREA OF CONTAINER
        // add(textArea, BorderLayout.CENTER);


        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void append(String text) {

        textArea.append(text);
    }
}
