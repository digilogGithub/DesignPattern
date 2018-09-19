package state.recommend;

class SLEEP implements State {

    private static SLEEP sleep = new SLEEP();
    private SLEEP() {

    }
    static SLEEP getInstance() {
        return sleep;
    }

    @Override
    public void on_button_pushed(Lamp lamp) {
        lamp.setState(ON.getInstance());
        System.out.println("Lamp sleep mode off and on.");
    }

    @Override
    public void off_button_pushed(Lamp lamp) {
        lamp.setState(OFF.getInstance());
        System.out.println("Lamp off!.");
    }
}
