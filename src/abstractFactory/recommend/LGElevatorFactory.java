package abstractFactory.recommend;

public class LGElevatorFactory implements ElevatorFactory {

    private static LGElevatorFactory elevatorFactory = new LGElevatorFactory();

    private LGElevatorFactory() {
    }

    public static LGElevatorFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
