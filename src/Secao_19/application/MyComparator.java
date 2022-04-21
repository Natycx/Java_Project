package Secao_19.application;

import Secao_19.entities.Product;

import java.util.Comparator;
import java.util.Locale;

public class MyComparator implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
