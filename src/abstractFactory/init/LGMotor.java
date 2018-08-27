package abstractFactory.init;

class LGMotor extends Motor {

//    public LGMotor(Door door) {
//        super(door);
//    }

    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start LG Motor moving : " + direction);
    }
}
