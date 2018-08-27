package factoryMethod.recommend;

class ThroughputScheduler implements ElevatorScheduler {
    private static ThroughputScheduler throughputScheduler = new ThroughputScheduler();
    private ThroughputScheduler() { }

    public static ThroughputScheduler getInstance() {
        return throughputScheduler;
    }
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
