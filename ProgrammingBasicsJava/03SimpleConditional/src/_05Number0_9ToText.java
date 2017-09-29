/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:36 ч.
 */

import java.util.HashMap;
import java.util.Scanner;

public class _05Number0_9ToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number =Integer.parseInt(console.nextLine());

        if (number>0 && number<10){

            HashMap<Integer, String> spellNumber = new HashMap<>();
            spellNumber.put(1, "one");
            spellNumber.put(2,"two");
            spellNumber.put(3,"three");
            spellNumber.put(4,"four");
            spellNumber.put(5,"five");
            spellNumber.put(6,"six");
            spellNumber.put(7,"seven");
            spellNumber.put(8,"eight");
            spellNumber.put(9,"nine");

            System.out.println(spellNumber.get(number));
        }

        else {
            System.out.println("number too big");
        }

    }
}