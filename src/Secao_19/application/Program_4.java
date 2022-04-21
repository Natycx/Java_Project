package Secao_19.application;

import Secao_19.entities.Product;
import Secao_19.util.UpperCaseName;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program_4 {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.50));
        lista.add(new Product("HD Case", 80.90));

        /* List<String> names= lista.stream().map(new UpperCaseName()).collect(Collectors.toList());
       names.forEach(System.out::println);

        List<String> names= lista.stream().map(Product :: noStaticUpperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);
        */

        List<String> names= lista.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
