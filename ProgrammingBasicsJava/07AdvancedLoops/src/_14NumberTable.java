/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:53 ч.
 */

import java.util.Scanner;

public class _14NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col > n) {
                    System.out.print(2 * n - row - col + " ");
                } else {
                    System.out.print(row + col + " ");
                }
            }
            System.out.println();
        }
    }
}