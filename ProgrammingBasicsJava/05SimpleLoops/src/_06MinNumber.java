/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:17 ч.
 */

import java.util.Scanner;

public class _06MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());

            min = Math.min(currentNumber, min);
        }
        System.out.println(min);
    }
}