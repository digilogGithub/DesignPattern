package factoryMethod.recommend;

import java.util.Calendar;

class ElevatorManagerWithDynamicScheduling extends ElevatorManager {
    ElevatorManagerWithDynamicScheduling(int controllerCnt) {
        super(controllerCnt);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour < 12)
            return ResponseTimeScheduler.getInstance();
        else
            return ThroughputScheduler.getInstance();
    }
}
