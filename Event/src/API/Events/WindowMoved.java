package API.Events;

public class WindowMoved extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "WindowMoved";
    }

    @Override
    EventType GetEventType() {
        return EventType.WindowMoved;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
