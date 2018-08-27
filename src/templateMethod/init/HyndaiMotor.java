package templateMethod.init;

class HyndaiMotor {
    private Door door;
    private MotorStatus motorStatus;
//    private Motor motor;

    HyndaiMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    void move(Direction direction) {
//        if (getMotorStatus() == MotorStatus.STOPPED) {
//            if (door.getDoorStatus() == DoorStatus.OPENED) {
//                door.close();
//            }
//            moveHyundaiMotor(direction);
//        } else
//            System.out.println("Motor is already moving");
        MotorStatus motorStatus = getMotorStatus();
        if ( motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED)
            door.close();

        moveHyundaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void moveHyundaiMotor(Direction direction) {
        System.out.println("Start HyundaiMotor moving : " + direction);
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
