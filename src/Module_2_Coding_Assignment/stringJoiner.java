/**
 * Author: Kenzie Leckenby
 * Date: Jan 29, 2024
 * Time: 11:35 AM
 * Description:
 * Reads 2 string inputs, displays each along with its width on two separate lines. Then creates a new string by joining the two strings with a space between and displays them and its length on a new separate line.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class stringJoiner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // User inputs
        String input1 = scnr.next();
        String input2 = scnr.next();

        // String stats Output
        System.out.printf("Input 1: '%s' with a width of %d%n", input1, input1.length());
        System.out.printf("Input 2: '%s' with a width of %d%n", input2, input2.length());

        // New joined string Output
        System.out.printf("Combined inputs: '%s' with a width of %d%n", input1.concat(" ").concat(input2), input1.concat(" ").concat(input2).length());
    }
}
