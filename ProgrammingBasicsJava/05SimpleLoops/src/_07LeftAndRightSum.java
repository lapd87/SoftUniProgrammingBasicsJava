/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:17 ч.
 */

import java.util.Scanner;

public class _07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            leftSum += currentNumber;
        }

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            rightSum += currentNumber;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}