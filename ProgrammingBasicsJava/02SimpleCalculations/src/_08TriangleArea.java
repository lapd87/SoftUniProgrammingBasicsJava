/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:49 ч.
 */

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class _08TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        System.out.printf("Triangle area = %.2f", a*h/2);
    }
}