/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:43 ч.
 */

import java.util.Scanner;

public class _10AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String animal = console.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }

    }
}