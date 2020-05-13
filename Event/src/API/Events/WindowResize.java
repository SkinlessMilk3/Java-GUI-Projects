package API.Events;

public class WindowResize extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "WindowResize";
    }

    @Override
    EventType GetEventType() {
        return EventType.WindowResize;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
