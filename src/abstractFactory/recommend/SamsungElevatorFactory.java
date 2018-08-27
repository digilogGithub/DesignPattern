package abstractFactory.recommend;

class SamsungElevatorFactory implements ElevatorFactory {

    private static SamsungElevatorFactory elevatorFactory = new SamsungElevatorFactory();

    private SamsungElevatorFactory() { }

    public static SamsungElevatorFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}