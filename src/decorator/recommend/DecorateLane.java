package decorator.recommend;

class DecorateLane extends DecorateDisplay {

    DecorateLane(Display decorateDisplay) {
        super(decorateDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();

    }

    void drawLane() {
        System.out.println("차선 표시");
    }
}
