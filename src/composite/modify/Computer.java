package composite.modify;

class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;
    private Speaker speaker;

    void addBody(Body body) {
        this.body = body;
    }

    void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void addSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    int getPrice() {
        int bodyPrice = body.getPrice();
        int keyboardPrice = keyboard.getPrice();
        int monitorPrice = monitor.getPrice();
        int speakerPrice = speaker.getPrice();
        return bodyPrice + keyboardPrice + monitorPrice + speakerPrice;
    }

    int getPower() {
        int bodyPower = body.getPower();
        int keyboardPower = keyboard.getPower();
        int monitorPower = monitor.getPower();
        int speakerPower = speaker.getPower();
        return bodyPower + keyboardPower + monitorPower + speakerPower;
    }
}
