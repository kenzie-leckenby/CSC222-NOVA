/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 12:18 PM
 * Description: Same as chocolateToLife but the user defines the gender.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class chocolateToLifePlus {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Inputs
        System.out.println("What is your weight in lbs?");
        double weight = scnr.nextDouble();
        System.out.println("What is your height in inches?");
        int height = scnr.nextInt();
        System.out.println("What is your age in years?");
        int age = scnr.nextInt();
        System.out.println("What is your gender (F/M)");
        char gender = scnr.next().charAt(0);

        if (gender == 'F') { // Female Calculations
            int FBMR = (int) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

            // Total Chocolate Bars
            // ! Calls for whole chocolate bars, so I am assuming in this case that once a chocolate bar is started it must be completed, so I do the ceiling to avoid it rounding down due to integer division.
            int totalChocoBarsF = (int) Math.ceil((double) FBMR / 230);

            System.out.printf("%nA woman would need to consume %d chocolate bars to maintain their weight%n", totalChocoBarsF);
        } else if (gender == 'M') { // Male Calculations
            int MBMR = (int) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

            // Total Chocolate Bars
            // ! Calls for whole chocolate bars, so I am assuming in this case that once a chocolate bar is started it must be completed, so I do the ceiling to avoid it rounding down due to integer division.
            int totalChocoBarsM = (int) Math.round((double) MBMR / 230);

            System.out.printf("A man would need to consume %d chocolate bars to maintain their weight%n", totalChocoBarsM);
        }
    }
}
