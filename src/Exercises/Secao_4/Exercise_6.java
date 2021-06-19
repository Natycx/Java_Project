package Exercises.Secao_4;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        pi = Math.PI;
        areaTriangulo = A * C / 2;
        areaCirculo = pi * Math.pow(C, 2.0);
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = Math.pow(B, 2.0);
        areaRetangulo = A * B;
        System.out.printf("Area do triangulo: %.4f centimentros%n", areaTriangulo);
        System.out.printf("Area do circulo: %.4f centimentros%n", areaCirculo);
        System.out.printf("Area do trapezio: %.4f centimentros%n", areaTrapezio);
        System.out.printf("Area do quadrado: %.4f centimentros%n", areaQuadrado);
        System.out.printf("Area do retangulo: %.4f centimentros%n", areaRetangulo);



        sc.close();
    }
}
