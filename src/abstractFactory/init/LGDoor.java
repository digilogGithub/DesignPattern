package abstractFactory.init;

class LGDoor extends Door {
    @Override
    void doOpen() {
        System.out.println("Open the LG door~!");
    }

    @Override
    void doClose() {
        System.out.println("Close the LG door~!");
    }
}
