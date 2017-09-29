/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:51 ч.
 */

import java.util.Scanner;

public class _05Sequence2k1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i = i * 2 + 1) {
            System.out.println(i);
        }
    }
}