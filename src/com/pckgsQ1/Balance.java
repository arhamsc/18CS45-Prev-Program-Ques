/*Import command
Java includes the import statement to bring certain classes, or entire packages, into visibility. Once imported, a class can be referred to directly, using only its name. The import statement is a convenience to the programmer and is not technically needed to write a complete Java program. If you are going to refer to a few dozen classes in your application, however, the import statement will save a lot of typing.
In a Java source file, import statements occur immediately following the package statement
(if it exists) and before any class definitions. This is the general form of the import statement:
import pkg1[.pkg2].(classname|*);
Here, pkg1 is the name of a top-level package, and pkg2 is the name of a subordinate
package inside the outer package separated by a dot (.). There is no practical limit on the
depth of a package hierarchy, except that imposed by the file system. Finally, you specify
either an explicit classname or a star (*), which indicates that the Java compiler should import
the entire package. This code fragment shows both forms in use:
import java.util.Date;
import java.io.*; The star form may increase compilation time—especially if you import several large packages. the star form has absolutely no effect on the run-time performance or size of your classes
eg-program*/
package com.pckgsQ1; //Package Name
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
/*the Balance class is public. Also, its constructor and its show( ) method are public, too. This means that they can be accessed by any type of code outside the MyPack package
here TestBalance imports MyPack and is then able to make use of the Balance class:*/
