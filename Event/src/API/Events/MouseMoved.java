package API.Events;

public class MouseMoved extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "MouseMoved";
    }

    @Override
    EventType GetEventType() {
        return EventType.MouseMoved;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
