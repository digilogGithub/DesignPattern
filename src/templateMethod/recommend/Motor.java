package templateMethod.recommend;

abstract class Motor {
    private Door door;
    private MotorStatus motorStatus;

    Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }
    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
    protected abstract void moveMotor(Direction direction);
}
