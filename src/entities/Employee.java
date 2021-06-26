package entities;

public class Employee {
    public double grossSalary;
    public double tax;
    public String name;

    public double nextSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentagem){
        grossSalary += grossSalary * percentagem / 100;
    }
    public String toString(){
        return name
             + ", "
             + "$ "
             + nextSalary();
    }

}
