package API.Events;

public class MouseScrolled extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "MouseScrolled";
    }

    @Override
    EventType GetEventType() {
        return EventType.MouseScrolled;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
