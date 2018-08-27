package templateMethod.recommend;

abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    Motor(Door door) {
        this.door = door;
        this.motorStatus = motorStatus;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }
    protected void setMotorStatus(MotorStatus motorStatus) {
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
    abstract void moveMotor(Direction direction);
}
