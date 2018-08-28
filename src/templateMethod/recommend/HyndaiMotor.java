package templateMethod.recommend;

class HyndaiMotor extends Motor {

    HyndaiMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        System.out.println("Start HyundaiMotor moving : " + direction);
    }
}
