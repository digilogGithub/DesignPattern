package strategy.recommend;

abstract class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    Robot(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    void attack() {
        attackStrategy.attack();
    };
    void move() {
        movingStrategy.move();
    };
}
