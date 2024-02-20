/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 11:04 AM
 * Description: If given a date, it checks if it is valid or not and if it is not displays why.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class dateValidity {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input
        String inputDate = scnr.nextLine();
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

        System.out.printf("The date %s is %s%s%n", inputDate, (valid) ? "valid" : "invalid", (invalidityReason != null) ? invalidityReason : "");
    }
}
