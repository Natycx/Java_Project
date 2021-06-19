package Exercises.Secao_5;

import java.util.Scanner;

public class Exercise_p2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double salario, resultado, taxaImposto8, imposto, impostofinal;
         System.out.println("Digite o valor do salario");
         salario = sc.nextDouble();
         if (salario <= 2000){
             System.out.println("Insento");
         } else if (salario <= 3000 && salario > 2000){
             resultado = (salario - 2000);
             imposto = resultado * 8 /100;
             System.out.printf("O valor do imposto a pagar é R$ %.2f%n", imposto);
         } else if (salario <= 4500  && salario > 3000) {
             resultado = (salario - 3000);
             taxaImposto8 = 1000 * 8 / 100;
             imposto = resultado * 18 /100;
             impostofinal = taxaImposto8 + imposto;
             System.out.printf("O valor do imposto a pagar é R$ %.2f%n", impostofinal);
         } else {
             resultado = (salario - 3000);
             taxaImposto8 = 1000 * 8 / 100;
             imposto = resultado * 28 /100;
             impostofinal = taxaImposto8 + imposto;
             System.out.printf("O valor do imposto a pagar é R$ %.2f%n", impostofinal);
         }

        sc.close();
    }
}
