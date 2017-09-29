/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:51 ч.
 */

import java.util.Scanner;

public class _03PowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i++) {
            System.out.println((int)Math.pow(2, i));
        }
    }
}