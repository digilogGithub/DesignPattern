package factoryMethod.recommend;

import java.util.ArrayList;
import java.util.List;

abstract class ElevatorManager {
    private List<ElevatorController> elevatorControllers;

    ElevatorManager(int controllerCnt) {
        elevatorControllers = new ArrayList<>(controllerCnt);

        for (int index = 0; index < controllerCnt; index++) {
            ElevatorController elevatorController = new ElevatorController(index + 1);
            elevatorControllers.add(elevatorController);
        }
    }

    protected abstract ElevatorScheduler getScheduler();

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler elevatorScheduler = getScheduler();
        int selectedElevator = elevatorScheduler.selectElevator(this, destination, direction);
        elevatorControllers.get(selectedElevator).gotoFloor(destination);
    }
}
