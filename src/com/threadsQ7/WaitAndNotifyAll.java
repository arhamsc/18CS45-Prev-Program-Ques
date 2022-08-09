package com.threadsQ7;

// Java program to demonstrate the use of wait() and notifyAll() method
class myThread extends Thread {
    int sum = 0;

    // Method in helper class
    // Declaring run method
    public void run() {

        // Synchronizing this method
        synchronized (this) {
            // Calculating the sum

            // Display message
            System.out.println("child thread start calculation");

            // Iterating to calculate the sum
            for (int i = 0; i <= 100; i++)
                // Updating the current sum where
                // last updated sum is final sum
                sum += i;

            // Display message
            System.out.println("child thread trying to give notification");

            // This keyword refers to current object itself

            // Notifying the current waiting thread
            // using notifyAll() method
            this.notifyAll();
        }
    }
}

class WaitAndNotifyAll {
    public static void main(String[] args)
            throws InterruptedException {

        // Creating a thread object
        // in the main() method of
        // our helper class above
        myThread t1 = new myThread();

        // Starting the above thread created
        // using the start() method
        t1.start();

        // Synchronizing the thread
        synchronized (t1) {
            // Display message
            System.out.println(
                    "main thread trying to call wait method");

            // Putting the thread in the waiting state
            // using the wait() method
            t1.wait();

            // Display message
            System.out.println("main thread get notify");

            // Print and display the sum
            System.out.println(t1.sum);
        }
    }
}