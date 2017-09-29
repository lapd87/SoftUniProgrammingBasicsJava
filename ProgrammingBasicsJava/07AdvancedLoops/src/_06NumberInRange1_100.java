/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:51 ч.
 */

import java.util.Scanner;

public class _06NumberInRange1_100 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n;

        do {
            System.out.println("Еnter a number in the range [1...100]: ");
            n = Integer.parseInt(console.nextLine());
            if (n < 1 || n > 100) {
                System.out.println("Invalid number!");
            } else {
                System.out.println("The number is: " + n);
            }
        }
        while (n < 1 || n > 100);
    }
}