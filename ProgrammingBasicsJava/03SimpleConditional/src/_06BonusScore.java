/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:36 ч.
 */

import java.util.Scanner;

public class _06BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int points = Integer.parseInt(console.nextLine());

        double bonus = 0;

        if (points<=100){
            bonus=5;
        }
        else if(points <=1000){
            bonus = 0.2 * points;
        }
        else {
            bonus=0.1*points;
        }
        if (points%2==0){
            bonus+=1;
        }
        if (points%10==5){
            bonus+=2;
        }

        System.out.println(bonus);
        System.out.println(bonus+points);


    }
}