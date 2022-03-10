package Exercises.Secao_15;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String name = sc.next();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        double limit = sc.nextDouble();

        Account account = new Account(number,name,balance,limit);

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }



        sc.close();
    }
}
