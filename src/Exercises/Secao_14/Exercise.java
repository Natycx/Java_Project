package Exercises.Secao_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");

        List<Product> list = new ArrayList<>();

        int quantity = sc.nextInt();

        for(int i = 1; i <= quantity; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char detail = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(detail == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if (detail == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
            else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
