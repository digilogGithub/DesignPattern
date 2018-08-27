package state.recommend;

class OFF implements State {
    private static OFF off = new OFF();
    static OFF getInstance() {
        return off;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(ON.getInstance());
        System.out.println("Light on.");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light already off.");
    }
}
