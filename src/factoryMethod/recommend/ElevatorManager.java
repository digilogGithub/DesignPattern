package factoryMethod.recommend;

import java.util.ArrayList;
import java.util.List;

class ElevatorManager {
    private List<ElevatorController> elevatorControllers;
    private SchedulingStrategyID schedulingStrategyID;

    public ElevatorManager(int controllerCnt, SchedulingStrategyID schedulingStrategyID) {
        elevatorControllers = new ArrayList<>(controllerCnt);

        for (int index = 0; index < controllerCnt; index++) {
            ElevatorController elevatorController = new ElevatorController(index+1);
            elevatorControllers.add(elevatorController);
//            System.out.println(elevatorControllers.size());
        }
        this.schedulingStrategyID = schedulingStrategyID;
    }

    void setSchedulingStrategyID(SchedulingStrategyID schedulingStrategyID) {
        this.schedulingStrategyID = schedulingStrategyID;
    }
    
    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler elevatorScheduler = SchedulerFactory.getScheduler(schedulingStrategyID);
        System.out.println(elevatorScheduler);
        int selectedElevator = elevatorScheduler.selectElevator(this, destination, direction);
        elevatorControllers.get(selectedElevator).gotoFloor(destination);
    }
}
