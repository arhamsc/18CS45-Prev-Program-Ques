/*6. Write a swing program for displaying anyone of the options: apple, orange, mango, grapes,
through the selection of combobox by clicking show button. */

package com.swingsQ6;
import javax.swing.JFrame;
import javax.swing.JComboBox;    
public class JComboBoxExample {    
    JFrame f; 
    JComboBox<String> cb;   
    JComboBoxExample(){    
        f = new JFrame();
        f.setTitle("Fruits");    
        String fruits[] = {"Apple","Orange","Mango","Grapes"};        
        cb = new JComboBox<String>(fruits);    
        cb.setBounds(50, 50,90,20);    
        f.add(cb);        
        f.setLayout(null);    
        f.setSize(400,500);    
        f.setVisible(true);         
    }    
    public static void main(String[] args) {    
        new JComboBoxExample();         
    }    
}   