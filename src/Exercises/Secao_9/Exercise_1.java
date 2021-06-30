package Exercises.Secao_9;

import Util.Bank;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        Bank client = new Bank(account);
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        client.setName(name);
        System.out.print("Is there na initial deposit (y/n)? ");
        char question = sc.next().charAt(0);
        if (question != 'n'){
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            client.setDeposit(deposit);
        }
        System.out.println();
        System.out.println("Account data: " + client);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit= sc.nextDouble();
        client.addDeposit(deposit);
        System.out.println("Updated account data: " + client);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        client.withdraw(deposit);
        System.out.println("Updated account data: " + client);

        sc.close();
    }
}
