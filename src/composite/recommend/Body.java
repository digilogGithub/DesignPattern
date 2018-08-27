package composite.recommend;

class Body implements ComputerDevice{
    private int price;
    private int power;

    Body(int price, int power) {
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
