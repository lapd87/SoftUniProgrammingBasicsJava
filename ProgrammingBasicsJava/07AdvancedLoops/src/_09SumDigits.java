/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:52 ч.
 */

import java.util.Scanner;

public class _09SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        int result = 0;

        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        System.out.println(result);
    }
}