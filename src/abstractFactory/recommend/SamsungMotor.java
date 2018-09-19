package abstractFactory.recommend;

class SamsungMotor extends MotorPart {
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start Samsung MotorPart moving : " + direction);
    }
}
