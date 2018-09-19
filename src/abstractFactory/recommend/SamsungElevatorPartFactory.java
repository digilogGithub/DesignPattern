package abstractFactory.recommend;

class SamsungElevatorPartFactory implements ElevatorPartFactory {

    private static SamsungElevatorPartFactory elevatorFactory = new SamsungElevatorPartFactory();

    private SamsungElevatorPartFactory() { }

    public static SamsungElevatorPartFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public MotorPart createMotor() {
        return new SamsungMotor();
    }

    @Override
    public DoorPart createDoor() {
        return new SamsungDoor();
    }
}