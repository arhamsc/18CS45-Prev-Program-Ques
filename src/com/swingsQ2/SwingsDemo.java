package com.swingsQ2;

/*
* Question:
* Explain the following with an example for each along with syntax:
i. JLabel
ii. JButton
iii. JComboBox
iv. JList
v. JCheckBox
vi. JTable
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* JFrame - The top level element of the Swings window. This will create a window where the components can be place.
*   We can set several attributes like title, size, alignment etc. And the components are added using .add() method.
*   Syntax: JFrame frame_name = new JFrame() & frame_name.add() to add components.
* JLabel - This is used to display text information on the window. The text can be formatted using the methods Jlabel class.
*   Syntax: JLabel label_name = new Label("Text to display"); & to set text later label.setText("...")
* JButton - This will create a button on which we can attach the ActionListener to make it do something.
*   Syntax: JButton button_name = new JButton("Button Label"); the class should implement ActionListener and override action performed
*   to hook up the event.
* JComboBox - This component will display a dropdown list of item which are passed into the constructor, it gives access
*   to present selected item.
*   Syntax: JComboBox comboBox_name = new JComboBox({list of items to display});
* JList - This will display list of items one below the other.
*   Syntax: JList list_name = new JList({items})
* JCheckBox - this will create a checkbox which will hold a value of true if checked and false if unchecked.
*   Syntax: JCheckBox checkBox_name = new JCheckBox();
* JTable - this is used to create a table with rows and columns.
*   Syntax: JTable table_name = new JTable(tableData, columnHeaders); or we can pass number of rows and columns as constructor.
* */

public class SwingsDemo implements ActionListener {
    //The variables have been declared outside to provide class-wide access.
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JButton button;
    private JComboBox comboBox;
    private JList list;
    private JCheckBox checkBox;
    private JTable table;
    private GridLayout grid;

    //Supporting variables
    private int count = 0;
    private String selectedComboBoxItem = "Apple";
    private boolean checkBoxValue = false;
    private String[] checkBoxItems = {"Apple", "Mango", "Banana", "Orange"};
    private String[] listItems = {"Item1", "Item2", "Item3"};
    //Below is the 2d array which will be used as the data for the table
    private String[][] tableData = {{"153", "Asif", "887744"}, {"156", "Ram", "874412"},
            {"148", "Rushil", "774574"}, {"184", "Sid", "554781"}};
    //Below is the 1d array which will be the heading of the columns
    private String[] columnHeadings = {"ID", "NAME", "SALARY"};

    //Everything is done inside the constructor
    public SwingsDemo() {
        //Below we initialise all the variables accordingly.
        /*
        * Below we are using 3 panels to separate the content accordingly and place it in the frame
        * */
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button = new JButton("Click Me");
        label = new JLabel("Number of Clicks: " + count);
        label2 = new JLabel("Selected ComboBox Item: " + selectedComboBoxItem + " And CheckBox Value is: " + checkBoxValue);
        grid = new GridLayout(4, 4);
        comboBox = new JComboBox(checkBoxItems);
        checkBox = new JCheckBox("This is a CheckBox");
        list = new JList(listItems);
        table = new JTable(tableData, columnHeadings);


        //Panel provides us with the container to put all our components.
        panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel1.setLayout(new FlowLayout()); //we set the layout of the window and its GridLayout, so it will make layout accordingly
        panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel2.setLayout(new FlowLayout());
        panel3.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel3.setLayout(new FlowLayout());

        /*---- For Button and Label ------*/
        //Button
        panel1.add(button);
        button.addActionListener(this); //adding an event listener

        //Label
        label.setVerticalAlignment(JLabel.CENTER);
        panel1.add(label);
        /*------ End --------*/

        /*---- For Check Box and Combo Box ------*/
        //ComboBox
        comboBox.addActionListener(this);
        panel2.add(comboBox);

        //CheckBox
        checkBox.addActionListener(this);
        panel2.add(checkBox);
        //Label
        panel2.add(label2);

        /*------ End --------*/

        /*---- For JList and JTable ------*/

        //list
        panel3.add(list);

        //table
        JScrollPane scrollPane = new JScrollPane(table); //this is required if we want to display the headers.
        panel3.add(scrollPane);

        /*------ End --------*/

        //The below properties are required for the Frame to display properly
        frame.add(panel1, BorderLayout.NORTH); //Adding first panel to the top
        frame.add(panel2, BorderLayout.CENTER); //Adding 2nd panel to center
        frame.add(panel3, BorderLayout.SOUTH); //Adding 3rd panel to bottom
        frame.setSize(1500, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swings Demo");//We can pass any string we want in this and this will be the window title.
        frame.pack(); //.pack() will bundle all the components and display it on the frame.
        frame.setVisible(true);
    }

    //Main method to run the Swings program.
    public static void main(String[] args) {
        new SwingsDemo();
    }

    //Below is the event listener method which is hooked to the components.
    @Override
    public void actionPerformed(ActionEvent e) {
        //As we are using the same event listener method for all, we will check which component it is
        if(e.getSource() == button) {
            count++;
            label.setText("Number of Clicks: " + count);
        } else if(e.getSource() == comboBox) {
            selectedComboBoxItem = comboBox.getSelectedItem().toString(); //get access to the selected Value
            System.out.println("Selected Item: " + selectedComboBoxItem);
            label2.setText("Selected ComboBox Item: " + selectedComboBoxItem + " And CheckBox Value is: " + checkBoxValue);
        } else if(e.getSource() == checkBox) {
            checkBoxValue = checkBox.isSelected();
            label2.setText("Selected ComboBox Item: " + selectedComboBoxItem + " And CheckBox Value is: " + checkBoxValue);
            System.out.println("CheckBox: " + checkBoxValue);
        }
    }
}
