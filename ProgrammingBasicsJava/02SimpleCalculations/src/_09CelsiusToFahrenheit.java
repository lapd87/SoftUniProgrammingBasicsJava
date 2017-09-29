/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 14:31 ч.
 */

import java.util.Scanner;

public class _09CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double celsius = Double.parseDouble(console.nextLine());

        System.out.println(celsius * 9 / 5 + 32);
    }
}