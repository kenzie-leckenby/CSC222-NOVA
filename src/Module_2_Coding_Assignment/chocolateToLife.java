/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 9:56 AM
 * Description: If given a weight, height, and age, the program should calculate the total amount of chocolate bars to maintain their weight each day.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class chocolateToLife {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Inputs
        System.out.println("What is your weight in lbs?");
        double weight = scnr.nextDouble();
        System.out.println("What is your height in inches?");
        int height = scnr.nextInt();
        System.out.println("What is your age in years?");
        int age = scnr.nextInt();

        // Female BMR
        int FBMR = (int) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

        // Male BMR
        int MBMR = (int) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

        // Total Chocolate Bars per Sex
        // ! Calls for whole chocolate bars, so I am assuming in this case that once a chocolate bar is started it must be completed, so I do the ceiling to avoid it rounding down due to integer division.
        int totalChocoBarsF = (int) Math.ceil((double) FBMR / 230);
        int totalChocoBarsM = (int) Math.round((double) MBMR / 230);

        // Outputs
        System.out.printf("%nA woman would need to consume %d chocolate bars to maintain their weight%n", totalChocoBarsF);
        System.out.printf("A man would need to consume %d chocolate bars to maintain their weight%n", totalChocoBarsM);
    }
}
