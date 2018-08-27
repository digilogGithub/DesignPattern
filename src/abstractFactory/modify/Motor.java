package abstractFactory.modify;

abstract class Motor {
    private Door door;
    private MotorStatus motorStatus;

    public Motor() {
        this.motorStatus = MotorStatus.STOPPED;
    }

    void move(Direction direction){
        door.doClose();
        moveMotor(direction);
    }

    abstract void moveMotor(Direction direction);

    void setDoor(Door door) {
        this.door = door;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }

    void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
