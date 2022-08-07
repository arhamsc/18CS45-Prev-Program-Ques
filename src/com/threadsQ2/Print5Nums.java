package com.threadsQ2;

//This class will serve as the resource class or object for us
public class Print5Nums {
    public void print5Nums() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Number: - " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted.");
        }
    }
}
