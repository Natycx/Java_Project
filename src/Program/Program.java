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

        double p = (x.a + x.b + x.c) / 2;
        double areaA = Math.sqrt(p*(p - x.a)*(p - x.b)*(p - x.c)) ;
        double q = (y.a + y.b + y.c) / 2;
        double areaB = Math.sqrt(q*(q - y.a)*(q - y.b)*(q - y.c)) ;
        System.out.println("O valor da area do triangulo A é: " + areaA);
        System.out.println("O valor da area do triangulo B é: " + areaB);
        if (areaA > areaB){
            System.out.printf("P triango com maior area é o: %.2f%n", areaA);
        } else {
            System.out.printf("P triango com maior area é o: %.2f%n", areaB);
        }

        sc.close();
    }
}
