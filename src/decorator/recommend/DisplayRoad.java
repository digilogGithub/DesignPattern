package decorator.recommend;

class DisplayRoad implements Display {
    @Override
    public void draw() {
        System.out.println("도로 표시");
    }
}
