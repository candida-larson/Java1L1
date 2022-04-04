package com.geek.java.GUICounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int counter = 0;
    private final JLabel counterValueView = new JLabel();
    Font font = new Font("Tahoma", Font.BOLD, 36);

    public CounterApp() {
        configFrame();
        configCounterValueView();

        initIncrementButton();
        initDecrementButton();
        initClearButton();
        initTenIncAndDecButton();

        setVisible(true);
    }

    private void configCounterValueView() {
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setText(String.valueOf(counter));
    }

    private void initIncrementButton() {
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                changeCounterInView(1);
            }
        });
    }

    private void initDecrementButton() {
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                changeCounterInView(-1);
            }
        });
    }

    private void initClearButton() {
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(font);
        add(clearButton, BorderLayout.NORTH);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearCounter();
            }
        });
    }

    private void initTenIncAndDecButton() {
        JButton tenIncButton = new JButton("+10");
        tenIncButton.setFont(font);
        tenIncButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeCounterInView(10);
            }
        });

        JButton tenDecButton = new JButton("-10");
        tenDecButton.setFont(font);
        tenDecButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeCounterInView(-10);
            }
        });

        Panel panel = new Panel();
        panel.add(tenIncButton);
        panel.add(tenDecButton);
        add(panel, BorderLayout.SOUTH);
    }

    private void configFrame() {
        setBounds(400, 400, 300, 240);
        setTitle("CounterApp");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void clearCounter() {
        counter = 0;
        counterValueView.setText(String.valueOf(counter));
    }

    private void changeCounterInView(int offset) {
        counter += offset;
        counterValueView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
