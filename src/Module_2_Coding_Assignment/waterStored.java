/**
 * Author: Kenzie Leckenby
 * Date: Feb 01, 2024
 * Time: 11:20 PM
 * Description: If given a radius and a depth the program should calculate the number of gallons stored in the well casing.
 */
package Module_2_Coding_Assignment;

import java.util.Scanner;

public class waterStored {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Inputs
        System.out.println("Input the radius in inches below:");
        int radius = scnr.nextInt();
        System.out.println("Input the depth in feet below:");
        int depth = scnr.nextInt();

        // Calculations
        double radiusFeet = (double) radius / 12.0;
        double area = radiusFeet * radiusFeet * Math.PI;
        double volume = area * depth;
        double gallons = volume * 7.48;

        // Output
        System.out.printf("%nThis well can hold %.2f gallons of water%n", gallons);
    }
}
