/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 20.8.2017 г.
 * Time: 14:06 ч.
 */

import java.util.Scanner;

public class _01ExcellentResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());

        if (grade>=5.5){
            System.out.println("Excellent!");
        }

    }
}