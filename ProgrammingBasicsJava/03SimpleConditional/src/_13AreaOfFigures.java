/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:37 ч.
 */

import java.util.Scanner;

public class _13AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figureType = console.nextLine().toLowerCase();

        if (figureType.equals("square")) {
            double squareSide = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", squareSide * squareSide);

        } else if (figureType.equals("rectangle")) {
            double rectangleFirstSide = Double.parseDouble(console.nextLine());
            double rectangleSecondSide = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", rectangleFirstSide * rectangleSecondSide);

        } else if (figureType.equals("circle")) {
            double circleRadius = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", circleRadius * circleRadius * Math.PI);

        } else if (figureType.equals("triangle")) {
            double triangleSide = Double.parseDouble(console.nextLine());
            double triangleHeight = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", triangleSide * triangleHeight / 2.0);
        }
    }
}