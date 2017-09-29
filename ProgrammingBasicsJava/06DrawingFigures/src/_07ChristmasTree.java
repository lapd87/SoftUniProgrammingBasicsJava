/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:09 ч.
 */

import java.util.Scanner;

public class _07ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int rows = 0; rows <= n; rows++) {
            System.out.print(repeatString(" ", n - rows) +
                    repeatString("*", rows));
            if (rows == 0) {
                System.out.print(" |");
            } else {
                System.out.print(" | ");
            }
            System.out.println(repeatString("*", rows));
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