/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:17 ч.
 */

import java.util.Scanner;

public class _08OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {

            int currentNumber = Integer.parseInt(console.nextLine());

            if (i%2==0){
                evenSum+=currentNumber;
            }
            else    {
                oddSum += currentNumber;
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum-evenSum));
        }
    }
}