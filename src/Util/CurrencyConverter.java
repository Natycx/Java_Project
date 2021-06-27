package Util;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double dollarConversion(double price, double dollar){
        return price * dollar * (1 + IOF);
    }
}
