package state.recommend;

class OFF implements State {
    private static OFF off = new OFF();
    private OFF() {

    }
    static OFF getInstance() {
        return off;
    }

    @Override
    public void on_button_pushed(Lamp lamp) {
        lamp.setState(ON.getInstance());
        System.out.println("Lamp on.");
    }

    @Override
    public void off_button_pushed(Lamp lamp) {
        System.out.println("Lamp already off.");
    }
}
