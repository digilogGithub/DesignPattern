package abstractFactory.recommend;

class SamsungDoor extends Door {
    @Override
    void doOpen() {
        System.out.println("Open Samsung Door~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close Samsung Door~~!");
    }
}