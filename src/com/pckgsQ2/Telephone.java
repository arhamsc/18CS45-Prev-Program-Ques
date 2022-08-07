package com.pckgsQ2;

//Question: Explain interface in Java using suitable code.
/*
* An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
* An interface in Java is a blueprint of a class.
* A Java interface contains static constants and abstract methods.
* It is a way to achieve abstraction in Java.
* Interfaces cannot be instantiated
* Keyword is: - "interface"
*
* Syntax: access_specifier interface interface_name { }
* */
public interface Telephone {
    /*
    * 1. Access Specifiers like public, private are required as all methods are public.
    * 2. Classes can IMPLEMENT multiple interfaces.
    * 3. All methods of the interface have to be implemented/overridden
    * 4. Variables can also be declared.
    * */

    void powerOn();
    void dial(int phoneNumber);
    boolean isRinging();
}

