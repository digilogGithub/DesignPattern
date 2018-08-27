package command.recommend;

class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        System.out.println("Button1 - Lamp On Command : ");
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        System.out.println("Button2 - Alarm Start Command : ");
        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmCommand(alarm);
        Button button2 = new Button(alarmStartCommand);
        button2.pressed();

        System.out.println("Button2 - change Alarm Start Command ->  Lamp On Command");
        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
