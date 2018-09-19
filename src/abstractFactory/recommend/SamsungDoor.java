package abstractFactory.recommend;

class SamsungDoor extends DoorPart {
    @Override
    void doOpen() {
        System.out.println("Open Samsung DoorPart~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close Samsung DoorPart~~!");
    }
}