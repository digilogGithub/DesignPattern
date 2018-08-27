package decorator.compsiteclass;

class RoadDisplayWithLaneAndTraffic extends RoadDisplay{
    @Override
    void draw() {
        super.draw();
        drawLane();
        drawTraffic();
    }

    void drawLane() {
        System.out.println("차선 표시");
    }
    void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
