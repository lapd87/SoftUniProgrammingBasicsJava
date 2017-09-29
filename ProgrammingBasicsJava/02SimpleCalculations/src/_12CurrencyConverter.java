/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 14:32 ч.
 */

import java.util.HashMap;
import java.util.Scanner;

public class _12CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double amount = Double.parseDouble(console.nextLine());
        String inputCurrency = console.nextLine().toUpperCase();
        String outputCurrency = console.nextLine().toUpperCase();

        HashMap<String, Double> currency = new HashMap<>();
        currency.put("BGN", 1.0);
        currency.put("USD", 1.79549);
        currency.put("EUR", 1.95583);
        currency.put("GBP", 2.53405);

        double result = amount * currency.get(inputCurrency) / currency.get(outputCurrency);
        System.out.printf("%.2f %s", result, outputCurrency);
    }
}