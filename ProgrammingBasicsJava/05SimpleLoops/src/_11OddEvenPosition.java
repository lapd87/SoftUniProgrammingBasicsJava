/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:18 ч.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        double oddSum = 0.0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;

        double evenSum = 0.0;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            double currentNumber = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNumber;
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
            }
        }

        DecimalFormat format = new DecimalFormat("0.##########");

        System.out.printf("OddSum=%s%n", format.format(oddSum));
        if (oddMin == Integer.MAX_VALUE) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%s%n", format.format(oddMin));
        }
        if (oddMax == Integer.MIN_VALUE) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%s%n", format.format(oddMax));
        }

        System.out.printf("EvenSum=%s%n", format.format(evenSum));
        if (evenMin == Integer.MAX_VALUE) {
            System.out.println("EvenMin=No");
        } else {
            System.out.printf("EvenMin=%s%n", format.format(evenMin));
        }
        if (evenMax == Integer.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%s%n", format.format(evenMax));
        }
    }
}