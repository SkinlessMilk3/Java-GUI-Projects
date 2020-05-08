package EventListeners;

import Events.*;

public interface KeyListener {
    public abstract void onKeyPressed(KeyEvent event);
    public void handle(KeyEvent event);
}
