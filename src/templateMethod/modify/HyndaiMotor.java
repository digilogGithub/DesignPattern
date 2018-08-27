package templateMethod.modify;

class HyndaiMotor extends Motor {

    HyndaiMotor(Door door) {
        super(door);
    }

    void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();

        moveHyundaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    private void moveHyundaiMotor(Direction direction) {
        System.out.println("Start HyundaiMotor moving : " + direction);
    }
}
