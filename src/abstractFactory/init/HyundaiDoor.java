package abstractFactory.init;

class HyundaiDoor extends Door {
    @Override
    void doOpen() {
        System.out.println("Open the Hyundai door~!");
    }

    @Override
    void doClose() {
        System.out.println("Close the Hyundai door~!");
    }
}
