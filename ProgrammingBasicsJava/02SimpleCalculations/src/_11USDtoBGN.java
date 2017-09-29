/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 14:32 ч.
 */

import java.util.Scanner;

public class _11USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double usd = Double.parseDouble(console.nextLine());

        System.out.println(Math.round(usd * 1.79549 * 100) / 100.0);
    }
}