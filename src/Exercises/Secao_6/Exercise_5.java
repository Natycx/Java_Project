package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;
        int soma2 = 0;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                soma = soma + 1;
            } else {
                soma2 += 1;
            }
        }
        System.out.println(soma + " in");
        System.out.println(soma2 + " out");

        sc.close();
    }
}
