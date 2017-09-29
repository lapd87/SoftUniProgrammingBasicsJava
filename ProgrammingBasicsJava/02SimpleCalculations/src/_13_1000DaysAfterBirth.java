/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 14:32 ч.
 */

import com.sun.org.apache.xpath.internal.operations.Plus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _13_1000DaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String date = console.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate newDate = LocalDate.parse(date,formatter).plusDays(999);

        System.out.println(newDate.format(formatter));
    }
}