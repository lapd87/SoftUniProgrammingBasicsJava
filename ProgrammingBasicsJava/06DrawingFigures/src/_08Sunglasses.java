/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:09 ч.
 */

import java.util.Scanner;

public class _08Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.println(repeatString("*", 2 * n) +
                repeatString(" ", n) +
                repeatString("*", 2 * n));

        for (int rows = 1; rows <= n - 2; rows++) {

            System.out.print("*" + repeatString("/", 2 * n - 2) + "*");

            if (rows == (n - 1) / 2) {
                System.out.print(repeatString("|", n));
            } else {
                System.out.print(repeatString(" ", n));
            }

            System.out.println("*" + repeatString("/", 2 * n - 2) + "*");
        }
        System.out.println(repeatString("*", 2 * n) +
                repeatString(" ", n) +
                repeatString("*", 2 * n));
    }

    public static String repeatString(String stringToRepeat, int count) {

        String text = "";

        for (int i = 0; i < count; i++) {
            text += stringToRepeat;
        }

        return text;
    }
}