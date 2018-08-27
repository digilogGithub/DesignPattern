package strategy.recommend;

class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missiles and can attack with it.");
    }
}
