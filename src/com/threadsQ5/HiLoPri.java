package com.threadsQ5;

/*  5- Develop a program to demonstrate Thread priorities in Java and how to assign it.*/
/*Thread priorities are used by the thread scheduler to decide when each thread should be allowed to run. In theory, higher-priority threads get more CPU time than lower-priority threads. In practice, the amount of CPU time that a thread gets often depends on several factors besides its priority. (For example, how an operating system implements multitasking can affect the relative availability of CPU time.) A higher-priority thread can also preempt a lower-priority one. For instance, when a lower-priority thread is running and a higher-priority thread resumes (from sleeping or waiting on I/O, for example), it will preempt the lowerpriority thread.
To set a thread’s priority, use the setPriority( ) method, which is a member of Thread.
This is its general form:
final void setPriority(int level)
Here, level specifies the new priority setting for the calling thread. The value of level must be
within the range MIN_PRIORITY and MAX_PRIORITY. Currently, these values are 1 and
10, respectively. To return a thread to default priority, specify NORM_PRIORITY, which is
currently 5. These priorities are defined as static final variables within Thread.
You can obtain the current priority setting by calling the getPriority( ) method of Thread,
shown here:
final int getPriority( )
The following example demonstrates two threads at different priorities, which do not run on a preemptive platform in the same way as they run on a nonpreemptive platform. One thread is set two levels above the normal priority, as defined by Thread.NORM_ PRIORITY, and the other is set to two levels below it. The threads are started and allowed to run for ten seconds. Each thread executes a loop, counting the number of iterations. After ten seconds, the main thread stops both threads. The number of times that each thread made it through the loop is then displayed. The use of volatile prevents this optimization, telling Java that running may change in ways not directly apparent in the immediate code.
*/
// Demonstrate thread priorities.
class Clicker implements Runnable {
    long click = 0;
    Thread t;
    private volatile boolean running = true;

    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}

class HiLoPri {
    public static void main(String args[]) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        lo.stop();
        hi.stop();
// Wait for child threads to terminate.
        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}/*
 output -
Low-priority thread: 4408112
High-priority thread: 589626904
*/
