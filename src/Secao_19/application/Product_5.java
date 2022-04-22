package Secao_19.application;

import Secao_19.entities.Product;
import Secao_19.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Product_5 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
