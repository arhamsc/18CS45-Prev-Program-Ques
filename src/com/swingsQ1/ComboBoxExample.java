package com.swingsQ1;
//Question:
//	Explain JCombobox with example

//JComboBox: The object of Choice class is used to show popup menu of choices. 
//Choice selected by user is shown on the top of a menu. It inherits JComponent class.

import javax.swing.*;

public class ComboBoxExample {

    ComboBoxExample() {
        //create a new frame
        //frame
        JFrame f = new JFrame("ComboBox Example");

        String[] country = {"India", "Aus", "U.S.A", "England", "NewZealand"};

        //create Check Box
        JComboBox<String> cb = new JComboBox<>(country);
        cb.setBounds(100, 100, 150, 20);

        //add Combo box to frame
        f.add(cb);
        f.setLayout(null);
        //set size of the frame
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}  