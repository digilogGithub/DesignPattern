package abstractFactory.recommend;

interface ElevatorPartFactory {
    MotorPart createMotor();
    DoorPart createDoor();
}
