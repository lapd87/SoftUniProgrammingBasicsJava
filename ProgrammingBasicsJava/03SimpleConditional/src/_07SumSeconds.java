/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:36 ч.
 */

import java.util.Scanner;

public class _07SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int person1 = Integer.parseInt(console.nextLine());
        int person2 = Integer.parseInt(console.nextLine());
        int person3 = Integer.parseInt(console.nextLine());

        int seconds = person1+person2+person3;

        int minutes = seconds/60;
        seconds = seconds-minutes*60;

        System.out.printf("%d:%02d",minutes,seconds);
    }
}