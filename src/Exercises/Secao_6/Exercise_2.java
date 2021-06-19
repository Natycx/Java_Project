package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva as coordenadas: ");

        int y = sc.nextInt();
        int x = sc.nextInt();

        while (x != 0 && y !=0) {
            if (x > 0 && y > 0) {
                System.out.println("O ponto está na intervalo Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("O ponto está na intervalo Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("O ponto está na intervalo Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("O ponto está no intervalo Q4");
            }
                x = sc.nextInt();
                y = sc.nextInt();
        }

        sc.close();
    }
}
