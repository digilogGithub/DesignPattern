package templateMethod.recommend;

class LGMotor extends Motor {

    LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Start LGMotor moving : " + direction);
    }
}
