package com.threadsQ1;

//Question: With Syntax explain the use of isAlive() and Join() methods along with examples.

/*
 * Java allows the use of Multiple Threads to run multiple programs in parallel.
 * Java also provides us with two methods to check the STATUS of the thread in its execution
 * They are: isAlive() and join()
 * it allows one thread to wait until another thread completes its execution.
 * If t is a Thread object whose thread is currently executing,
 * then t.join() will make sure that t is terminated before the next instruction is executed by the program.
 * If there are multiple threads calling the join() methods that means overloading on join allows the programmer
 * to specify a waiting period. However, as with sleep, join is dependent on the OS for timing,
 * so you should not assume that join will wait exactly as long as you specify.
 *
 * There are three ways to implement the join method:
 * 1. join() :
 *   It will put the current thread on wait until the thread on which it is called is dead.
 *   If thread is interrupted then it will throw InterruptedException.
 *   Syntax: public final void join()
 * 2. join(long milliseconds) :
 *   It will put the current thread on wait until the thread
 *   on which it is called is dead or wait for specified time
 *   (milliseconds).
 *   Syntax: public final synchronized void join(long millis)
 * 3. join(long millis, int nanos) :
 *   It will put the current thread on wait until the thread
 *   on which it is called is dead or wait for specified time
 *   (milliseconds + nanos)
 *   Syntax: public final synchronized void join(long millis, int nanos)
 * */
public class ThreadTwo extends Thread {
    //The below methods runs two times and prints the current thread name. and the number of the current iteration.
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // creating two threads
        ThreadTwo thread1 = new ThreadTwo();
        ThreadTwo thread2 = new ThreadTwo();
        ThreadTwo thread3 = new ThreadTwo();

        // thread t1 starts
        thread1.start();

        // starts second thread after, when
        // first thread t1 has died.
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            thread1.join(); //this the join() method which is called on thread1.
        } catch (Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        // t2 starts
        thread2.start();

        // starts t3 after when thread t2 has died.
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            thread2.join();//this the join() method which is called on thread2.
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }

        thread3.start(); //Thread 3 is started only after thread 1 and thread 2 have been completed
    }
}

/*
* Output:
* Current Thread: main
Current Thread: Thread-0
0
Current Thread: Thread-0
1
Current Thread: main
Current Thread: Thread-1
0
Current Thread: Thread-1
1
Current Thread: Thread-2
0
Current Thread: Thread-2
1
* */