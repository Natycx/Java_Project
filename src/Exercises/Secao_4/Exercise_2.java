package Exercises.Secao_4;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, pi, raio;
        pi = Math.PI;
        raio = sc.nextDouble();
        area = pi *  Math.pow(raio, 2);
        System.out.printf("Resultado: %.4f centimetros%n", area);


        sc.close();
    }
}
