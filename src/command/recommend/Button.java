package command.recommend;

class Button {
    private Command command;

    Button(Command command) {
        this.command = command;
    }

    void setCommand(Command command) {
        this.command = command;
    }

    void pressed() {
        command.execute();
    }
}
