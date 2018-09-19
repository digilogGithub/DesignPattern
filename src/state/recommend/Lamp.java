package state.recommend;

class Lamp {

    private State state;

    Lamp() {
        state = OFF.getInstance();
    }

    void setState(State state) {
        this.state = state;
    }

    void on_button_pushed() {
        state.on_button_pushed(this);
    }

    void off_button_pushed() {
        state.off_button_pushed(this);
    }
}
