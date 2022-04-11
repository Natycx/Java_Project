package Secao_17;

import Secao_17.model.entities.CarRental;
import Secao_17.model.entities.Vehicle;
import Secao_17.model.services.BrazilTaxService;
import Secao_17.model.services.RentalService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf.parse(sc.nextLine());


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic payment: "+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("tax: "+ String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: "+ String.format("%.2f", cr.getInvoice().getTotalPayment()));



        sc.close();
    }
}
