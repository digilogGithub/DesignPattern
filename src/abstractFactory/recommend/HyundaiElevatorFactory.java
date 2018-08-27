package abstractFactory.recommend;

class HyundaiElevatorFactory implements ElevatorFactory {
    private static HyundaiElevatorFactory elevatorFactory = new HyundaiElevatorFactory();

    private HyundaiElevatorFactory() {
    }

    public static HyundaiElevatorFactory getInstance() {
        return elevatorFactory;
    }

    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
