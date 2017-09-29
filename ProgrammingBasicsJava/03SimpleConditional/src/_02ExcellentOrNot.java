/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:35 ч.
 */

import java.util.Scanner;

public class _02ExcellentOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade =Double.parseDouble(console.nextLine());

        if (grade>=5.5){
            System.out.println("Excellent!");
        }
        else  {
            System.out.println("Not excellent.");
        }

    }
}