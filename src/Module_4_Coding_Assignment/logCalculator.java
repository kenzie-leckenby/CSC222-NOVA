/**
 * Author: Kenzie Leckenby
 * Date: Feb 19, 2024
 * Time: 2:19 PM
 * Description:
 */
package Module_4_Coding_Assignment;

import java.util.Scanner;

public class logCalculator {
    public static int integerLog(int number, int base) {
        // If the quotient is >= to 0 then continue dividing
        if (number / base > 0) {
            return 1 + integerLog(number/base, base);
        }
        // When there is no more division to be had return 0, breaking out of recursion
        return 0;
    }

    public static void main(String[] args) {
        // Variable Instantiation
        Scanner scnr = new Scanner(System.in);
        char continueChar = 'y';
        int number;
        int base;

        // Dialogue
        while(continueChar != 'n') {
            // Checks to see if the last answer to continue was a valid character, if not it skips past
            if (continueChar == 'y') {
                System.out.println("Please enter a number to find the integer log of");
                number = scnr.nextInt();
                System.out.println("Please enter the base for the calculation");
                base = scnr.nextInt();
                System.out.printf("The base %d integer log of %d is %d%n", base, number, integerLog(number, base));
                System.out.println("Would you like to enter another pair of numbers?");
            }
            // Prompt user on if they would like to enter another set of numbers
            System.out.println("Please enter \"y\" for yes or \"n\" for no.");
            continueChar = scnr.next().charAt(0);
        }
        System.out.println("Good-bye!");
    }
}
