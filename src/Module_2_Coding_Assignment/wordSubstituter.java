/**
 * Author: Kenzie Leckenby
 * Date: Feb 01, 2024
 * Time: 11:11 PM
 * Description: Collects a users favorite color, food, animal, and first name of a friend or relative. Then substitutes it into a formatted sentence.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class wordSubstituter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name, color, animal, food;

        // Inputs
        System.out.println("What is your favorite color?");
        color = scnr.nextLine();
        System.out.println("What is your favorite food?");
        food = scnr.nextLine();
        System.out.println("What is your favorite animal?");
        animal = scnr.nextLine();
        System.out.println("Name of a friend or relative:");
        name = scnr.nextLine();

        // Formatted String Output
        System.out.println("\nFormatted String:");
        System.out.printf("I had a dream that %s ate a %s %s and said it tasted like %s!", name, color, animal, food);
    }
}
