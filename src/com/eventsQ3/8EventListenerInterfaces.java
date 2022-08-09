package com.eventsQ3;

/*3. Explain any 8 event listener inter-faces with syntax. */

/*The delegation event model has two parts: sources and listeners. Listeners are
created by implementing one or more of the interfaces defined by the java.awt.event package.
When an event occurs, the event source invokes the appropriate method defined by the
listener and provides an event object as its argument.

The ActionListener Interface -
This interface defines the actionPerformed( ) method that is invoked when an action event
occurs. Its general form is shown here:
void actionPerformed(ActionEvent ae)

Eight event listener interfaces are:
1)  The AdjustmentListener Interface - 
This interface defines the adjustmentValueChanged( ) method that is invoked when an
adjustment event occurs. Its general form is shown here:
                    void adjustmentValueChanged(AdjustmentEvent ae)

2)  The ComponentListener Interface -
This interface defines four methods that are invoked when a component is resized, moved,
shown, or hidden. Their general forms are shown here:
                    void componentResized(ComponentEvent ce)
                    void componentMoved(ComponentEvent ce)
                    void componentShown(ComponentEvent ce)
                    void componentHidden(ComponentEvent ce)
                    
3)  The ContainerListener Interface
This interface contains two methods. When a component is added to a container,
componentAdded( ) is invoked. When a component is removed from a container,
componentRemoved( ) is invoked. Their general forms are shown here:
                    void componentAdded(ContainerEvent ce)
                    void componentRemoved(ContainerEvent ce)
                    
4)  The FocusListener Interface
This interface defines two methods. When a component obtains keyboard focus, focusGained( )
is invoked. When a component loses keyboard focus, focusLost( ) is called. Their general
forms are shown here:
                    void focusGained(FocusEvent fe)
                    void focusLost(FocusEvent fe)
                    
5)  The ItemListener Interface
This interface defines the itemStateChanged( ) method that is invoked when the state of an
item changes. Its general form is shown here:
                    void itemStateChanged(ItemEvent ie)
                    
6)  The KeyListener Interface
This interface defines three methods. The keyPressed( ) and keyReleased( ) methods are
invoked when a key is pressed and released, respectively. The keyTyped( ) method is invoked
when a character has been entered.
For example, if a user presses and releases the A key, three events are generated in sequence:
key pressed, typed, and released. If a user presses and releases the HOME key, two key events
are generated in sequence: key pressed and released.
The general forms of these methods are shown here:
                    void keyPressed(KeyEvent ke)
                    void keyReleased(KeyEvent ke)
                    void keyTyped(KeyEvent ke)
                    
7)  The MouseListener Interface
This interface defines five methods. If the mouse is pressed and released at the same point,
mouseClicked( ) is invoked. When the mouse enters a component, the mouseEntered( )
method is called. When it leaves, mouseExited( ) is called. The mousePressed( ) and
mouseReleased( ) methods are invoked when the mouse is pressed and released, respectively.
The general forms of these methods are shown here:
                    void mouseClicked(MouseEvent me)
                    void mouseEntered(MouseEvent me)
                    void mouseExited(MouseEvent me)
                    void mousePressed(MouseEvent me)
                    void mouseReleased(MouseEvent me)

8)  The MouseMotionListener Interface
This interface defines two methods. The mouseDragged( ) method is called multiple times
as the mouse is dragged. The mouseMoved( ) method is called multiple times as the mouse
is moved. Their general forms are shown here:
                    void mouseDragged(MouseEvent me)
                    void mouseMoved(MouseEvent me)               */
