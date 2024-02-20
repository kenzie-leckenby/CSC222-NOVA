/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 10:50 AM
 * Description: Reads a one line sentence.
 * If the sentence ends with a question mark and contains an even number of characters it outputs "Yes".
 * If the sentence ends with a question mark and contains an odd number of characters it outputs "No".
 * If the sentence ends with an exclamation point it outputs "Wow".
 * If the sentence doesn't meet either case then it outputs "You always say "(Echoed Input)"".
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class sentenceResponse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input
        String input = scnr.nextLine();

        // Algorithm
        char lastChar = input.charAt(input.length() - 1);
        switch(lastChar) {
            case '?': // When the last character is '?'
                if (input.split(" ").length % 2 == 0) { // For sentences with an even amount of words
                    System.out.println("Yes");
                } else { // For sentences with an odd amount of words
                    System.out.println("No");
                }
                break;
            case '!': // When the last character is '!'
                System.out.println("Wow");
                break;
            default: // If it doesn't meet either case
                System.out.println("You always say \"" + input + "\"");
        }
    }
}
