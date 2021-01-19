package com.iteachonline;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();


            }
        });
    }
}
