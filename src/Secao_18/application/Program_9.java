package Secao_18.application;

import java.util.Map;
import java.util.TreeMap;

public class Program_9 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "999774523");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Size: " + cookies.size());


        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }


    }
}
