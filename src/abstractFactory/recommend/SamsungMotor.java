package abstractFactory.recommend;

class SamsungMotor extends Motor {
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start Samsung Motor moving : " + direction);
    }
}
