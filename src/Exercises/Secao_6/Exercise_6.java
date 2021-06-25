package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double media = 0;
        for (double i = 0; i < n; i++){
            double x = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            media = (x * 2 + x2 * 3 + x3 * 5) / 10 ;
            System.out.printf("%.1f%n", media);

        }
        sc.close();
    }
}
