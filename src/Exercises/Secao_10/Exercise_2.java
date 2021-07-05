package Exercises.Secao_10;

import entities.Employee_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int registered = sc.nextInt();
        List<Employee_2> list = new ArrayList<>();


        for (int i = 0; i < registered; i++){
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list,id)){
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee_2(salary,id, name));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee_2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee_2 obj : list){
            System.out.println(obj);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee_2> list, int id){
        Employee_2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
