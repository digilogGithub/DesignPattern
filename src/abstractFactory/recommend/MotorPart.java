package abstractFactory.recommend;

abstract class MotorPart {
    private MotorStatus motorStatus;
    private DoorPart doorPart;

    MotorPart() {
        motorStatus = MotorStatus.STOPPED;
    }

    void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    void setDoorPart(DoorPart doorPart) {
        this.doorPart = doorPart;
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }

    void move(Direction direction) {
        if(doorPart.getDoorStatus() == DoorStatus.OPENED)
            doorPart.close();
        moveMotor(direction);
    }

    abstract void moveMotor(Direction direction);


}
