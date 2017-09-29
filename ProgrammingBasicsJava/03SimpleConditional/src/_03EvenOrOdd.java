/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:35 ч.
 */

import java.util.Scanner;

public class _03EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if ( number %2 ==0){
            System.out.println("even");
        }
        else      {
            System.out.println("odd");
        }

    }
}