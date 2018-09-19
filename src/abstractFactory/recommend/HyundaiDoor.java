package abstractFactory.recommend;

class HyundaiDoor extends DoorPart {
    @Override
    void doOpen() {
        System.out.println("Open Hyundai DoorPart~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close Hyundai DoorPart~~!");
    }
}
