package Exercises.Secao_4;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, v1, n2, v2, resultado;
        int p1, p2;
        p1 = sc.nextInt();
        n1 = sc.nextDouble();
        v1 = sc.nextDouble();
        p2 = sc.nextInt();
        n2 = sc.nextDouble();
        v2 = sc.nextDouble();
        resultado = (n1 * v1) + (n2 * v2);
        System.out.printf("Valor a ser pago: R$ %.2f%n", resultado);


        sc.close();
    }
}
