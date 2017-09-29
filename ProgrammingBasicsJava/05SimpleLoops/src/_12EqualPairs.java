/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:18 ч.
 */

import java.util.Scanner;

public class _12EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int pairs = Integer.parseInt(console.nextLine());

        double lastSum = 0.0;
        double currentSum = 0.0;
        double maxDiff = -1.0;

        for (int i = 1; i <= pairs; i++) {
            lastSum = currentSum;
            double firstCurrent = Double.parseDouble(console.nextLine());
            double secondCurrent = Double.parseDouble(console.nextLine());

            currentSum = firstCurrent + secondCurrent;

            if (Math.abs(currentSum - lastSum) > maxDiff && i > 1) {
                maxDiff = Math.abs(currentSum - lastSum);
            }
        }

        if (pairs == 1 || lastSum == currentSum) {
            System.out.printf("Yes, value=%f", currentSum);
        } else {
            System.out.printf("No,maxdiff=%f", maxDiff);
        }
    }
}