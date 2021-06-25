package Exercises.Secao_4;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, Soma;
        A = sc.nextInt();
        B = sc.nextInt();
        Soma = A + B;

        System.out.println("Resultado:" + Soma);

        sc.close();

    }
}
