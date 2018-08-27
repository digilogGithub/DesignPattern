package command.recommend;

class LampOnCommand implements Command {

    private Lamp lamp;

    LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
