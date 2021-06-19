package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, duracao;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A < B){
            duracao = B - A;
        } else {
            duracao = 24 - A + B;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }
}
