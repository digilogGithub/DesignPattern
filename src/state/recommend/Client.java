package state.recommend;

class Client {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        lamp.off_button_pushed();
        lamp.on_button_pushed();
        lamp.on_button_pushed();
        lamp.on_button_pushed();
        lamp.off_button_pushed();
        lamp.on_button_pushed();
        lamp.off_button_pushed();

    }
}
