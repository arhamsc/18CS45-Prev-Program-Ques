package com.threadsQ1;

//Question: With Syntax explain the use of isAlive() and Join() methods along with examples.

/*
* Java allows the use of Multiple Threads to run multiple programs in parallel.
* Java also provides us with two methods to check the STATUS of the thread in its execution
* They are: isAlive() and join()
* isAlive() method returns "true" if the thread upon which it is called is still running or else
* it returns false.
* Return Type: boolean
* Implemented On: Threads
*
* Syntax: final boolean isAlive()
* */
public class ThreadOne extends Thread{

    /*
    * run() method from Thread class has to be overridden in order to run our logic
    * */
    @Override
    public void run() {
        System.out.println("Starting of Thread..... ");

        try {
            /*
            * Below Thread.sleep() is to simulate the sleeping state of the thread or
            * to demonstrate the pausing of thread execution.
            * In this isAlive() should return false as it is sleeping.
            * */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of Thread.....");
    }

    public static void main(String[] args) {
        ThreadOne thread1 = new ThreadOne();
        ThreadOne thread2 = new ThreadOne();

        thread1.start();
        //thread2.start();

        /*
        * thread1.isAlive() will return true if thread1 is running or executing.
        * in our example:
        * thread1 has been started as the start() method has been called above,
        * so thread1.isAlive() will return true.
        * But thread2.start() is commented which means that it has not been called,
        * sp thread2.isAlive() returns false.
        * */
        System.out.println(thread1.isAlive());// print "true"
        System.out.println(thread2.isAlive());// prints "false"

        /*
        * Output:
        * true
          false
          Starting of Thread.....
          End of Thread.....
        */
    }
}
