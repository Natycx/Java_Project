package Program;

import entities.enums.OrderStatus;
import entities.Order_2;

import java.util.Date;

public class Program_6 {
    public static void main(String[] args) {

        Order_2 order = new Order_2(180 , new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

    }
}
