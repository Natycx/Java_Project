package Secao_18.Exercises;

import Secao_18.Exercises.entities.Curso;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Curso> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int numberA = sc.nextInt();

        for (int i = 0; i < numberA; i++){
            int code = sc.nextInt();
            set.add(new Curso(code));
        }
        System.out.print("How many students for course B? ");
        int numberB = sc.nextInt();

        for (int i = 0; i < numberB; i++){
            int code = sc.nextInt();
            set.add(new Curso(code));
        }
        System.out.print("How many students for course C? ");
        int numberC = sc.nextInt();

        for (int i = 0; i < numberC; i++){
            int code = sc.nextInt();
            set.add(new Curso(code));
        }
        System.out.print("Total students: " + set.size());


        sc.close();
    }
}
