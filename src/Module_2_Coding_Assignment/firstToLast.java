/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 12:24 PM
 * Description: Check if a given input forms the same word if the first letter is moved to the end and the word is reversed
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class firstToLast {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = scnr.next();
        input = input.toLowerCase();

        int wordsFound = 0;
        while(!input.equals("quit")) {
            char firstChar = input.charAt(0);

            // Adds the input string omitting the first character then appends the first character at the end, then reverses the string
            StringBuilder currInput = new StringBuilder().append(input.substring(1, input.length())).append(firstChar);
            currInput.reverse();

            // If the newly created string equals the input then it is a match and gets added to words found
            if (currInput.toString().equals(input)) {
                wordsFound++;
            }

            input = scnr.next();
            input = input.toLowerCase();
        }

        System.out.println("A total of " + wordsFound + " words found");
    }
}
