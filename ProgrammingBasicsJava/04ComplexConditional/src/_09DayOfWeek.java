/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:42 ч.
 */

import java.util.Scanner;

public class _09DayOfWeek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int day = Integer.parseInt(console.nextLine());

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error");
        }
    }
}