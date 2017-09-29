/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.9.2017 г.
 * Time: 16:16 ч.
 */

import java.util.Scanner;

public class _04SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int sum = 0;

        for (int i = 1; i<=n; i++){
            int currentNumber = Integer.parseInt(console.nextLine());

            sum+=currentNumber;
        }

        System.out.println(sum);
    }
}