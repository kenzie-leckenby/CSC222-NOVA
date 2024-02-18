/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 10:16 AM
 * Description:
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class wordRearranger {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Inputs
        String input = scnr.nextLine();
        String[] words = input.split(" ");

        // Sorting Algorithm
        if (words[0].compareTo(words[1]) > 0) { // Compares if the first word is larger than the second word
            String word0 = words[0];
            String word1 = words[1];

            words[0] = word1;
            words[1] = word0;
            // System.out.println("Step 1:" + String.join(" ", words));
        }
        if (words[1].compareTo(words[2]) > 0) { // Compares if the second word is larger than the third word
            String word1 = words[1];
            String word2 = words[2];

            words[1] = word2;
            words[2] = word1;
            // System.out.println("Step 2:" + String.join(" ", words));
            if (words[0].compareTo(words[1]) > 0) { // Compares the first and second words again if the second and third words swapped
                String word0 = words[0];
                word1 = words[1];

                words[0] = word1;
                words[1] = word0;
                // System.out.println("Step 3:" + String.join(" ", words));
            }
        }

        // Output
        System.out.println(String.join(" ", words));
    }
}
