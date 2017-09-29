/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 5.9.2017 г.
 * Time: 14:52 ч.
 */

import java.util.Scanner;

public class _11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter even number: ");

                int n = Integer.parseInt(console.nextLine());

                if (n % 2 != 0) {
                    System.out.println("The number is not even: ");
                } else {
                    System.out.println("Even number entered: " + n);
                    break;
                }
            } catch (Exception A){
                System.out.println("Invalid number!");
            }
        }
    }
}