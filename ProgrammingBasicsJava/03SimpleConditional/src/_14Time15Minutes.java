/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:38 ч.
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class _14Time15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String hours = console.nextLine();
        String minutes = console.nextLine();

        String time = hours + ":" + minutes;

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("H:m");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:mm");
        LocalTime newTime = LocalTime.parse(time, formatter1).plusMinutes(15);

        System.out.println(newTime.format(formatter2));
    }
}