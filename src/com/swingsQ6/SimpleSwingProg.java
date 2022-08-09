/*7. Explain a simple swing application with program */

/*The following program shows one way to write a Swing application.
In the process, it demonstrates several key features of Swing. It uses two Swing components:
JFrame and JLabel. JFrame is the top-level container that is commonly used for Swing
applications. JLabel is the Swing component that creates a label, which is a component that
displays information. The label is Swing’s simplest component because it is passive. That is,
a label does not respond to user input. It just displays output. The program uses a JFrame
container to hold an instance of a JLabel. The label displays a short text message. */

// A simple Swing application.
package com.swingsQ6;

import javax.swing.*;

class SimpleSwingProg {
    SimpleSwingProg() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Swing Application");
        // Give the frame an initial size.
        jfrm.setSize(275, 100);
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a text-based label.
        JLabel jlab = new JLabel(" Swing means powerful GUIs.");
        // Add the label to the content pane.
        jfrm.add(jlab);
        // Display the frame.
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleSwingProg();
            }
        });
    }
}

/*The program begins by importing javax.swing. javax.swing defines classes that implement labels, 
buttons, text controls, and menus. It will be included in all programs that use Swing.
Next, the program declares the SwingDemo class and a constructor for that class. The
constructor is where most of the action of the program occurs. 

It begins by creating a JFrame,
using this line of code:
                JFrame jfrm = new JFrame("A Simple Swing Application"); 
This creates a container called jfrm that defines a rectangular window complete with a title
bar; close, minimize, maximize, and restore buttons; and a system menu. Thus, it creates a
standard, top-level window. The title of the window is passed to the constructor.

Next, the window is sized, using setSize:
                jfrm.setSize(275, 100);

By default, when a top-level window is closed (such as when the user clicks the close
box), the window is removed from the screen, but the application is not terminated. While
this default behavior is useful in some situations, it is not what is needed for most applications.
Instead, you will usually want the entire application to terminate when its top-level
window is closed. There are a couple of ways to achieve this. The easiest way is to call
setDefaultCloseOperation( ), as the program does:
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

The next line of code creates a Swing JLabel component:
                JLabel jlab = new JLabel(" Swing means powerful GUIs.");
JLabel is the simplest and easiest-to-use component because it does not accept user input. It
simply displays information, which can consist of text, an icon, or a combination of the two.   

The next line of code adds the label to the content pane of the frame:
                jfrm.add(jlab);

The last statement in the SwingDemo constructor causes the window to become visible:
                jfrm.setVisible(true);
The setVisible( ) method is inherited from the AWT Component class. If its argument is
true, the window will be displayed. Otherwise, it will be hidden. By default, a JFrame is
invisible, so setVisible(true) must be called to show it.

Inside main( ), a SwingDemo object is created, which causes the window and the label to
be displayed.
*/