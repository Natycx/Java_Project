package Secao_17.model.entities;

import Secao_17.model.enums.Color;

public class Circle extends AbstractSHape{

    private Double radius;


    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return  Math.PI * radius * radius;
    }
}
