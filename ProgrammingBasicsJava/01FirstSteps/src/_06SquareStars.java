import java.util.Collections;
import java.util.Scanner;

public class _06SquareStars {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String g = String.join("", Collections.nCopies(5, "d"));
String a = String.join("", Collections.nCopies(5, "f"));
        System.out.println(String.join("", Collections.nCopies(n, "*")));
        for (int i = 0; i < n - 2; i++) {
            System.out.println("*" + String.join("", Collections.nCopies(n - 2, " ")) + "*");
        }
        System.out.println(String.join("", Collections.nCopies(n, "*")));
    }
}
