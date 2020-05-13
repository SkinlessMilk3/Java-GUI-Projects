package API.EventListeners;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentEventListener implements ComponentListener {

    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.format("%s x: %d y:%d\n", e.getComponent().getClass().getName(), e.getComponent().getBounds().x, e.getComponent().getBounds().y);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println(e.getComponent().getClass().getName()+" resized");
        //generate my window event and give it to my dispatcher to handle
    }

    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println(e.getComponent().getClass().getName()+" shown");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println(e.getComponent().getClass().getName()+" hidden");

    }
}
