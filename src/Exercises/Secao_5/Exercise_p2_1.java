package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        System.out.println("Digite um numero:");
        if (numero > 0){
            System.out.println("O numero é positivo!");
        } else {
            System.out.println("O numero é negativo!");
        }

        sc.close();
    }
}
