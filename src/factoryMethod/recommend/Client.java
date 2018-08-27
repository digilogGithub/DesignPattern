package factoryMethod.recommend;

class Client {
    public static void main(String[] args) {
        ElevatorManager elevatorManagerResponse = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        elevatorManagerResponse.requestElevator(10,Direction.UP);

        ElevatorManager elevatorManagerThroughput = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
        elevatorManagerThroughput.requestElevator(10,Direction.UP);

        ElevatorManager elevatorManagerDynamic = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
        elevatorManagerDynamic.requestElevator(10,Direction.UP);
    }
}
