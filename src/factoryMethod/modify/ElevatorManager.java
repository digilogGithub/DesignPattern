package factoryMethod.modify;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class ElevatorManager {
    private List<ElevatorController> elevatorControllers;
//    private ThroughputScheduler throughputScheduler;

    public ElevatorManager(int controllerCnt) {
        elevatorControllers = new ArrayList<ElevatorController>(controllerCnt);
        for (int i = 0; i < controllerCnt; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            elevatorControllers.add(controller);
        }
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler elevatorScheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hour < 12)
            elevatorScheduler = new ResponseTimeScheduler();
        else
            elevatorScheduler = new ThroughputScheduler();

        int selectedElevator = elevatorScheduler.selectElevator(this, destination, direction);

        elevatorControllers.get(selectedElevator).gotoFloor(destination);
    }
}
