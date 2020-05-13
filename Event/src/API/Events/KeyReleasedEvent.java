package API.Events;
//import Events.EventType;
//import Events.EventCategory;

public class KeyReleasedEvent extends Event {

    int m_keycode;
    protected KeyReleasedEvent(int keycode) {
        m_keycode = keycode;
    }

    @Override
    public String toString(){
        return GetName();
    }

    //@Override
    public EventType GetEventType() {
        return GetStaticType();
    }

    static public EventType GetStaticType() {
        return EventType.keyreleased;
    }

    //@Override
    public String GetName() {
        return "KeyReleased";
    }

    //@Override
    public int GetCategoryFlags() {
        return 0;
    }

    //@Override
    public boolean IsInCategory(EventCategory category) {
        return false;
    }
}
