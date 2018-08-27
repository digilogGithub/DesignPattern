package abstractFactory.recommend;

class HyundaiMotor extends Motor{
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start Hyundai Motor moving : " + direction);
    }
}
