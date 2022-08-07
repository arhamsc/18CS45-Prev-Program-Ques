package com.pckgsQ2;

/*
 * Below is the class implementing the interface Telephone.
 * Keyword is "implement"
 * All Methods of interface have to be overridden.
 *
 * Syntax: access_specifier class class_name implements InterfaceName{ }
 * */
public class MobilePhone implements Telephone {
    private int myNumber;
    private boolean ringing = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone has been switched On.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(phoneNumber == myNumber) { //Dial the number only if the mobile phone belongs to me
            System.out.println("Dialing the phone: " + phoneNumber);
            ringing = true;
        } else {
            System.out.println("Phone: " + phoneNumber + " doesn't match.");
            ringing = false;
        }
    }

    @Override
    public boolean isRinging() {
        return ringing;
    }
}
