/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:08 ч.
 */

import java.util.Scanner;

public class _04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int dollars = Integer.parseInt(console.nextLine());

        for (int i = 0; i < dollars; i++) {
            System.out.print("$");
            System.out.println(repeatString(" $", i));
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