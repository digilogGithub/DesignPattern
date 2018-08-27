package abstractFactory.init;

class HyundaiMotor extends Motor {

//    public HyundaiMotor(Door door) {
//        super(door);
//    }

    @Override
    void moveMotor(Direction direction) {
        System.out.println("Start Hyundai Motor moving : " + direction);
    }
}
