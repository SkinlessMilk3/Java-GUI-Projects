package API.Events;
//import Events.EventType;
//import Events.EventCategory;

public abstract class Event {

    //friend EventDispatcher
    String GetName(){ return toString(); }
    abstract int GetCategoryFlags();
    public abstract String toString();
    abstract EventType GetEventType();

    static EventType GetStaticType(){ return null; }

    abstract boolean IsInCategory(EventCategory category);

    //public abstract void handle();//I think this method belongs in my listeners because they call a dispatch
    // method.
    boolean m_handled;
}
