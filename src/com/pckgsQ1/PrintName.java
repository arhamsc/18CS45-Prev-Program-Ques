package com.pckgsQ1;/* import 'MyClass' class from 'pckgsQ1' myPackage */
//import myPackage.MyClass;

import com.pckgsQ1.MyClass;

public class PrintName {
    public static void main(String args[]) {
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
