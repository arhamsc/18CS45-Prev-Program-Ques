package com.pckgsQ1;//Package Name

/*Explain packages and its types in Java with an example (or) Define a package and explain
how to create user defined package with example and explain import command.*/

/*ans-Packages in Java is a mechanism to encapsulate a group of classes, interfaces and sub
packages.To create a package is quite easy: simply include a package command as the first
statement in a Java source file. Any classes declared within that file will belong to the specified
package. The package statement defines a name space in which classes are stored. If you omit
the package statement, the class names are put into the default package, which has no name.
This is the general form of the package statement:
package pkg;
Java uses file system directories to store packages. For example, the .class files for any classes
you declare to be part of MyPackage must be stored in a directory called MyPackage.
You can create a hierarchy of packages.
package pkg1[.pkg2[.pkg3]];
Ex: package java.awt.image;
Package are categorized into two forms
-Built-in Package:- In java, we already have various pre-defined packages and these packages contain large numbers of 
classes and interfaces that we used in java are known as Built-in packages.Existing Java package for example java.lang, java.util etc.
Example program for a built in package java.lang-
import java.lang.*;
 */
 class Example_lang {
   public static void main(String args []) {
      int a = 100, b = 200,maxi;
      maxi = Math.max(a,b);
      System.out.printf("Maximum is = "+maxi);
    }
 }
/*
Output
Maximum is = 200*/
/*In the above-mentioned example, we use the lang package and Math class to find the maximum of 
two-digit using the “max” function. first, we created a three integer variable named “a” and “b” and maxi. where
a = 100 and b = 200 and maxi will store the maximum value from a or b. After assigning values to the variable we used 
the max function to find the maximum and stored it in maxi. so in desired output, we can see a maximum of two numbers and that is 200.  */
