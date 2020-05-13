package API.Events;

public class WindowClose extends Event {

    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "WindowClose";
    }

    @Override
    EventType GetEventType() {
        return EventType.WindowClose;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
