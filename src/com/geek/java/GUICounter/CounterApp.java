package com.geek.java.GUICounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int counter = 0;
    private final JLabel counterValueView = new JLabel();

    public CounterApp() {
        setBounds(500, 500, 300, 180);
        setTitle("CounterApp");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Tahoma", Font.BOLD, 36);

        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setText(String.valueOf(counter));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter--;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                counterValueView.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }

    private void changeCounter(int offset){
        counter += offset;
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
