package factoryMethod.init;

import java.util.ArrayList;
import java.util.List;

class ElevatorManager {
    private List<ElevatorController> elevatorControllers;
    private ThroughputScheduler throughputScheduler;

    public ElevatorManager(int controllerCnt) {
        elevatorControllers = new ArrayList<>(controllerCnt);
        for (int i = 0; i < controllerCnt; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            elevatorControllers.add(controller);
        }
        throughputScheduler = new ThroughputScheduler();
    }

    void requestElevator(int destination, Direction direction) {
        int selectedElevator = throughputScheduler.selectElevator(this, destination, direction);

        elevatorControllers.get(selectedElevator).gotoFloor(destination);
    }
}
