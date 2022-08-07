package com.pckgsQ2;

public class Main {
    public static void main(String[] args) {
        /*
        * Below the abstraction is achieved by declaring myMobile with Telephone interface
        * and instantiating it with MobilePhone() class
        * By doing this the implementation of methods in MobilePhone class has been hidden.
        * We are passing myNumber 99999999 to the constructor.
        *
        * Syntax: InterfaceName instanceName = new ImplementingClassName();
        * */

        Telephone myMobile = new MobilePhone(999999999);

        myMobile.powerOn(); //prints "Phone has been switched On."
        System.out.println(myMobile.isRinging()); // prints "false"
        myMobile.dial(999999999); //prints "Dialing the phone: 999999999"
        System.out.println(myMobile.isRinging());// print "true"

        myMobile.dial(888888888); //prints "Phone: 888888888 doesn't match."
        System.out.println(myMobile.isRinging()); // prints "false"
    }
}
