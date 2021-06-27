package Util;

public class Calculation {
    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double volume(double radius){
        return 4 * Math.PI * Math.pow(radius, 3) /3;
    }

}
