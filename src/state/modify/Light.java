package state.modify;

class Light {
    private static int ON = 0; // light on state
    private static int OFF = 1; // light off state
    private static int SLEEPING = 2; // light sleeping state
    private int state; // present state

    Light() {
        state = OFF;
    }

    void on_button_pushed() {
        if (state == ON) {
            System.out.println("Light sleep mode.");
            state = SLEEPING;
        } else if (state == OFF) {
            System.out.println("Light on!");
            state = ON;
        } else {
            System.out.println("sleep mode off, Light on!.");
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
