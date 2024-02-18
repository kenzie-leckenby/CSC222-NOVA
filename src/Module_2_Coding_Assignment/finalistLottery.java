/**
 * Author: Kenzie Leckenby
 * Date: Feb 02, 2024
 * Time: 12:45 PM
 * Description: Choose 3 lottery winners with no repeats
 */
package Module_2_Coding_Assignment;

public class finalistLottery {
    public static void main(String[] args) {

        String winningNumbers = ""; // Using as a sudo arrayList cause im lazy :)

        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 10) + 1;
            if (!winningNumbers.contains("" + num)) {
                winningNumbers = winningNumbers.concat(num + " ");
                continue;
            }
            i--;
        }

        System.out.printf("The winning numbers are %s!%n", String.join(", ", winningNumbers.split(" ")));
    }
}
