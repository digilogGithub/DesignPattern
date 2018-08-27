package singleton.init;

class Printer {
    private static Printer printer = null;
    private int counter = 0;
    private Printer() {}

    static Printer getPrinter() {
        if (printer == null) {
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new Printer();
        }
        return printer;
    }

    void print(String str) {
        counter++;
        System.out.println(str+counter);
    }
}
