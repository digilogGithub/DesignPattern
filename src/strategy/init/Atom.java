package strategy.init;

class Atom extends Robot {

    Atom(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println("I have strong punch and can attack with it");
    }

    @Override
    void move() {
        System.out.println("I can fly.");
    }
}
