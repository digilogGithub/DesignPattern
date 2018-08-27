package abstractFactory.recommend;

abstract class Motor {
    private MotorStatus motorStatus;
    private Door door;

    Motor() {
        motorStatus = MotorStatus.STOPPED;
    }

    void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    void setDoor(Door door) {
        this.door = door;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }

    void move(Direction direction) {
        if(door.getDoorStatus() == DoorStatus.OPENED)
            door.close();
        moveMotor(direction);
    }

    abstract void moveMotor(Direction direction);


}
