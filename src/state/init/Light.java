package state.init;

class Light {
    private static int ON = 0; // light on state
    private static int OFF = 1; // light off state
    private int state; // present state

    Light() {
        state = OFF;
    }

    void on_button_pushed() {
        if (state == ON) {
            System.out.println("Light already on.");
        } else {
            System.out.println("Light on!");
            state = ON;
        }
    }

    void off_button_pushed() {
        if (state == OFF) {
            System.out.println("Light already off.");
        } else {
            System.out.println("Light Off!");
            state = OFF;
        }
    }
}
