package com.ThreadsQ4;

/*4- What is a Thread? Explain the two ways of creating a Thread in Java.*/
/*A thread is a lightweight sub process, a smallest unit of processing. It is a separate path of execution. 
Threads are independent, if there occurs exception in one thread, it doesn't affect other threads. 
It shares a common memory area Main Thread When a Java program starts up, one thread begins running immediately. 
This is usually called the main thread of your program, because it is the one that is executed when your program begins. 
The main thread is important for two reasons:
 • It is the thread from which other “child” threads will be spawned. 
• Often, it must be the last thread to finish execution because it performs various shutdown actions.
Eg- In the below  program, a reference to the current thread (the main thread, in this case) is obtained by calling currentThread( ), 
and this reference is stored in the local variable t. Next, the program displays information about the thread. 
The program then calls setName( ) to change the internal name of the thread. Information about the thread is then redisplayed.
Next, a loop counts down from five, pausing one second between each line. The pause is accomplished by the sleep( ) method. 
The argument to sleep( ) specifies the delay period in milliseconds. Notice the try/catch block around this loop.
The sleep( ) method in Thread might throw an InterruptedException.
This would happen if some other thread wanted to interrupt this sleeping one. 
This example just prints a message if it gets interrupted. In a real program, you would need to handle this differently.
// Controlling the main Thread.*/
class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
// change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
/*Output –
Current thread: Thread[main,5,main]
After name change: Thread[My Thread,5,main]
5
4
3
2
1
*//*
In the most general sense, you create a thread by instantiating an object of type Thread.
Java defines two ways in which this can be accomplished:
• You can implement the Runnable interface.
• You can extend the Thread class, itself.*/
/*Reference-Java: The Complete Reference, Seventh Edition*/
