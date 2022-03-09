package Exercises.Secao_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list  = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #"+ i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name, anualIncome,healthExpenditure));
            } else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add(new Company(name, anualIncome, employee));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");

        for(TaxPayer cont : list){
            System.out.println(cont.getName() + ": $ " + cont.tax());
        }
        double total = 0;
        for(TaxPayer cont : list){
            total += cont.getAnualIncome();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));


        sc.close();
    }
}
