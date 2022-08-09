/*5. Write a swing program to create a table with column heading as StudentName, USN, Address
and inset 5 Records into the table and display on screen. */


package com.swingsQ5;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentRecordTable {
    JFrame f;
    JTable j;

    StudentRecordTable()
    {
        f = new JFrame();
        f.setTitle("Student Records");

        String[][] data = {
            { "Motu", "1BH18CS001", "Yelahanka" },
            { "Patlu", "1BH18CS023", "Vidyaranyapura"},
            { "Raju", "1BH18CS069", "RT Nagar"},
            { "Ravi", "1BH18CS420", "Whitefield"},
            { "Krishna","1BH18CS004", "Koramangala"}

        };

        String[] columnNames = { "Student Name", "USN", "Address" };
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new StudentRecordTable();
    }
    
}
