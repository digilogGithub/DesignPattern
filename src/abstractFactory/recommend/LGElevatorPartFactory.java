package abstractFactory.recommend;

public class LGElevatorPartFactory implements ElevatorPartFactory {

    private static LGElevatorPartFactory elevatorFactory = new LGElevatorPartFactory();

    private LGElevatorPartFactory() {
    }

    public static LGElevatorPartFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public MotorPart createMotor() {
        return new LGMotor();
    }

    @Override
    public DoorPart createDoor() {
        return new LGDoor();
    }
}
