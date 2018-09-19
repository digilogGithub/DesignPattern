package abstractFactory.recommend;

class LGDoor extends DoorPart {
    @Override
    void doOpen() {
        System.out.println("Open LG DoorPart~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close LG DoorPart~~!");
    }
}
