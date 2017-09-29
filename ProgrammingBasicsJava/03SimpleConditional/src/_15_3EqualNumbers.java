/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:38 ч.
 */

import java.util.Scanner;

public class _15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());

        if (num1 == num2 && num1 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}