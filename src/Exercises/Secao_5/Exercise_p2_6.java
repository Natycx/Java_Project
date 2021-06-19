package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           double x;
           System.out.println("Digite o valor: ");
           x = sc.nextDouble();
           if (x < 50 && x > 25){
               System.out.println("Intervalo entre (20,50)");
           } else if (x <= 25){
               System.out.println("Intervalo entre (0,25)");
           } else if (x <= 100 && x >=75) {
               System.out.println("Intervalo entre (75,100)");
           } else {
               System.out.println("Fora do intervalo");
           }

         sc.close();
    }
}
