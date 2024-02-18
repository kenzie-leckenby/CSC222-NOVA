/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 1:03 PM
 * Description: Vending machine sells chocolate, each chocolate gives a coupon, you need 6 coupons to get free chocolate, how much chocolate can you get for a certain amount of cash
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class chocolateConsumption {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Starting cash in dollars:");
        int startingCash = scnr.nextInt();
        int cash = startingCash;

        int coupons = 0;
        int chocolateObtained = 0;
        while(cash > 0 || coupons > 5) {
            if (coupons == 6) {
                chocolateObtained++;
                coupons++;
                coupons -= 6;
                continue;
            }
            chocolateObtained++;
            cash--;
            coupons++;
        }

        System.out.printf("%d dollars were spent, %d chocolates were obtained, with %d coupons left over", startingCash,  chocolateObtained, coupons);
    }
}
