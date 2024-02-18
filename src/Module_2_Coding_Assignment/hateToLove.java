/**
 * Author: Kenzie Leckenby
 * Date: Feb 01, 2024
 * Time: 11:03 PM
 * Description: Replaces the first occurrence of hate to love within an input. Assume that the word 'hate' occurs within the input.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class hateToLove {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input
        System.out.println("Enter a line of text below:");
        String inputLine = scnr.nextLine();

        // Output
        String output = inputLine.replaceFirst("hate", "love"); // Will not work if hate is capitalized in any way, could be rewritten to catch all cases of hate.
        System.out.println("Line rephrased to: '" + output + "'");
    }
}
