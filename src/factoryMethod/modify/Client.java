package factoryMethod.modify;

class Client {
    public static void main(String[] args) {
        ElevatorManager elevatorManager = new ElevatorManager(1);
        elevatorManager.requestElevator(10,Direction.UP);
    }
}
