/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:16 ч.
 */


public class _02NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}