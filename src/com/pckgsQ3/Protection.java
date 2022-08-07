/* 3-Explain the different access specifies in JAVA with example. */
/*For example, in private member of a class is granted only to other members of that class. Packages add another dimension to access control. 
Java provides many levels of protection to allow fine-grained control over the visibility of variables and methods within classes, subclasses, and packages.
Classes and packages are both means of encapsulating and containing the name space and scope of variables and methods. 
Packages act as containers for classes and other subordinate packages. Classes act as containers for data and code. The class is Java’s smallest unit of abstraction. 
Because of the interplay between classes and packages, Java addresses four categories of visibility for class members: 
• Subclasses in the same package 
• Non-subclasses in the same package
 • Subclasses in different packages
 • Classes that are neither in the same package nor subclasses
The three access specifiers, private, public, and protected, provide a variety of ways to produce the many levels of access required by these categories.
Anything declared public can be accessed from anywhere. Anything declared private cannot be seen outside of its class.
When a member does not have an explicit access specification, it is visible to subclasses as well as to other classes in the same package. 
This is the default access. If you want to allow an element to be seen outside your current package.
A non-nested class has only two possible access levels: default and public. When a class is declared as
public, it is accessible by any other code. If a class has default access, then it can only be accessed
by other code within its same package. When a class is public, it must be the only public class declared in the file, and the file must have the same name as the class.
 

For example- The source for the given example  package defines three classes: Protection, Derived, and SamePackage
. The first class defines four int variables in each of the legal protection modes. The variable n is declared with the default protection,
n_pri is private, n_pro is protected, and n_pub is public.
*/
package com.pckgsQ3;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

//This is file Derived.java:
//package p1;
class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
// class only
// System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

//This is file SamePackage.java:
//package p1;
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
// class only
// System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
/*Reference-Java: The Complete Reference, Seventh Edition*/
