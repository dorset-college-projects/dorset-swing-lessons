package com.iteachonline;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MultipleSelectionFrame multipleSelectionFrame =
                new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
