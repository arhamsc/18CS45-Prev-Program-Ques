package com.eventsQ4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventsWithSwings implements MouseListener {
    private JFrame frame;
    private JLabel label;

    private JLabel displayActionLabel;

    public MouseEventsWithSwings() {
        frame = new JFrame("Mouse Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2, 1));

        label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("Do actions on me.");
        label.setBackground(Color.red);
        label.setOpaque(true);//for the background to be displayed
        label.addMouseListener(this);

        displayActionLabel = new JLabel("No Mouse Event Occurred");
        displayActionLabel.setVerticalAlignment(JLabel.CENTER);
        displayActionLabel.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.add(displayActionLabel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventsWithSwings();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        displayActionLabel.setText("Mouse Clicked.");
        System.out.println("Mouse Clicked.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        displayActionLabel.setText("Mouse Pressed.");
        System.out.println("Mouse Pressed.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        displayActionLabel.setText("Mouse Released.");
        System.out.println("Mouse Released.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        displayActionLabel.setText("Mouse Entered.");
        System.out.println("Mouse Entered.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        displayActionLabel.setText("Mouse Exited.");
        System.out.println("Mouse Exited.");
    }
}
