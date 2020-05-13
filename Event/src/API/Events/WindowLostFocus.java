package API.Events;

public class WindowLostFocus extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "WindowLostFocus";
    }

    @Override
    EventType GetEventType() {
        return EventType.WindowLostFocus;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
