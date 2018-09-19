package abstractFactory.recommend;

class Client {
    public static void main(String[] args) {
        SelectVendor selectVendor = new SelectVendor();
        String vendorName = selectVendor.getVendor();
        ElevatorPartFactory factory = null;
        MotorPart motorPart;
        DoorPart doorPart;

        switch (vendorName){
            case "1":
                factory = HyundaiElevatorPartFactory.getInstance();
                break;
            case "2":
                factory = LGElevatorPartFactory.getInstance();
                break;
            case "3":
                factory = SamsungElevatorPartFactory.getInstance();
                break;
        }

        motorPart = factory.createMotor();
        doorPart = factory.createDoor();

        motorPart.setDoorPart(doorPart);
        doorPart.open();
        motorPart.move(Direction.DOWN);
    }
}
