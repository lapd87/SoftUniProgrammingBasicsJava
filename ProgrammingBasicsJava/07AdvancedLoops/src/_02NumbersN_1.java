/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:50 ч.
 */

import java.util.Scanner;

public class _02NumbersN_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}