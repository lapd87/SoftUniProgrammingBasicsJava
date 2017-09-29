/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:42 ч.
 */

import java.util.Scanner;

public class _08TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String city = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());

        double comission = 0.0;

        if (sales < 0) {
            System.out.println("error");
            return;
        } else if (sales <= 500) {
            switch (city) {
                case "sofia":
                    comission = 0.05;
                    break;
                case "varna":
                    comission = 0.045;
                    break;
                case "plovdiv":
                    comission = 0.055;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else if (sales <= 1000) {
            switch (city) {
                case "sofia":
                    comission = 0.07;
                    break;
                case "varna":
                    comission = 0.075;
                    break;
                case "plovdiv":
                    comission = 0.08;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else if (sales <= 10000) {
            switch (city) {
                case "sofia":
                    comission = 0.08;
                    break;
                case "varna":
                    comission = 0.10;
                    break;
                case "plovdiv":
                    comission = 0.12;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        } else {
            switch (city) {
                case "sofia":
                    comission = 0.12;
                    break;
                case "varna":
                    comission = 0.13;
                    break;
                case "plovdiv":
                    comission = 0.145;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        }
        System.out.printf("%.2f", comission * sales);
    }
}