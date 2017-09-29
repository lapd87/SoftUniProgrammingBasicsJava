/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 12:39 ч.
 */

import java.util.Scanner;

public class _03GreetingByName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
