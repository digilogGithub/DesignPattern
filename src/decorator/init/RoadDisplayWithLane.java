package decorator.init;

class RoadDisplayWithLane extends RoadDisplay{
    @Override
    void draw() {
        super.draw();
        drawLane();
    }

    void drawLane() {
        System.out.println("차선 표시");
    }
}
