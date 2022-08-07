package com.threadsQ2;

//Question: How synchronisation can be achieved between threads in Java? Explain with an example
// (or)
// Explain synchronisation using synchronised methods.
// (Or)
// Different use of Synchronisation in Java with example
// - for this version a different real life scenario can be used.

/*
* Synchronization is when a set of processes or executions have to follow a particular order or should be SYNCHRONOUS.
* In Java when Multiple Threads are executing simultaneously and accessing one resource:
* (Without Synchronization)
* Thread 1 can make changes to the resource and Thread 2 can produce some unexpected result due the changes caused by
* Thread 1 into the resource. To avoid this we use synchronization concept.
* (With Synchronization)
* Thread 2 will execute only after Thread 1 has finished its process or according to what we have specified the
* behaviour of the threads to be. There will only be one Thread making changes to the resource at a time.
*
* Syntax: synchronized(objectIdentifier) { //ObjectIdentifier can be the resource in question
   Access shared variables and other shared resources
}
* */

public class Synchronization extends Thread{
    private Thread th;
    private String thName;
    Print5Nums p5n;

    public Synchronization(String thName, Print5Nums p5n) {
        this.thName = thName;
        this.p5n = p5n;
    }

    @Override
    public void run() {
        synchronized (p5n) { //Passing our resource to the synchronized method.
            p5n.print5Nums();
        }
        System.out.println("Thread: " + thName + " exiting.");
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting Thread: " + thName);

        if(th == null) { //if there are no threads running then create a new thread when this class is called.
            th = new Thread(this, thName);
            th.start();
        }
    }

    public static void main(String[] args) {
        Print5Nums p5n = new Print5Nums();

        Synchronization thread1 = new Synchronization("1", p5n);
        Synchronization thread2 = new Synchronization("2", p5n);

        thread1.start();
        thread2.start();


        //Waiting for threads to end.
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
    }
}

/*
* OutPut:
* Starting Thread: 1
Starting Thread: 2
Number: - 0
Number: - 1
Number: - 2
Number: - 3
Number: - 4
Number: - 0
Number: - 1
Number: - 2
Number: - 3
Number: - 4
Thread: 2 exiting.
Thread: 1 exiting.
* */