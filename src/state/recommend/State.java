package state.recommend;

interface State {
    void on_button_pushed(Lamp lamp);
    void off_button_pushed(Lamp lamp);
}
