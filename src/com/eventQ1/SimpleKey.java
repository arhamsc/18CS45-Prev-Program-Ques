/*1-Explain delegation event model with suitable example.*/
/*Event handling is fundamental to Java programming because it is integral to the creation of applets and other types of GUI-based programs.As applets are event-driven programs that use a graphical user interface to interact with the user. Furthermore, any program that uses a graphical user interface, such as a Java application written for Windows, is event driven. Thus, you cannot write these types of programs without a solid command of event handling. Events are supported by a number of packages, including java.util, java.awt, and java.awt.event.
The modern approach to handling events is based on the delegation event model, which defines standard and consistent mechanisms to generate and process events. Its concept is quite simple: a source generates an event and sends it to one or more listeners. In this scheme, the listener simply waits until it receives an event. Once an event is received, the listener processes the event and then returns. The advantage of this design is that the application logic that processes events is cleanly separated from the user interface logic that generates those events. A user interface element is able to “delegate” the processing of an event to a separate piece of code.
In the delegation event model, listeners must register with a source in order to receive an event notification. This provides an important benefit: notifications are sent only to listeners that want to receive them. This is a more efficient way to handle events than the design used by the old Java 1.0 approach
The following sections define events and describe the roles of sources and listeners.
a-Events
an event is an object that describes a state change in a source. It can be generated as a consequence of a person interacting with the elements in a graphical user interface. Some of the activities that cause events to be generated are pressing a button, entering a character via the keyboard, selecting an item in a list, and clicking the mouse. Many other user operations could also be cited as examples. Events may also occur that are not directly caused by interactions with a user interface. For example, an event may be generated when a timer expires, a counter exceeds a value, a software or hardware failure occurs, or an operation is completed.
b-Event Sources
A source is an object that generates an event. This occurs when the internal state of that object
changes in some way. Sources may generate more than one type of event.
A source must register listeners in order for the listeners to receive notifications about
a specific type of event. Each type of event has its own registration method. Here is the
general form:
public void addTypeListener(TypeListener el)
Here, Type is the name of the event, and el is a reference to the event listener. For example,
the method that registers a keyboard event listener is called addKeyListener( ). The method
that registers a mouse motion listener is called addMouseMotionListener( ). When an event
occurs, all registered listeners are notified and receive a copy of the event object. This is known
as multicasting the event. In all cases, notifications are sent only to listeners that register to
receive them. Some sources may allow only one listener to register. The general form of such a method
is this:
public void addTypeListener(TypeListener el)
throws java.util.TooManyListenersException
Here, Type is the name of the event, and el is a reference to the event listener. When such
an event occurs, the registered listener is notified. This is known as unicasting the event.
A source must also provide a method that allows a listener to unregister an interest
in a specific type of event. The general form of such a method is this:
public void removeTypeListener(TypeListener el)
Here, Type is the name of the event, and el is a reference to the event listener. For example,
to remove a keyboard listener, you would call removeKeyListener( ).
The methods that add or remove listeners are provided by the source that generates
events.
c-Event Listeners
A listener is an object that is notified when an event occurs. It has two major requirements.
First, it must have been registered with one or more sources to receive notifications about
specific types of events. Second, it must implement methods to receive and process these
notifications.
The methods that receive and process events are defined in a set of interfaces found in
java.awt.event. For example, the MouseMotionListener interface defines two methods to
receive notifications when the mouse is dragged or moved. Any object may receive and process
one or both of these events if it provides an implementation of this interface.
Example to demonstrate key eevent handlers*/
// Demonstrate the key event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="SimpleKey" width=300 height=100>
</applet>
*/
public class SimpleKey extends Applet
implements KeyListener {
String msg = "";
int X = 10, Y = 20; // output coordinates
public void init() {
addKeyListener(this);
}
public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
}
public void keyReleased(KeyEvent ke) {
showStatus("Key Up");
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}
// Display keystrokes.
public void paint(Graphics g) {
g.drawString(msg, X, Y);
}
}
