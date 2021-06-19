package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C1, C2, C3, C4, C5, resultado;
        int codigo, quantidade;
        C1 = 4.00;
        C2 = 4.50;
        C3 = 5.00;
        C4 = 2.00;
        C5 = 1.50;
        System.out.println("Escolha um codigo: ");
        codigo = sc.nextInt();
        if (codigo > 5){
            System.out.println("Codigo não disponivel!");
            System.out.println("Escolha novamente um codigo de 1 a 5!");
            codigo = sc.nextInt();
        }
        System.out.println("Escolha a quantidade");
        quantidade = sc.nextInt();
        if (codigo == 1){
            resultado = C1 * quantidade;
        } else if (codigo == 2){
            resultado = C2 * quantidade;
        } else if (codigo == 3) {
            resultado = C3 * quantidade;
        } else if (codigo == 4) {
            resultado = C4 * quantidade;
        } else {
            resultado = C5 * quantidade;
        }
        System.out.printf("Total a pagar: R$ %.2f%n", resultado);


        sc.close();
    }
}
