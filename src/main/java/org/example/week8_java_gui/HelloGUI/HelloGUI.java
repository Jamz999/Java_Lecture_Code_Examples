package org.example.week8_java_gui.HelloGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;
    private int clicks = 0;

    HelloGUI() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks++;
                String text = "Thank you for clicking :)";

                if (clicks > 50) {
                    text = "STOP IT!!! >:(";
                }
                else if (clicks > 30) {
                    text = "Thank you, you can stop clicking me now >:|";
                }
                else if (clicks > 10) {
                    text = "Okay, you can stop now :|";
                }

                myFirstLabel.setText(text);
            }
        });
    }
}
