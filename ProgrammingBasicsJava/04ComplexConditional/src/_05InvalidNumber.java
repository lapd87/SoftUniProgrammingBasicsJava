/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 3.9.2017 г.
 * Time: 09:42 ч.
 */

import java.util.Scanner;

public class _05InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if ((number<100 || number>200) && number!=0){
            System.out.println("invalid");
        }
    }
}