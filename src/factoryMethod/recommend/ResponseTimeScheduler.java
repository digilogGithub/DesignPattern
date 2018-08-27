package factoryMethod.recommend;

class ResponseTimeScheduler implements ElevatorScheduler {

    private static ResponseTimeScheduler responseTimeScheduler = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {
    }

    public static ResponseTimeScheduler getInstance() {
        return responseTimeScheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
