package Exercises.Secao_6;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite o codigo:");
        int codigo = sc.nextInt();
        int c1, c2, c3;
        c1 = 0;
        c2 = 0;
        c3 = 0;

        while (codigo != 4) {

            if (codigo > 4){
                System.out.println("Digite um novo codigo");
            } else if (codigo == 1){
               c1 = c1 + 1;
            } else if (codigo == 2 ){
               c2  = c2 + 1;
            } else if (codigo == 3){
               c3 = c3 + 1;
            }

            codigo = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + c1);
        System.out.println("Gasolina: " + c2);
        System.out.println("Diesel: " + c3);


        sc.close();
    }
}
