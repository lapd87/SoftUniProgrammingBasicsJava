/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 11:07 ч.
 */


public class _01RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(repeatString("*", 10));
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