package Exercises.Secao_4;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nf, nt, vh, sf;
        nf = sc.nextDouble();
        nt = sc.nextDouble();
        vh = sc.nextDouble();
        sf = nt * vh;
        System.out.println("Quantidade de funcionarios na empresa: " + nf);
        System.out.printf("O salario desse funcionario é %.2f%n", sf);


        sc.close();
    }
}
