/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 1:13 PM
 * Description: Master file containing every Mini-Activity in the Module 2 Coding Assignment
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class masterFile {
    private static final Scanner keyboard = new Scanner(System.in);

    // Mini-Activity 1
    public static void stringJoiner() {
        // User inputs
        System.out.println("< Mini-Activity 1 >");
        System.out.println("Input 2 words on a single line:");
        String input1 = keyboard.next();
        String input2 = keyboard.next();

        // String stats Output
        System.out.printf("\nInput 1: '%s' with a width of %d%n", input1, input1.length());
        System.out.printf("Input 2: '%s' with a width of %d%n", input2, input2.length());

        // New joined string Output
        System.out.printf("Combined inputs: '%s' with a width of %d%n%n", input1.concat(" ").concat(input2), input1.concat(" ").concat(input2).length());
    }

    // Mini-Activity 2
    public static void hateToLove() {
        // Input
        System.out.println("< Mini-Activity 2 >");
        System.out.println("Enter a line of text below:");
        String inputLine = keyboard.nextLine();

        // Output
        String output = inputLine.replaceFirst("hate", "love"); // Will not work if hate is capitalized in any way, could be rewritten to catch all cases of hate.
        System.out.println("Line rephrased to: '" + output + "'\n");
    }

    // Mini-Activity 3
    public static void wordSubstituter() {
        String name, color, animal, food;

        // Inputs
        System.out.println("< Mini-Activity 3 >");
        System.out.println("What is your favorite color?");
        color = keyboard.nextLine();
        System.out.println("What is your favorite food?");
        food = keyboard.nextLine();
        System.out.println("What is your favorite animal?");
        animal = keyboard.nextLine();
        System.out.println("Name of a friend or relative:");
        name = keyboard.nextLine();

        // Formatted String Output
        System.out.println("\nFormatted String:");
        System.out.printf("I had a dream that %s ate a %s %s and said it tasted like %s!%n%n", name, color, animal, food);
    }

    // Mini-Activity 4
    public static void waterStored() {
        // Inputs
        System.out.println("< Mini-Activity 4 >");
        System.out.println("Input the radius in inches below:");
        int radius = keyboard.nextInt();
        System.out.println("Input the depth in feet below:");
        int depth = keyboard.nextInt();

        // Calculations
        double radiusFeet = (double) radius / 12.0;
        double area = radiusFeet * radiusFeet * Math.PI;
        double volume = area * depth;
        double gallons = volume * 7.48;

        // Output
        System.out.printf("%nThis well can hold %.2f gallons of water%n%n", gallons);
    }

    // Mini-Activity 5
    public static void chocolateToLife() {
        // Inputs
        System.out.println("< Mini-Activity 5 >");
        System.out.println("What is your weight in lbs?");
        double weight = keyboard.nextDouble();
        System.out.println("What is your height in inches?");
        int height = keyboard.nextInt();
        System.out.println("What is your age in years?");
        int age = keyboard.nextInt();

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
        System.out.printf("A man would need to consume %d chocolate bars to maintain their weight%n%n", totalChocoBarsM);
    }

    // Mini-Activity 6
    public static void wordRearranger() {
        // Inputs
        System.out.println("< Mini-Activity 6 >");
        System.out.println("Input 3 words on a single line:");
        String input = keyboard.nextLine();
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
        System.out.println();
    }

    // Mini-Activity 7
    public static void sentenceResponse() {
        // Input
        System.out.println("< Mini-Activity 7 >");
        System.out.println("Input a sentence on a single line:");
        String input = keyboard.nextLine();

        // Algorithm
        char lastChar = input.charAt(input.length() - 1);
        switch(lastChar) {
            case '?': // When the last character is '?'
                if (input.split(" ").length % 2 == 0) { // For sentences with an even amount of words
                    System.out.println("Yes\n");
                } else { // For sentences with an odd amount of words
                    System.out.println("No\n");
                }
                break;
            case '!': // When the last character is '!'
                System.out.println("Wow\n");
                break;
            default: // If it doesn't meet either case
                System.out.println("You always say \"" + input + "\"\n");
        }
    }

    // Mini-Activity 8
    public static void dateValidity() {
        // Input
        System.out.println("< Mini-Activity 8 >");
        System.out.println("Input a date in the format 'mm/dd/yyy':");
        String inputDate = keyboard.nextLine();
        String[] inputDateSplit = inputDate.split("/");

        // Converts String to Integer
        int month = Integer.parseInt(inputDateSplit[0]);
        int day = Integer.parseInt(inputDateSplit[1]);
        int year = Integer.parseInt(inputDateSplit[2]);

        // Declares validity stuffs, gets modified as needed
        boolean valid = false;
        String invalidityReason = null;

        // Checks Validity
        if (month > 0 && month < 13) {
            switch(month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 31) {
                        valid = true;
                    } else {
                        invalidityReason = " because it has more than 30 days"; // Assigns a reason
                    }
                    break;
                case 2:
                    if (day < 29) {
                        valid = true;
                    } else if (day == 29) {
                        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                            valid = true;
                        } else {
                            invalidityReason = " because it has 29 days in february during a non-leap year"; // Assigns a reason
                        }
                    } else {
                        invalidityReason = " because it has more than 28 days in february"; // Assigns a reason
                    }
                    break;
                default:
                    if (day < 32) {
                        valid = true;
                    } else {
                        invalidityReason = " because it has more than 31 days"; // Assigns a reason
                    }
            }
        } else {
            invalidityReason = " because it is not one of the 12 months"; // Assigns a reason
        }

        System.out.printf("The date %s is %s%s%n%n", inputDate, (valid) ? "valid" : "invalid", (invalidityReason != null) ? invalidityReason : "");
    }

    // Mini-Activity 9
    public static void chocolateToLifePlus() {
        // Inputs
        System.out.println("< Mini-Activity 9 >");
        System.out.println("What is your weight in lbs?");
        double weight = keyboard.nextDouble();
        System.out.println("What is your height in inches?");
        int height = keyboard.nextInt();
        System.out.println("What is your age in years?");
        int age = keyboard.nextInt();
        System.out.println("What is your gender (F/M)");
        char gender = keyboard.next().charAt(0);

        if (gender == 'F') { // Female Calculations
            int FBMR = (int) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

            // Total Chocolate Bars
            // ! Calls for whole chocolate bars, so I am assuming in this case that once a chocolate bar is started it must be completed, so I do the ceiling to avoid it rounding down due to integer division.
            int totalChocoBarsF = (int) Math.ceil((double) FBMR / 230);

            System.out.printf("%nA woman would need to consume %d chocolate bars to maintain their weight%n%n", totalChocoBarsF);
        } else if (gender == 'M') { // Male Calculations
            int MBMR = (int) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

            // Total Chocolate Bars
            // ! Calls for whole chocolate bars, so I am assuming in this case that once a chocolate bar is started it must be completed, so I do the ceiling to avoid it rounding down due to integer division.
            int totalChocoBarsM = (int) Math.round((double) MBMR / 230);

            System.out.printf("A man would need to consume %d chocolate bars to maintain their weight%n%n", totalChocoBarsM);
        }
    }

    // Mini-Activity 10
    public static void firstToLast() {
        System.out.println("< Mini-Activity 10 >");
        System.out.println("Input a word:");
        String input = keyboard.next();
        input = input.toLowerCase();

        int wordsFound = 0;
        while(!input.equals("quit")) {
            char firstChar = input.charAt(0);

            // Adds the input string omitting the first character then appends the first character at the end, then reverses the string
            StringBuilder currInput = new StringBuilder().append(input.substring(1)).append(firstChar);
            currInput.reverse();

            // If the newly created string equals the input then it is a match and gets added to words found
            if (currInput.toString().equals(input)) {
                wordsFound++;
            }

            System.out.println("Input a word (type 'quit' to exit):");
            input = keyboard.next();
            input = input.toLowerCase();
        }

        System.out.println("A total of " + wordsFound + " words found");
    }

    // Mini-Activity 11
    public static void finalistLottery() {
        String winningNumbers = ""; // Using as a sudo arrayList cause im lazy :)

        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 10) + 1;
            if (!winningNumbers.contains("" + num)) {
                winningNumbers = winningNumbers.concat(num + " ");
                continue;
            }
            i--;
        }

        System.out.println("< Mini-Activity 11 >");
        System.out.printf("The winning numbers are %s!%n%n", String.join(", ", winningNumbers.split(" ")));
    }

    // Mini-Activity 12
    public static void chocolateConsumption() {
        // Inputs
        System.out.println("< Mini-Activity 12 >");
        System.out.println("Starting cash in dollars:");
        int startingCash = keyboard.nextInt();
        int cash = startingCash;

        // Algorithm
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

        // Output
        System.out.printf("%d dollars were spent, %d chocolates were obtained, with %d coupons left over%n", startingCash,  chocolateObtained, coupons);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Module 2 Coding Assignment!");
        boolean quit = false;

        while (!quit) {
            System.out.println("""
            
            Which Mini-Activity would you like to check out?
            [1] Mini-Activity 1
            [2] Mini-Activity 2
            [3] Mini-Activity 3
            [4] Mini-Activity 4
            [5] Mini-Activity 5
            [6] Mini-Activity 6
            [7] Mini-Activity 7
            [8] Mini-Activity 8
            [9] Mini-Activity 9
            [10] Mini-Activity 10
            [11] Mini-Activity 11
            [12] Mini-Activity 12
            [13] All of them in order
            [14] Exit""");

            int input = keyboard.nextInt();
            switch (input) {
                case 1 -> stringJoiner();
                case 2 -> hateToLove();
                case 3 -> wordSubstituter();
                case 4 -> waterStored();
                case 5 -> chocolateToLife();
                case 6 -> wordRearranger();
                case 7 -> sentenceResponse();
                case 8 -> dateValidity();
                case 9 -> chocolateToLifePlus();
                case 10 -> firstToLast();
                case 11 -> finalistLottery();
                case 12 -> chocolateConsumption();
                case 13 -> {
                    stringJoiner();
                    hateToLove();
                    wordSubstituter();
                    waterStored();
                    chocolateToLife();
                    wordRearranger();
                    sentenceResponse();
                    dateValidity();
                    chocolateToLifePlus();
                    firstToLast();
                    finalistLottery();
                    chocolateConsumption();
                }
                case 14 -> quit = true;
                default -> System.out.println("Not a valid answer");
            }
        }
    }
}
