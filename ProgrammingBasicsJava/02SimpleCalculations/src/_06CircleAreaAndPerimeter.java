/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:43 ч.
 */

import java.util.Scanner;

public class _06CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());

        System.out.println("Area = " + Math.PI*r*r);
        System.out.println("Perimeter = " + Math.PI*2*r);
    }
}
