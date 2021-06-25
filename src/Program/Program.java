package Program;

import entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas do Triangulo A");

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digiete as medidas do Triangulo B");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaA = x.area();
        double areaB = y.area();

        System.out.println("O valor da area do triangulo A é: " + areaA);
        System.out.println("O valor da area do triangulo B é: " + areaB);
        if (areaA > areaB){
            System.out.printf("O triango com maior area é o: %.2f%n", areaA);
        } else {
            System.out.printf("O triango com maior area é o: %.2f%n", areaB);
        }

        sc.close();
    }
}
