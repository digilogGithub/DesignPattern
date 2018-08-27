package abstractFactory.recommend;

class HyundaiDoor extends Door {
    @Override
    void doOpen() {
        System.out.println("Open Hyundai Door~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close Hyundai Door~~!");
    }
}
