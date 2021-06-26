package Exercises.Secao_8;

import entities.Student;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student nota = new Student();
        System.out.println("Digite o nome do aluno");
        String name = sc.next();
        System.out.println("Digite as notas: ");
        nota.grade1 = sc.nextDouble();
        nota.grade2 = sc.nextDouble();
        nota.grade3 = sc.nextDouble();
        System.out.println("FINAL GRADE = " + nota.finalGrade());
        if (nota.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", nota.missingPoint());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
