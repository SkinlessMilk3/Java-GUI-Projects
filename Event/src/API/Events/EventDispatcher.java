package API.Events;

import API.Events.Event;

public class EventDispatcher<T extends Event> {

    EventDispatcher(Event event){
        m_Event = event;
    }

    boolean Dispatch(Event ev/*Callback function interfaces may need to be used
    in this parameter. Achieving the same as the c++ variant. */){
        /*<NOTE> What I will need to know is how these interfaces will
        be used later.
         */

        //if(m_Event.GetEventType() == ev.GetEventType()){//function passed through interface/*T.GetStaticType()*/){
            // function passed in would only be called if it matches the
            // signature of the function pointer EventFn from the video.
            // This if is just a safety thing to prevent incompatible
            // functions from being used.
            //m_Event.m_handled = true;
            m_Event.toString();
        //}
        return false;// The event types don't match
    }

    Event m_Event;
}
