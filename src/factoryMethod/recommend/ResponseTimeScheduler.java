package factoryMethod.recommend;

class ResponseTimeScheduler implements ElevatorScheduler {

    private static ResponseTimeScheduler scheduler = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {
    }

    public static ResponseTimeScheduler getInstance() {
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
