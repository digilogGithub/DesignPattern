package templateMethod.modify;

class Door {
    private DoorStatus doorStatus;

    Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    DoorStatus getDoorStatus() {
        return doorStatus;
    }

    void open() {
        System.out.println("Open the door~!");
        doorStatus= DoorStatus.OPENED;
    }

    void close() {
        System.out.println("Close the door~!");
        doorStatus= DoorStatus.CLOSED;
    }

}
