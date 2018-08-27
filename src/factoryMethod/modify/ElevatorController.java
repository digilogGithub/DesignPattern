package factoryMethod.modify;

class ElevatorController {
    int id;
    int curFloor;

    ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    void gotoFloor(int destination) {
        System.out.println("[Elevator ID : "+id+"]\tFloor : "+curFloor);
        curFloor = destination;
        System.out.println(" ==> "+curFloor);
    }
}
