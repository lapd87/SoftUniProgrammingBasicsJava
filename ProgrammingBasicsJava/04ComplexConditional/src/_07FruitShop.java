/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:42 ч.
 */

import java.util.Scanner;

public class _07FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String day = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());

        double price = 0.0;

        if (day.equals("saturday") || day.equals("sunday")) {
            switch (fruit) {
                case "banana":
                    price = 2.7;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.9;
                    break;
                case "grapefruit":
                    price = 1.6;
                    break;
                case "kiwi":
                    price = 3.0;
                    break;
                case "pineapple":
                    price = 5.6;
                    break;
                case "grapes":
                    price = 4.2;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else if (day.equals("monday") ||
                day.equals("tuesday") ||
                day.equals("wednesday") ||
                day.equals("thursday") ||
                day.equals("friday")) {
            switch (fruit) {
                case "banana":
                    price = 2.5;
                    break;
                case "apple":
                    price = 1.2;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.7;
                    break;
                case "pineapple":
                    price = 5.5;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else {
            System.out.println("error");
            return;
        }
        System.out.println(price * quantity);
    }
}