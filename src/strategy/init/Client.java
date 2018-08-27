package strategy.init;

class Client {
    public static void main(String[] args) {
        Robot atom = new Atom("Atom");
        Robot teakwonV = new TeakwonV("TeakwonV");

        System.out.println("My name is "+atom.getName());
        atom.attack();
        atom.move();

        System.out.println();

        System.out.println("My name is "+teakwonV.getName());
        teakwonV.attack();
        teakwonV.move();
    }
}
