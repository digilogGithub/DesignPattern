package templateMethod.recommend;

class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyndaiMotor hyndaiMotor = new HyndaiMotor(door);
        LGMotor lgMotor = new LGMotor(door);

        hyndaiMotor.move(Direction.UP);
        lgMotor.move(Direction.DOWN);
    }
}
