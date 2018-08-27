package decorator.recommend;

class DecorateCross extends DecorateDisplay {

    DecorateCross(Display decorateDisplay) {
        super(decorateDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawCross();
    }

    void drawCross() {
        System.out.println("교차로 표시");
    }
}
