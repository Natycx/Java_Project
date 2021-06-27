package Program;

import Util.Calculation;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");

        double radius = sc.nextDouble();
        double c = Calculation.circumference(radius);
        double v = Calculation.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Math.PI);

        sc.close();
    }

}
