package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double divisao = 0;
        for (double i = 0; i < n; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            divisao = x / y;

            if (y == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.println(divisao);
            }

        }
        sc.close();
    }
}
