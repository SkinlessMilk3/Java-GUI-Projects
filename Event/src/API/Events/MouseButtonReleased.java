package API.Events;

public class MouseButtonReleased extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "MouseButtonReleased";
    }

    @Override
    EventType GetEventType() {
        return EventType.MouseButtonReleased;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
