package Exercises.Secao_8;

import entities.Rectangle;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        Rectangle x = new Rectangle();
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.println("AREA = " + x.area());
        System.out.println("PERIMETER = " + x.perimeter());
        System.out.println("DIAGONAL = " + x.diagonal());
        System.out.println();
        System.out.println();

        sc.close();
    }
}
