package abstractFactory.recommend;

class HyundaiElevatorPartFactory implements ElevatorPartFactory {
    private static HyundaiElevatorPartFactory elevatorFactory = new HyundaiElevatorPartFactory();

    private HyundaiElevatorPartFactory() {
    }

    public static HyundaiElevatorPartFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public MotorPart createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public DoorPart createDoor() {
        return new HyundaiDoor();
    }
}
