package composite.recommend;

import java.util.ArrayList;
import java.util.List;

class Computer implements ComputerDevice{
    private List<ComputerDevice> computerDeviceList = new ArrayList<>();

    public void addCompterDevice(ComputerDevice computerDevice) {
        computerDeviceList.add(computerDevice);
    }

    public void removeCompterDevice(ComputerDevice computerDevice) {
        computerDeviceList.remove(computerDevice);
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (ComputerDevice computerDevice: computerDeviceList) {
            totalPrice += computerDevice.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getPower() {
        int totalPower = 0;
        for (ComputerDevice computerDevice: computerDeviceList) {
            totalPower += computerDevice.getPower();
        }
        return totalPower;
    }
}
