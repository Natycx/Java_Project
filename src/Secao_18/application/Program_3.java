package Secao_18.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_3 {
    public static void main(String[] args) {


        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);

    }
    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
