/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:43 ч.
 */

import java.util.Scanner;

public class _12Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String yearType = console.nextLine();
        int holidays = Integer.parseInt(console.nextLine());
        int travelWeekends = Integer.parseInt(console.nextLine());

        double games = (48 - travelWeekends) * 3 / 4.0 + holidays * 2 / 3.0 + travelWeekends;

        if (yearType.equals("leap")) {
            games *= 1.15;
        }

        System.out.println(Math.floor(games));
    }
}