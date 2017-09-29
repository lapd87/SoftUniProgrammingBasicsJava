/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:42 ч.
 */

import java.util.Scanner;

public class _06PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());

        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if (((x == x1 || x == x2) && y >= y1 && y <= y2) ||
                ((y == y1 || y == y2) && x >= x1 && x <= x2)) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}