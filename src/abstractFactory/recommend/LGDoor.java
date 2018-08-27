package abstractFactory.recommend;

class LGDoor extends Door{
    @Override
    void doOpen() {
        System.out.println("Open LG Door~~!");
    }

    @Override
    void doClose() {
        System.out.println("Close LG Door~~!");
    }
}
