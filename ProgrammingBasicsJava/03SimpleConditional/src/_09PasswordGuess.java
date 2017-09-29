/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:36 ч.
 */

import java.util.Scanner;

public class _09PasswordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputPass = console.nextLine();

        String pass = "s3cr3t!P@ssw0rd";

        if (inputPass.equals(pass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}