package state.recommend;

class Light {

    private State state;

    Light() {
        state = new OFF();
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
