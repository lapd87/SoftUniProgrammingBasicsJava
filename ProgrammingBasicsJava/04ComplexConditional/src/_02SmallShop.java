/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:41 ч.
 */

import java.util.Scanner;

public class _02SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine().toLowerCase();
        String city = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());

        String cityProduct = city + product;
        double price;

        switch (cityProduct) {
            case "sofiacoffee":
                price = 0.5;
                break;
            case "sofiawater":
                price = 0.8;
                break;
            case "sofiabeer":
                price = 1.2;
                break;
            case "sofiasweets":
                price = 1.45;
                break;
            case "sofiapeanuts":
                price = 1.6;
                break;
            case "plovdivcoffee":
                price = 0.4;
                break;
            case "plovdivwater":
            case "varnawater":
                price = 0.7;
                break;
            case "plovdivbeer":
                price = 1.15;
                break;
            case "plovdivsweets":
                price = 1.30;
                break;
            case "plovdivpeanuts":
                price = 1.50;
                break;
            case "varnacoffee":
                price = 0.45;
                break;
            case "varnabeer":
                price = 1.1;
                break;
            case "varnasweets":
                price = 1.35;
                break;
            case "varnapeanuts":
                price = 1.55;
                break;
            default:
                price = 0.0;
        }
        System.out.println(price * quantity);
    }
}