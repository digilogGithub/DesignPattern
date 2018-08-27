package state.recommend;

class ON implements State {

    private static ON on = new ON();

    static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(SLEEP.getInstance());
        System.out.println("Light sleep mode on.");
    }

    @Override
    public void off_button_pushed(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("Light off!.");
    }
}
