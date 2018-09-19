package abstractFactory.recommend;

class LGMotor extends MotorPart {
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start LG MotorPart moving : " + direction);
    }
}
