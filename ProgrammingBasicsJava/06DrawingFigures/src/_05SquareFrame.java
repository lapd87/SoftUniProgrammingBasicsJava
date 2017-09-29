/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:08 ч.
 */

import java.util.Scanner;

public class _05SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.println("+" + repeatString(" -", n - 2) + " +");

        for (int i = 1; i <= n - 2; i++) {
            System.out.println("|" + repeatString(" -", n - 2) + " |");
        }

        System.out.println("+" + repeatString(" -", n - 2) + " +");
    }

    public static String repeatString(String stringToRepeat, int count) {

        String text = "";

        for (int i = 0; i < count; i++) {
            text += stringToRepeat;
        }

        return text;
    }
}