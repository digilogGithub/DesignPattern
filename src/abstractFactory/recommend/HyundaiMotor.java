package abstractFactory.recommend;

class HyundaiMotor extends MotorPart {
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start Hyundai MotorPart moving : " + direction);
    }
}
