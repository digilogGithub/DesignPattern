package strategy.recommend;

class Client {
    public static void main(String[] args) {
        Robot atom = new Atom("Atom");
        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());

        Robot teakwonV = new TeakwonV("TeakwonV");
        teakwonV.setAttackStrategy(new MissileStrategy());
        teakwonV.setMovingStrategy(new WalkingStrategy());

        System.out.println("My name is "+atom.getName());
        atom.attack();
        atom.move();

        System.out.println();

        System.out.println("My name is "+teakwonV.getName());
        teakwonV.attack();
        teakwonV.move();
    }
}
