package factoryMethod.recommend;

class ElevatorManagerWithThroughputScheduling extends ElevatorManager {

    ElevatorManagerWithThroughputScheduling(int controllerCnt) {
        super(controllerCnt);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ThroughputScheduler.getInstance();
    }
}
