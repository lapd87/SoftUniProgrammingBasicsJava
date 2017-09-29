/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:38 ч.
 */

import java.util.Scanner;

public class _02InchToCm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double inches = Double.parseDouble(console.nextLine());
        System.out.println(inches*2.54);
    }
}
