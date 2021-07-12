package Program;

import entities.Department;
import entities.HourContract;
import entities.Work;
import entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println();
        System.out.print("Name: ");
        String workName = sc.nextLine();
        System.out.print("Level: ");
        String workLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Work work = new Work(workName, WorkLevel.valueOf(workLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            work.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String mothAndYear = sc.next();
        int moth =Integer.parseInt(mothAndYear.substring(0,2));
        int year = Integer.parseInt(mothAndYear.substring(3));
        System.out.println("Name: " + work.getName());
        System.out.println("Department: " + work.getDepartment().getName());
        System.out.println("Income for " + mothAndYear + ": " + String.format("%.21f", work.income(year, moth)));

        sc.close();
    }
}
