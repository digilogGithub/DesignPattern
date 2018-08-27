package decorator.recommend;

class DecorateTraffic extends DecorateDisplay {

    DecorateTraffic(Display decorateDisplay) {
        super(decorateDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
