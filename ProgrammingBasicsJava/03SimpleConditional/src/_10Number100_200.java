/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:37 ч.
 */

import java.util.Scanner;

public class _10Number100_200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }

    }
}