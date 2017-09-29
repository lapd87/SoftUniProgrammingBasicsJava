/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:41 ч.
 */

import java.util.Scanner;

public class _04ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",
                            firstName,lastName,age,town);
    }
}
