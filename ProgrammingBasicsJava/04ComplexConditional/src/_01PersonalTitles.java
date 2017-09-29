/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:41 ч.
 */

import java.util.Scanner;

public class _01PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine().toLowerCase();

        if (age < 16) {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        } else {
            if (gender.equals("f")) {
                System.out.println("Ms.");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}