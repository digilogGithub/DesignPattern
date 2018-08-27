package abstractFactory.modify;

class ElevatorButtonFacotry {
    static ElevatorButton createElevatorButton(VendorID vendorID) {
        ElevatorButton elevatorButton = null;
        switch (vendorID) {
            case LG:
                elevatorButton = new LGElevatorButton();
                break;
            case HYUNDAI:
                elevatorButton = new HyundaiElevatorButton();
                break;
        }
        return elevatorButton;
    }
}
