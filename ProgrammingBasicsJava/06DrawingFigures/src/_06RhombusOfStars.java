/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:08 ч.
 */

import java.util.Scanner;

public class _06RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int upperRows = 0; upperRows < n; upperRows++) {
            System.out.println(repeatString(" ", n - upperRows - 1) +
                    "*" + repeatString(" *", upperRows));
        }
        for (int bottomRows = 1; bottomRows < n; bottomRows++) {
            System.out.println(repeatString(" ", bottomRows) +
                    "*" + repeatString(" *", n - 1 - bottomRows));
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