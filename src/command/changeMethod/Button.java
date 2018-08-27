package command.changeMethod;

class Button {
    private Alarm alarm;
    Button(Alarm alarm) {
        this.alarm=alarm;
    }

    void pressed() {
        alarm.start();
    }
}
