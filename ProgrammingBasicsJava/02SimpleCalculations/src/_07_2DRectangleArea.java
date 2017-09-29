/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:47 ч.
 */

import java.util.Scanner;

public class _07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        System.out.println(Math.abs(x1-x2)*Math.abs(y1-y2));
        System.out.println((Math.abs(x1-x2)+Math.abs(y1-y2))*2);
    }
}
