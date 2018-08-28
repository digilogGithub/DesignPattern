package factoryMethod.recommend;

class ThroughputScheduler implements ElevatorScheduler {
    private static ThroughputScheduler scheduler = new ThroughputScheduler();
    private ThroughputScheduler() { }

    public static ThroughputScheduler getInstance() {
        return scheduler;
    }
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
