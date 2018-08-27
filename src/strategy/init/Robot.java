package strategy.init;

abstract class Robot {
    private String name;

    Robot(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract void attack();
    abstract void move();
}
