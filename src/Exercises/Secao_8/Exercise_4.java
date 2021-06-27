package Exercises.Secao_8;

import Util.CurrencyConverter;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();
        double result = CurrencyConverter.dollarConversion(price, dollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);


        sc.close();
    }
}
