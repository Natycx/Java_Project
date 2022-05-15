package Secao_19.Exercise.program;


import Secao_19.Exercise.entities.Employe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employe> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(",");
                list.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " + salary);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(Employe::getEmail)
                    .sorted(comp)
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(Employe::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
        }
        catch (IOException e){
            System.out.println("ERROR " + e.getMessage());
        }
        sc.close();
    }
}
