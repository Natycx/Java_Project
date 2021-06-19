package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado;
        numero = sc.nextInt();
        resultado = numero % 2;
        if (resultado != 0) {
            System.out.println("O numero é impar!");
        } else {
            System.out.println("O numero é par!");
        }


    }
}
