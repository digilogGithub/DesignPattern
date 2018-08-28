package abstractFactory.recommend;

class Client {
    public static void main(String[] args) {
        SelectVendor selectVendor = new SelectVendor();
        String vendorName = selectVendor.getVendor();
        ElevatorFactory factory = null;
        Motor motor;
        Door door;

        switch (vendorName){
            case "1":
                factory = HyundaiElevatorFactory.getInstance();
                break;
            case "2":
                factory = LGElevatorFactory.getInstance();
                break;
            case "3":
                factory = SamsungElevatorFactory.getInstance();
                break;
        }

        motor = factory.createMotor();
        door = factory.createDoor();

        motor.setDoor(door);
        door.open();
        motor.move(Direction.DOWN);
    }
}
