package Secao_17;

import Secao_17.model.entities.AbstractSHape;
import Secao_17.model.entities.Circle;
import Secao_17.model.entities.Rectangle;
import Secao_17.model.entities.Shape;
import Secao_17.model.enums.Color;

public class Program_2 {
    public static void main(String[] args) {

        AbstractSHape s1 = new Circle(Color.BLACK,2.0);
        AbstractSHape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectamgle area: " + String.format("%.3f", s2.area()));


    }
}
