package composite.recommend;

public class Client {
    public static void main(String[] args) {
        ComputerDevice body = new Body(100,70);
        ComputerDevice keyboard = new Keyboard(5,2);
        ComputerDevice monitor = new Monitor(20,30);
        ComputerDevice speaker = new Speaker(10,10);

        Computer computer = new Computer();

        computer.addCompterDevice(body);
        computer.addCompterDevice(keyboard);
        computer.addCompterDevice(monitor);
        computer.addCompterDevice(speaker);
        System.out.println("Computer Power : "+computer.getPower()+"W");
        System.out.println("Computer Price : "+computer.getPrice()+"만원");

    }

}
