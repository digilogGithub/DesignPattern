package command.addMethod;

class Button {
    private Lamp lamp;
    private Alarm alarm;
    private Mode mode;

    Button(Lamp lamp, Alarm alarm) {
        this.lamp = lamp;
        this.alarm = alarm;
    }

    void setMode(Mode mode) {
        this.mode=mode;
    }
    void pressed() {
        switch (mode) {
            case LAMP:
                lamp.turnOn();
                break;
            case ALARM:
                alarm.start();
                break;
        }


    }
}
