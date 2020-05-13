package API.EventListeners;
/*
* Listens to events from a window and acts on them.
 */
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import API.Events.WindowClose;
import API.Events.WindowFocus;
import API.Events.WindowLostFocus;

public class WindowEventListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        //WindowClose ev = new WindowClose();
    }

    @Override
    public void windowIconified(WindowEvent e) {
//minimized
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//window maximized
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //WindowFocus ev = new WindowFocus();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //WindowLostFocus ev = new WindowLostFocus();
    }
}
