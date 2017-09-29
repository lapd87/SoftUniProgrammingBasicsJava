/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:35 ч.
 */

import java.util.Scanner;

public class _04GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1 =Integer.parseInt(console.nextLine());
        int number2 =Integer.parseInt(console.nextLine());

        System.out.println(Math.max(number1, number2));

    }
}