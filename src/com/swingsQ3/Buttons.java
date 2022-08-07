package com.swingsQ3;

/*
* Question:
* Create swing applet that has two buttons named beta and gamma.
* When either of the buttons pressed, it should display “beta pressed”
* and “gamma pressed” respectively.
* (Same implementation but different scenarios are asked)
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JButton betaButton;
    private JButton gammaButton;
    private JLabel label;

    public Buttons() {
        frame = new JFrame("Beta and Gamma Buttons");//Passing title as constructor
        panel = new JPanel(new GridLayout(2,2)); //Passing the layout as constructor
        betaButton = new JButton("Beta");
        gammaButton = new JButton("Gamma");
        label = new JLabel("Press Button");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        //Adding event listeners to the buttons
        betaButton.addActionListener(this);
        gammaButton.addActionListener(this);

        panel.add(betaButton);
        panel.add(gammaButton);
        panel.add(label);
        panel.setSize(1000,1000);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Buttons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Logic to change the label accordingly
        if(e.getSource() == gammaButton) {
            label.setText("Gamma Pressed.");
        } else if(e.getSource() == betaButton) {
            label.setText("Beta Pressed. ");
        } else {
            label.setText("Press Button");
        }
    }
}
