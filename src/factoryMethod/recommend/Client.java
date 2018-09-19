package factoryMethod.recommend;

class Client {
    public static void main(String[] args) {
        ElevatorManager elevatorManagerResponse = new ElevatorManagerWithResponseTimeScheduling(4);
        elevatorManagerResponse.requestElevator(8,Direction.UP);

        ElevatorManager elevatorManagerThroughput = new ElevatorManagerWithThroughputScheduling(4);
        elevatorManagerThroughput.requestElevator(10,Direction.UP);

        ElevatorManager elevatorManagerDynamic = new ElevatorManagerWithDynamicScheduling(4);
        elevatorManagerDynamic.requestElevator(10,Direction.UP);
    }
}
