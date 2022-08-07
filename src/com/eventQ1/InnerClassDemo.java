/*2. Explain Inner class with an example.*/
/*an inner class is a class defined within another class, or even within an expression. inner classes can be used to simplify the code when using event adapter classes.
Here, InnerClassDemo is a top-level class that extends Applet. MyMouseAdapter is an inner class that extends MouseAdapter. Because MyMouseAdapter is defined within the scope of InnerClassDemo, it has access to all of the variables and methods within the scope of that class. Therefore, the mousePressed( ) method can call the showStatus( ) method directly. It no longer needs to do this via a stored reference to the applet. Thus, it is no longer necessary to pass MyMouseAdapter( ) a reference to the invoking object.
*/
// Inner class demo.
import java.applet.*;
import java.awt.event.*;
/*
<applet code="InnerClassDemo" width=200 height=100>
</applet>
*/
public class InnerClassDemo extends Applet {
 
public void init() {
addMouseListener(new MyMouseAdapter());
}
class MyMouseAdapter extends MouseAdapter {
public void mousePressed(MouseEvent me) {
showStatus("Mouse Pressed");
}
}
}
/*Reference-Java: The Complete Reference, Seventh Edition*/
