package decorator.addclass;

class RoadDisplayWithTraffic extends RoadDisplay {

    @Override
    void draw() {
        super.draw();
        drawTraffic();
    }

    void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
