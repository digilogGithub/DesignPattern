package decorator.addclass;

class Client {
    public static void main(String[] args) {
        RoadDisplay roadDisplay = new RoadDisplay();
        RoadDisplay roadDisplayWithLane = new RoadDisplayWithLane();
        RoadDisplay roadDisplayWithTraffic = new RoadDisplayWithTraffic();

        System.out.println("RoadDisplay");
        roadDisplay.draw();

        System.out.println();
        System.out.println("RoadDisplayWithLane");
        roadDisplayWithLane.draw();

        System.out.println();
        System.out.println("RoadDisplayWithTraffic");
        roadDisplayWithTraffic.draw();

    }
}
