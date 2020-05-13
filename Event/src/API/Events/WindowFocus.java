package API.Events;

public class WindowFocus extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "WindowFocus";
    }

    @Override
    EventType GetEventType() {
        return EventType.WindowFocus;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
