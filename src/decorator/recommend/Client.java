package decorator.recommend;

class Client {
    public static void main(String[] args) {
        System.out.println("DisplayRoad");
        Display roadDisplay = new DisplayRoad();
        roadDisplay.draw();

        System.out.println("DisplayRoad & DecorateLane");
        Display laneDisplay = new DecorateLane(new DisplayRoad());
        laneDisplay.draw();

        System.out.println("DisplayRoad, DecorateLane & DecorateTraffic");
        Display laneTrafficDisplay = new DecorateTraffic(new DecorateLane(new DisplayRoad()));
        laneTrafficDisplay.draw();

        System.out.println("DisplayRoad, DecorateLane, DecorateTraffic & DecorateCross");
        Display laneTrafficCrossDisplay = new DecorateCross(new DecorateTraffic(new DecorateLane(new DisplayRoad())));
        laneTrafficCrossDisplay.draw();

        System.out.println("=============================");
        System.out.println("Add dynamically");
        System.out.println("=============================");
        System.out.println("DisplayRoad");
        Display display = new DisplayRoad();
        display.draw();

        System.out.println("DisplayRoad & DecorateLane");
        display = new DecorateLane(display);
        display.draw();

        System.out.println("DisplayRoad, DecorateLane & DecorateTraffic");
        display = new DecorateTraffic(display);
        display.draw();

        System.out.println("DisplayRoad, DecorateLane, DecorateTraffic & DecorateCross");
        display = new DecorateCross(display);
        display.draw();
    }
}
