/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:09 ч.
 */

import java.util.Scanner;

public class _09House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int upperRows = 0; upperRows < (n + 1) / 2; upperRows++) {

            int stars = 1;

            if (n % 2 == 0) {
                stars = 2;
            }

            System.out.println(repeatString("-", (n - stars - upperRows * 2) / 2) +
                    repeatString("*", stars + upperRows * 2) +
                    repeatString("-", (n - stars - upperRows * 2) / 2));
        }

        for (int bottomRows = 1; bottomRows <= n / 2; bottomRows++) {
            System.out.println("|" + repeatString("*", n - 2) + "|");
        }
    }

    public static String repeatString(String stringToRepeat, int count) {

        String text = "";

        for (int i = 0; i < count; i++) {
            text += stringToRepeat;
        }

        return text;
    }
}