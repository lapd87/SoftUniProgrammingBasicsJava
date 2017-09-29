/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:37 ч.
 */

import java.util.Scanner;

public class _11EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.nextLine().toLowerCase();
        String secondWord = console.nextLine().toLowerCase();

        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}