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
-Built-in Package:- In java, we already have various pre-defined packages and these packages contain large numbers of classes and interfaces that we used in java are known as Built-in packages.Existing Java package for example java.lang, java.util etc.
Example program for a built in package java.lang-*/
import java.lang.*;
 
 class example_lang {
   public static void main(String args []) {
      int a = 100, b = 200,maxi;
      maxi = Math.max(a,b);
      System.out.printf("Maximum is = "+maxi);
    }
 }
/*output
Maximum is = 200
*/
/*In the above-mentioned example, we use the lang package and Math class to find the maximum of two-digit using the “max” function. first, we created a three integer variable named “a” and “b” and maxi. where a = 100 and b = 200 and maxi will store the maximum value from a or b. After assigning values to the variable we used the max function to find the maximum and stored it in maxi. so in desired output, we can see a maximum of two numbers and that is 200.  

- User-defined-package:- Java package created by user to categorized classes and interface. These are the packages that are defined by the user. Eg program-First we create a directory myPackage (name should be same as the name of the package). Then create the MyClass inside the directory with the first statement being the package names.*/
// Name of the package must be same as the directory
// under which this file is saved
package myPackage;

public class MyClass
{
    public void getNames(String s)
    {        
        System.out.println(s);        
    }
}

/* import 'MyClass' class from 'names' myPackage */
import myPackage.MyClass;
public class PrintName 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "GeeksforGeeks";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      obj.getNames(name);
   }
}
/*Output
GeeksforGeeks*/
/*
Import command
Java includes the import statement to bring certain classes, or entire packages, into visibility. Once imported, a class can be referred to directly, using only its name. The import statement is a convenience to the programmer and is not technically needed to write a complete Java program. If you are going to refer to a few dozen classes in your application, however, the import statement will save a lot of typing.
In a Java source file, import statements occur immediately following the package statement
(if it exists) and before any class definitions. This is the general form of the import statement:
import pkg1[.pkg2].(classname|*);
Here, pkg1 is the name of a top-level package, and pkg2 is the name of a subordinate
package inside the outer package separated by a dot (.). There is no practical limit on the
depth of a package hierarchy, except that imposed by the file system. Finally, you specify
either an explicit classname or a star (*), which indicates that the Java compiler should import
the entire package. This code fragment shows both forms in use:*/
import java.util.Date;
import java.io.*; The star form may increase compilation time—especially if you import several large packages. the star form has absolutely no effect on the run-time performance or size of your classes
eg-program
package MyPack;
/* Now, the Balance class, its constructor, and its
show() method are public. This means that they can
be used by non-subclass code outside their package.
*/
public class Balance {
String name;
double bal;
public Balance(String n, double b) {
name = n;
bal = b;
}
public void show() {
if(bal>0)
System.out.print("--> ");
System.out.println(name + ": $" + bal);
}
}
the Balance class is public. Also, its constructor and its show( ) method are public, too. This means that they can be accessed by any type of code outside the MyPack package
here TestBalance imports MyPack and is then able to make use of the Balance class:
import MyPack.*;
class TestBalance {
public static void main(String args[]) {
/* Because Balance is public, you may use Balance
class and call its constructor. */
Balance test = new Balance("J. J. Jaspers", 99.88);
test.show(); // you may also call show()
}
}
/*Output
J. J. Jaspers : $ 99.88*/

