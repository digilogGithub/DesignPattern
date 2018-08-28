package factoryMethod.recommend;

class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {

    ElevatorManagerWithResponseTimeScheduling(int controllerCnt) {
        super(controllerCnt);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ResponseTimeScheduler.getInstance();
    }
}
