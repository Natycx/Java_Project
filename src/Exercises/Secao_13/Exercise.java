package Exercises.Secao_13;

import entities.Client;
import entities.OrderItem;
import entities.Order_3;
import entities.Product_2;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        Client client = new Client(name, email, date);
        System.out.println("Enter order data: ");
        System.out.println();
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order_3 order = new Order_3(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Product name: ");
            sc.next();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            Product_2 product = new Product_2(productName,productPrice);
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);



        sc.close();
    }
}
