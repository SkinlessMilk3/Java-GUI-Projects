package Events;

public class KeyPressedEvent /*extends KeyEvent{*/extends Event {


    int repeatCount;
    int m_keycode;

    //public void handle(){ }//May not belong here. I think it belongs in the listeners.

    public KeyPressedEvent(int keycode, int repeatCount){
        m_keycode = keycode;//super(keycode);
        this.repeatCount = repeatCount;
    }

    int GetRepeatCount(){
        return repeatCount;
    }

    @Override
    public String toString(){ return GetName(); }

    //@Override
    public EventType GetEventType() {
        return GetStaticType();
    }

    static public EventType GetStaticType() {
        return EventType.keypressed;
    }

    //@Override
    public String GetName() {
        return "KeyPressed";
    }

    //@Override
    public int GetCategoryFlags() {
        return 0;
    }

    //@Override
    public boolean IsInCategory(EventCategory category) {
        return false;
    }
}
