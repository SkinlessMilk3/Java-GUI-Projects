package Events;

public enum EventType {
    keypressed(1), keyreleased(2),
    WindowClose(3), WindowResize(4),WindowLostFocus(5), WindowMoved(6), WindowFocus(7),
    MouseButtonPressed(8), MouseButtonReleased(9), MouseMoved(10), MouseScrolled(11);

    private final int num;
    EventType(int tmp){
        num = tmp;
    }
}
