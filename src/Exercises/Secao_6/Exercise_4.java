package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
