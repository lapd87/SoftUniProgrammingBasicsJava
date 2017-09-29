/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:07 ч.
 */

import java.util.Scanner;

public class _02RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int stars = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= stars; i++) {
            System.out.println(repeatString("*", stars));
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