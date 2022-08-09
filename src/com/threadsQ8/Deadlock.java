/*8. What is meant by deadlock?How to avoid deadlock? Give example.*/

/*A special type of error that you need to avoid that relates specifically to multitasking is
deadlock, which occurs when two threads have a circular dependency on a pair of synchronized
objects. For example, suppose one thread enters the monitor on object X and another thread
enters the monitor on object Y. If the thread in X tries to call any synchronized method on Y,
it will block as expected. However, if the thread in Y, in turn, tries to call any synchronized
method on X, the thread waits forever, because to access X, it would have to release its own
lock on Y so that the first thread could complete. Deadlock is a difficult error to debug for
two reasons:
• In general, it occurs only rarely, when the two threads time-slice in just the right way.
• It may involve more than two threads and two synchronized objects. 

Methods to avoid deadlock: 
    1)  Avoid Unnecessary Locks: We should use locks only for those members on which it is required. 
    Unnecessary use of locks leads to a deadlock situation. We recommend you to use a lock-free data 
    structure. If possible, keep your code free form locks. For example, instead of using synchronized
    ArrayList use the ConcurrentLinkedQueue.

    2)  Avoid Nested Locks: Another way to avoid deadlock is to avoid giving a lock to multiple threads if 
    we have already provided a lock to one thread. Since we must avoid allocating a lock to multiple threads.

    3)  Using Thread.join() Method: You can get a deadlock if two threads are waiting for each other to 
    finish indefinitely using thread join. If your thread has to wait for another thread to finish, it's 
    always best to use join with the maximum time you want to wait for the thread to finish.

    4)  Use Lock Ordering: Always assign a numeric value to each lock. Before acquiring the lock with a 
    higher numeric value, acquire the locks with a lower numeric value.

    5)  Lock Time-out: We can also specify the time for a thread to acquire a lock. If a thread does not 
    acquire a lock, the thread must wait for a specific time before retrying to acquire a lock.
*/
package com.threadsQ8;

class A {
    public synchronized void last() {
        System.out.println("Inside A, last() method");
    }

    public synchronized void d1(B b) {
        System.out.println(
                "Thread1 start execution of d1() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread1 trying to call B's last() method");
        b.last();
    }
}

class B {
    public synchronized void last() {
        System.out.println("Inside B, last() method");
    }

    public synchronized void d2(A a) {
        System.out.println(
                "Thread2 start execution of d2() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread2 trying to call A's last() method");
        a.last();
    }
}

class Deadlock extends Thread {
    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d1(b);
    }

    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.m1();
    }
}

/*Here, the cursor is forever shown in the output as a deadlock occurs when d1() and d2()(which are synchronized for a and b)
 try to call their respective synchronized last() functions. To avoid deadlock, we would remove the synchronized keyword for the methods 
 in at least one class */