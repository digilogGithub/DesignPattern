package abstractFactory.recommend;

interface ElevatorFactory {
    Motor createMotor();
    Door createDoor();
}
