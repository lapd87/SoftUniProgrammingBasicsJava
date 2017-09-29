/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:39 ч.
 */

import java.util.IllegalFormatFlagsException;
import java.util.Scanner;

public class _16Number0_100ToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        String[] toNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] toNinety = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


        if (number < 0 || number > 100) {
            System.out.println("invalid number");
        } else if (number >= 0 && number < 20) {
            System.out.println(toNineteen[number]);
        } else if (number >= 20 && number < 100) {
            int digits = number % 10;
            int decimals = number / 10;

            if (digits == 0) {
                System.out.println(toNinety[decimals - 2]);
            } else {
                System.out.println(toNinety[decimals - 2] + " " + toNineteen[digits]);
            }
        } else {
            System.out.println("one hundred");
        }

    }
}