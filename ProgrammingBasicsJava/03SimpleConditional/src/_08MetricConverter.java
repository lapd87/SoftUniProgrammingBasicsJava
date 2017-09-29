/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 23.8.2017 г.
 * Time: 14:36 ч.
 */

import java.util.HashMap;
import java.util.Scanner;

public class _08MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double distance = Double.parseDouble(console.nextLine());
        String inputDistanceType = console.nextLine().toLowerCase();
        String outputDistanceType = console.nextLine().toLowerCase();

        HashMap<String, Double> distanceConvertor = new HashMap<>();
        distanceConvertor.put("mm", 1000.0);
        distanceConvertor.put("cm", 100.0);
        distanceConvertor.put("mi", 0.000621371192);
        distanceConvertor.put("in", 39.3700787);
        distanceConvertor.put("km", 0.001);
        distanceConvertor.put("ft", 3.2808399);
        distanceConvertor.put("yd", 1.0936133);
        distanceConvertor.put("m", 1.0);

        double result = distance / distanceConvertor.get(inputDistanceType) * distanceConvertor.get(outputDistanceType);

        System.out.printf("%.8f %s", result, outputDistanceType);

    }
}