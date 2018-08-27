package composite.init;

class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;

    void addBody(Body body) {
        this.body = body;
    }

   void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    int getPrice() {
        int bodyPrice = body.getPrice();
        int keyboardPrice = keyboard.getPrice();
        int monitorPrice = monitor.getPrice();
        return bodyPrice + keyboardPrice + monitorPrice;
    }

    int getPower() {
        int bodyPower = body.getPower();
        int keyboardPower = keyboard.getPower();
        int monitorPower = monitor.getPower();
        return bodyPower + keyboardPower + monitorPower;
    }
}
