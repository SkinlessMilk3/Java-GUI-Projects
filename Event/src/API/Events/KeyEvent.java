package Events;

import jdk.jfr.Event;

public class KeyEvent {//extends Event {

    int GetKeyCode(){
        return m_KeyCode;
    }

    //protected KeyEvent(){}

    protected KeyEvent(int keycode){
        m_KeyCode = keycode;
    }

    int m_KeyCode;
}
