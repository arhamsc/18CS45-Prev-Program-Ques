package com.ThreadsQ4;

/*Implementing Runnable
Runnable abstracts a unit of executable code. a thread can be constructed on any object that
implements Runnable. To implement Runnable, a class need only implement a single method
called run( ), which is declared like this:
public void run( )
The only difference is that run( ) establishes the entry point for another, concurrent thread of execution within your program. This thread will end when run( ) returns.
After you create a class that implements Runnable, you will instantiate an object of type
Thread from within that class. Thread defines several constructors. The one that we will use
is shown here:
Thread(Runnable threadOb, String threadName)
In this constructor, threadOb is an instance of a class that implements the Runnable interface.
This defines where execution of the thread will begin. The name of the new thread is specified
by threadName.
After the new thread is created, it will not start running until you call its start( ) method,
which is declared within Thread. In essence, start( ) executes a call to run( ). The start( )
method is shown here:
void start( )
Here is an example that creates a new thread and starts it running:*/
// Create a second thread.
class NewThread implements Runnable {
    Thread t;

    NewThread() {
// Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        new NewThread(); // create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
//Chapter 11: Multithreaded Programming 229
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}/*
Output-
Child thread: Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Main Thread: 4
Child Thread: 3
Child Thread: 2
Main Thread: 3
Child Thread: 1
Exiting child thread.
Main Thread: 2
Main Thread: 1
Main thread exiting.
*/
