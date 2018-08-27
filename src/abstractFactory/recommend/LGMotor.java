package abstractFactory.recommend;

class LGMotor extends Motor {
    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start LG Motor moving : " + direction);
    }
}
