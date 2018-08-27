package abstractFactory.recommend;

import java.util.Scanner;

class SelectVendor {
    String getVendor() {
        System.out.println("Vendor : 1.HYUNDAI\t2.LG\t3.SAMSUNG");
        System.out.print("Select Vendor : ");
        Scanner kb = new Scanner(System.in);
        return kb.nextLine();
    }
}
