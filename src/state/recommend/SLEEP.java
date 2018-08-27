package state.recommend;

class SLEEP implements State {

    private static SLEEP sleep = new SLEEP();
    static SLEEP getInstance() {
        return sleep;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(ON.getInstance());
        System.out.println("Light sleep mode off and on.");
    }

    @Override
    public void off_button_pushed(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("Light off!.");
    }
}
