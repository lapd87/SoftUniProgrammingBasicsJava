/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:53 ч.
 */

import java.awt.geom.IllegalPathStateException;
import java.util.Scanner;

public class _12Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int firstNum = 0;
        int secondNum =1;

        for (int i=1; i<=n;i++) {
            int newNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = newNum;
        }
        System.out.println(secondNum);
    }
}