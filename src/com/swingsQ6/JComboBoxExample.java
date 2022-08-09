package com.swingsQ6;
import javax.swing.JFrame;
import javax.swing.JComboBox;    
public class JComboBoxExample {    
    JFrame f; 
    JComboBox cb;   
    JComboBoxExample(){    
        f = new JFrame();
        f.setTitle("Fruits");    
        String fruits[] = {"Apple","Orange","Mango","Grapes"};        
        cb = new JComboBox(fruits);    
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