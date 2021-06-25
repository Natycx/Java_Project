package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        int valor = sc.nextInt();

        for( int i = 1; i <= valor; i++ )
        {
            fat *= i;
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fat );

        sc.close();
    }
}
