package com.threadsQ6;
//Question:
//	Write a Java Program to create two threads, one thread displays "VTU" and other thread displays "Belagavi" 
//	on the screen continuosly


class MyThread extends Thread
{
	//Thread class which will display the message
	String str;
    public MyThread(String s)
    {
        str=s;  
    }
    public void run()
    {
        while(true)
        {   System.out.println(str);
             
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            { 
                System.out.println(ie.toString());
            }           
        }
    }
}
public class DisplayMessage
{
    public static void main(String args[])
    {	
    	//Create the "VTU" thread
        MyThread t1= new MyThread("VTU");
        //Create the "Belagavi" thread 
        MyThread t2= new MyThread("Belagavi");       
        
        //Start both Threads
        t1.start();
        t2.start();
    }
}