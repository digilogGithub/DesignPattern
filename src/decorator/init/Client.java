package decorator.init;

class Client {
    public static void main(String[] args) {
        RoadDisplay roadDisplay = new RoadDisplay();
        RoadDisplay roadDisplayWithLane = new RoadDisplayWithLane();

        System.out.println("RoadDisplay");
        roadDisplay.draw();

        System.out.println();
        System.out.println("RoadDisplayWithLane");
        roadDisplayWithLane.draw();

    }
}
