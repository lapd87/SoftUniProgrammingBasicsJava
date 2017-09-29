/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:43 ч.
 */

import java.util.Scanner;

public class _13PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int h = Integer.parseInt(console.nextLine());

        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        if ((x >= 0 && x <= 3 * h && y >= 0 && y <= h)
                || (x >= h && x <= 2 * h && y >= h && y <= 4 * h)) {
            if ((x > 0 && x < 3 * h && y > 0 && y < h)
                    || (x > h && x < 2 * h && y > h && y < 4 * h)) {
                System.out.println("inside");
            } else {
                if (x > h && x < 2 * h && y == h) {
                    System.out.println("inside");
                } else {
                    System.out.println("border");
                }
            }
        } else {
            System.out.println("outside");
        }
    }
}