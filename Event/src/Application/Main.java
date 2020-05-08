package Application;
import API.Events.*;
import API.EventListeners.*;
import java.awt.Window;
//import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {


/* The listener is listening for an event. The events inform listeners that the event happened.
* The events are passed to the listeners by the Components.
* Site: https://www.javaworld.com/article/2077351/events-and-listeners.html
*
* To recieve a KeyPressed event the listener should be a KeyPressedListener or of a different name. Just need
* to ensure compatibility in that the listener is prepared to receive that kind of event.
*
* The component using this particular instance of the KeyPressed event has to keep track of its listeners. That
* way they can be notified.
*
* A component will notify its listeners by looping through its list of listeners passing to their dispatch
* functions the event. Each listener I believe can have their own handle() defined making them unique because of
* how the handle() can have its logic defined in the application after object instantiation.
*
* When an event occurs the compoents call the listeners of that event dispatch funtions.
* These in turn call the handle() with the application defined logic.
*
* */

/*new KeyPressedEvent(4,5){
    public void handle(){

    }
};*/
        //key.onKeyPressed(new KeyPressedEvent(5,4));
        /* .setOnAction(new EventHandler<>()({
        /*,setOnAction() is the dispatch method for this event.
        **/

        /*public void handle(){
        //When we use the javafx API this is what we use to define the logic of
        // what should happen when the event occurs. This makes sense so I should
        // use something similar to define logic

        }});
         */
    }
}
