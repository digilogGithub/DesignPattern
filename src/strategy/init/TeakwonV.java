package strategy.init;

public class TeakwonV extends Robot {

    TeakwonV(String name) {
         super(name);
    }

    @Override
    void attack() {
        System.out.println("I have Missiles and can attack with it");
    }

    @Override
    void move() {
        System.out.println("I can only walk.");
    }
}
