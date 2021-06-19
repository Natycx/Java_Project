package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0){
            System.out.println("Os numeros são multiplos entre si");
        } else {
            System.out.println("Os numeros não são multiplos entre si");
        }


        sc.close();
    }
}
