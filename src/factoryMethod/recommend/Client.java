package factoryMethod.recommend;

class Client {
    public static void main(String[] args) {
        ElevatorManager elevatorManagerResponse = new ElevatorManagerWithResponseTimeScheduling(2);
        elevatorManagerResponse.requestElevator(10,Direction.UP);

        ElevatorManager elevatorManagerThroughput = new ElevatorManagerWithThroughputScheduling(2);
        elevatorManagerThroughput.requestElevator(10,Direction.UP);

        ElevatorManager elevatorManagerDynamic = new ElevatorManagerWithDynamicScheduling(2);
        elevatorManagerDynamic.requestElevator(10,Direction.UP);
    }
}
