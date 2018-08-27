package decorator.recommend;

class DecorateDisplay implements Display {
    private Display decorateDisplay;

    DecorateDisplay(Display decorateDisplay) {
        this.decorateDisplay = decorateDisplay;
    }

    @Override
    public void draw() {
        decorateDisplay.draw();
    }
}
