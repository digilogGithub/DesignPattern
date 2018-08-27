package templateMethod.modify;

class LGMotor extends Motor {

    LGMotor(Door door) {
        super(door);
    }

    void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    private void moveLGMotor(Direction direction) {
        System.out.println("Start LGMotor moving : " + direction);
    }
}
