package command.init;

class Button {
    private Lamp lamp;
    Button(Lamp lamp) {
        this.lamp=lamp;
    }

    void pressed() {
        lamp.turnOn();
    }
}
