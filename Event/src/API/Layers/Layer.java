package API.Layers;

import API.Events.Event;

public interface Layer {
    public void onAttach();
    public void onDetach();
    public void onUpdate();
    public void onEvent(Event event);
}
