package Exercises.Secao_10;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?");
        int quantity = sc.nextInt();
        Room[] vect = new Room[10];

        for (int i = 0; i < quantity; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Room(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}
