package Exercises.Secao_8;

import entities.Employee;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println(emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentagem = sc.nextDouble();
        emp.increaseSalary(percentagem);

        System.out.println();
        System.out.println("Updated data: " + emp);



        sc.close();
    }
}
