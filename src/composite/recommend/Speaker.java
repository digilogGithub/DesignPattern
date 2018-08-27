package composite.recommend;

class Speaker implements ComputerDevice{
    private int price;
    private int power;

    Speaker(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
