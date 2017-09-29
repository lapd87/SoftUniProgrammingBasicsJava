/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:09 ч.
 */

import java.util.Scanner;

public class _10Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int rowCount = (n + 1) / 2 * 2 - 1;

        for (int row = 0; row < rowCount; row++) {
            int outerDash = Math.abs((n - 1) / 2 - row);

            System.out.print(repeatString("-", outerDash) + "*");

            if (row == 0 || row == rowCount - 1) {
                if (n % 2 == 0) {
                    System.out.print("*");
                }
            } else {
                int innerDash = n - 2 * outerDash - 2;

                System.out.print(repeatString("-", innerDash) + "*");
            }
            System.out.println(repeatString("-", outerDash));
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