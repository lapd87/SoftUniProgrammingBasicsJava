/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:17 ч.
 */

import java.util.Currency;
import java.util.Scanner;

public class _10HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());

            if (currentNumber > maxNum) {
                maxNum = currentNumber;
            }
            sum += currentNumber;

        }
        sum -= maxNum;

        if (maxNum == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNum - sum));
        }
    }
}