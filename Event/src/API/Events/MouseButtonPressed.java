package API.Events;

public class MouseButtonPressed extends Event{
    @Override
    int GetCategoryFlags() {
        return 0;
    }

    @Override
    public String toString() {
        return "MouseButtonPressed";
    }

    @Override
    EventType GetEventType() {
        return EventType.MouseButtonPressed;
    }

    @Override
    boolean IsInCategory(EventCategory category) {
        return false;
    }
}
