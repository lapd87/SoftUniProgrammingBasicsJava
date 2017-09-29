/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:43 ч.
 */

import java.util.Scanner;

public class _11Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String projection = console.nextLine().toLowerCase();
        int rows = Integer.parseInt(console.nextLine());
        int columns = Integer.parseInt(console.nextLine());

        double price = 0.0;

        switch (projection) {
            case "premiere":
                price = 12.0;
                break;
            case "normal":
                price = 7.5;
                break;
            case "discount":
                price = 5.0;
                break;
            default:
                price = 0.0;
        }

        System.out.printf("%.2f", rows * columns * price);
    }
}