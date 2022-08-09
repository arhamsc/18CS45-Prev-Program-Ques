package com.threadsQ7;
/*Explain the following with syntax and example:
i. wait()
ii. notify()
iii. notifyAll() */

/*The Object class in Java has three final methods that allow threads to communicate about the 
locked status of a resource. 
i. wait():
It tells the calling thread to give up the lock and go to sleep until some other thread enters the same 
monitor and calls notify(). The wait() method releases the lock prior to waiting and reacquires the 
lock prior to returning from the wait() method. General Syntax:
                            final void wait( ) throws InterruptedException
                            
ii. notify():
It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not
actually give up a lock on a resource. It tells a waiting thread that that thread can wake up. However, the lock is not
actually given up until the notifier’s synchronized block has completed.

So, if a notifier calls notify() on a resource but the notifier still needs to perform 10 seconds of actions on the resource
within its synchronized block, the thread that had been waiting will need to wait at least another additional 10 seconds for
the notifier to release the lock on the object, even though notify() had been called. General Syntax:
                            final void notify( )
                            
iii. notifyAll():
final void notifyAll( ):
It wakes up all the threads that called wait() on the same object. The highest priority thread will run first in most of the 
situation, though not guaranteed. Other things are same as notify() method above. General syntax:
                            final void notifyAll( )*/



