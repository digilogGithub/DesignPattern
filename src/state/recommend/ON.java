package state.recommend;

class ON implements State {

    private static ON on = new ON();
    private ON() {

    }

    static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Lamp lamp) {
        lamp.setState(SLEEP.getInstance());
        System.out.println("Lamp sleep mode on.");
    }

    @Override
    public void off_button_pushed(Lamp lamp) {
        lamp.setState(OFF.getInstance());
        System.out.println("Lamp off!.");
    }
}
