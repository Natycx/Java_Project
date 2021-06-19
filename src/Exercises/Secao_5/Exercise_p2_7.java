package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Escreva as coordenadas ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        if (x == 0 && y == 0){
            System.out.println("O ponto esta na origem");
        } else if (x > 0 && y > 0){
            System.out.println("O ponto está na intervalo Q1");
        } else if (x < 0 && y >0) {
            System.out.println("O ponto está na intervalo Q2");
        } else if (x < 0 && y < 0){
            System.out.println("O ponto está na intervalo Q3");
        } else if (x > 0 && y < 0){
            System.out.println("O ponto está no intervalo Q4");
        }


        sc.close();
    }
}
